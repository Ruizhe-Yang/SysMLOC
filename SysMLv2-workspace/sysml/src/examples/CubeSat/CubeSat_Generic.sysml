//CODES: CubeSat-Oriented Design & Engineering using SysML v2
package CubeSat_Generic {
   /* 1.1 端口与物料 */
   item def Power;          // 总线功率
   item def TelemetryData;  // 遥测
   item def CommandData;    // 下行/上行指令
   item def ThermalFlux;    // 热量
   item def Momentum;       // 动量（姿控）
   port def PwrOut { 
      out item pwr : Power; 
   }
   port def PwrIn {
      in item pwr : Power; 
   }
   port def DataTx { 
      out item tm : TelemetryData; 
   }
   port def DataRx {  
      in item cmd : CommandData; 
   }

  /* 1.2 核心分系统定义 */
   abstract part def Subsystem;   // 统一父类，便于后续约束/枚举

   part def Structure :> Subsystem; // 机械、面板
   part def EPS :> Subsystem { // 电源系统
      port pwrOut : PwrOut;
   }
   part def SolarArray :> Subsystem {
    port pwrOut : PwrOut;
   }
   part def Battery :> Subsystem {
      port pwrOut : PwrOut;
   }
   part def ADCS :> Subsystem {
      port momOut { 
         out item mom : Momentum; 
      }
   }
   part def CnDH :> Subsystem {  // Command & Data Handling
      port dataTx : DataTx;
      port dataRx : DataRx;
   }
   part def Comms :> Subsystem {
      port busTx : DataTx; // 下行
      port busRx : DataRx; // 上行
   }
   part def Payload :> Subsystem;
   part def Thermal :> Subsystem {
      port heatOut { 
         out item q : ThermalFlux; 
      }
   }
   part def Propulsion :> Subsystem; // 如需，可在变体配置中选择是否存在

   /* 1.3 CubeSat 本体 */
   part def CubeSat {

      /* 结构化分解（组合） */
      part struct : Structure;
      part solar : SolarArray;
      part battery : Battery;
      part eps : EPS;
      part adcs : ADCS;
      part cndh : CnDH;
      part comms : Comms;
      part payload : Payload;
      part thermal : Thermal;
      part propulsion : Propulsion[0..1];   // 可选

      /* 关键连接 */
      // 太阳能板 & 电池 --> EPS
      connect solar.pwrOut to eps.pwrOut;
      connect battery.pwrOut to eps.pwrOut;

      // EPS 给全船供电（示例：到 C&DH、ADCS、Comms、Payload）
      connect eps.pwrOut to cndh.dataTx;
      connect eps.pwrOut to adcs.momOut;
      connect eps.pwrOut to comms.busTx;
      // connect eps.pwrOut to payload.pwrIn;

      // C&DH<>Comms：数据上下行
      connect cndh.dataTx to comms.busTx;
      connect comms.busRx to cndh.dataRx;

      // ADCS 输出姿态控制量给结构或执行机构（此处简化为连接到结构）
      connect adcs.momOut to struct;

      // Thermal 模块收集各分系统热流（例示）
      connect payload to thermal.heatOut;
      connect eps to thermal.heatOut;
   }
}
