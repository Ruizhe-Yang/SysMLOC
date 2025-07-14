package 'Cubesat-1 Architecture' {
  //———分系统占位定义（后续迭代可继续分解）———————
  part def StructuralSubsystem;

  part def ElectricalPowerSubsystem {
    port powerOut;
    /* 典型组件：太阳翼、功率板、电池 */
    part solar   : SolarArray;
    part psu     : PowerSupplyBoard;
    part battery : Battery;
  }

  part def ADCSSubsystem {
    port powerIn; 
    port dataBus;
    part gyro        : Gyro;
    part mtq         : Magnetorquer;
    part rw          : ReactionWheel;
    part sunSensor   : SunSensor;
    part magnetometer: Magnetometer;
  }

  part def OBCSubsystem {
    port powerIn;
    port dataBus;
    part cpu    : OnBoardComputer;
    part gps    : GPSReceiver;
  }

  part def TTandCSubsystem {
    port powerIn;  
    port dataBus;
    part txrx    : Transceiver;
    part antenna : Antenna;
  }

  part def INMSPayload {
    port powerIn;  
    port dataBus;
    // QB50 提供的 INMS Science Unit
  }

  part def ThermalControlSubsystem {
    port powerIn;
    // 暂留：温控涂层、热模拟点位等
  }

  part def GroundSegment {
    part groundStation : GroundStation;
  }

  //低层组件占位
  part def SolarArray;          
  part def PowerSupplyBoard;  
  part def Battery;
  part def Gyro;                
  part def Magnetorquer;      
  part def ReactionWheel;
  part def SunSensor;           
  part def Magnetometer;
  part def OnBoardComputer;     
  part def GPSReceiver;
  part def Transceiver;         
  part def Antenna;
  part def GroundStation;

  part def CubeSat2U {

    /* 功率与数据骨干总线 */
    port powerBus;
    port dataBus;

    /* 主要分系统 */
    part structure  : StructuralSubsystem;
    part eps        : ElectricalPowerSubsystem;
    part adcs       : ADCSSubsystem;
    part obc        : OBCSubsystem;
    part ttandc     : TTandCSubsystem;
    part payload    : INMSPayload;
    part thermal    : ThermalControlSubsystem;

    /* 地面段 */
    ref part ground : GroundSegment;

    //———示例连接（骨架级别，后续可细化为端口/接口连接）———
    // connection powerDistribution connect eps.powerOut to structure,adcs,obc.powerIn,payload.powerIn,thermal.powerIn;
    // connection dataNetwork connect obc.dataBus to adcs.dataBus,ttandc.dataBus, payload.dataBus;
    
  }
}
