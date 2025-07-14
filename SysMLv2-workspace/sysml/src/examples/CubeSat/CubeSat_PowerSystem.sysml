package CubeSat_PowerSystem {

    public import SI::*;
    public import ScalarValues::*;
    public import CubeSat_Generic::*;

    /* 1.1 专用量纲 */
    attribute def Energy;
    attribute def Voltage;
    attribute def Current; 
    port def PowerOut { 
        out item pwr : Power; 
    }
    port def PowerIn {  
        in item pwr : Power; 
    }

  /* 1.2 子系统定义 */
  /* 太阳能电池阵列 */
  part def SolarArray :> Subsystem {
     attribute area : Real; // m²
     attribute efficiency : Real = 0.30; // 转换效率
     attribute maxPower; // W
     port pwrOut : PowerOut;
  }

  /* 电池组 */
  part def Battery :> Subsystem {
     attribute capacity; // 额定容量，Wh
     attribute soc : Real = 0.8; // 初始荷电状态 (0–1)
     attribute voltageNom : Voltage = 8.4[V];
     attribute maxDischarge: Current = 4.0[A];
     port chargeIn : PowerIn;
     port dischargeOut : PowerOut;
  }

  /* EPS / PCDU（配电与充放电控制单元） */
  part def EPS :> Subsystem {
     attribute busVoltage : Voltage = 5.0[V];
     attribute eff : Real = 0.92; // 配电效率
     port solarIn : PowerIn;
     port battIn : PowerIn;
     port busOut : PowerOut;
  }

  /* 1.3 能源架构实例 */
  part def PowerSubsystem {

    part solar : SolarArray {
       attribute area = 0.03; // 3U 例：0.03 m²
       attribute maxPower = 8[W];
    }

    part battery : Battery {
       attribute capacity = 20[W];
    }

    part eps : EPS;

    /* 关键连接 */
    connect solar.pwrOut to eps.solarIn; // 太阳阵列 → EPS
    connect battery.chargeIn to eps.battIn; // 电池充电 → EPS
    connect eps.busOut to externalPwrBus;  // EPS → 负载母线
    connect battery.dischargeOut to eps.battIn; // 放电经 EPS 配电

    /* 对外暴露供电端口（给整星使用） */
    port externalPwrBus : PowerOut;

  }
}

package CubeSat_PowerSystem_Analysis {

    public import CubeSat_PowerSystem::*;
    public import SI::*;

    /* 2.1 功率平衡方程 */
    constraint def PowerBalance {
        in P_gen : Power;     // Solar
        in P_load : Power;     // 星上负载
        in P_chg : Power;     // 充电功率 (≥0)
        in eff : Real;
        P_gen * eff == P_load + P_chg 
    }

    /* 2.2 SOC */
    constraint def SOC_Update {
        in  soc_prev : Real;
        in  P_chg : Power;
        in  P_dis : Power;
        in  dt : Real;     // h
        in  C : Energy;   // Wh
        out soc_new : Real;
        soc_new == soc_prev + (P_chg - P_dis) * dt / C and
        0.2 <= soc_new <= 1.0
    }

    /* 2.3 分析动作 */
    action def PowerStep {
        in  loadProfile : Power;          // 当前负载
        in  dt : Real = 0.02;    // 0.02 h ≈ 72 s
        ref ps : PowerSubsystem;

        /* 计算可用发电功率（简化：恒定） */
        attribute P_gen = ps.solar.maxPower;

        /* 基于 bus 与负载估算充/放电 */
        attribute P_need  = loadProfile - P_gen * ps.eps.eff;
        // attribute P_chg   = if P_need < 0 then ~P_need else 0[W];
        // attribute P_dis   = if P_need > 0 then  P_need else 0[W];

        assert constraint balance : PowerBalance {
            in P_gen = P_gen;
            in P_load = loadProfile;
            in P_chg = P_chg;
            in eff = ps.eps.eff;
        }

        assert constraint socUpd : SOC_Update {
            in soc_prev = ps.battery.soc;
            in P_chg = P_chg;
            in P_dis = P_dis;
            in dt = dt;
            in C = ps.battery.capacity;
            out soc_new = ps.battery.soc;
        }
    }

    /* 2.4 典型日轨功率分析 */
    analysis def DayOrbitPowerAnalysis {
        ref ps : PowerSubsystem;
        /* 可灵活导入功耗序列，此处省略 */
        perform action PowerStep;  // 多次迭代可用 loop/fork 实现
    }
}
