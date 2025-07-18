package CubeSat_Base{
    public import SI::*;
    public import ISQ::*;
    public import ScalarValues::*;
    public import ShapeItems::*;
    public import SpatialItems::*;
    public import RealFunctions::*;
    // private import MeasurementReferences::CoordinateFrame;
    public import MeasurementReferences::TranslationRotationSequence;
    public import MeasurementReferences::Translation;
    public import MeasurementReferences::Rotation;

    abstract part def BaseComponent{
        attribute sysType : SystemType;
        attribute mass : ISQ::MassValue;
        attribute massError : ISQ::MassValue;
    }

    part def EntityComponent :> BaseComponent, SpatialItem{
        attribute tupper : ISQ::ThermodynamicTemperatureValue;
        attribute tlower : ISQ::ThermodynamicTemperatureValue;
        attribute material : Material[1..*];
        attribute price : Natural;
        attribute vendor : String[1..*];
        attribute geometricCenter : CartesianPosition3dVector;
        attribute gravityCenter : CartesianPosition3dVector;
    }

    part def FunctionComponent :> EntityComponent{
        port powerEnd : PowerEnd [0..*];
        port dataEnd : DataEnd [0..*];
    }

    abstract port def PortComponent :> BaseComponent;
    port def PowerEnd :> PortComponent;
    port def DataEnd :> PortComponent{
        attribute BAUDRate : Natural;
        attribute dataWidth : ISQ::StorageCapacityValue;
        attribute parityBit : Boolean;
        attribute STARTBit : ISQ::StorageCapacityValue;
        attribute STOPBit : ISQ::StorageCapacityValue;
    }

    flow def PowerLine{
		ref :>> payload : ElectricPower;
		end in source : PowerEnd;
		end out target : PowerEnd;
	}

    interface def DataLine{
        end port a : DataEnd;
        end port b : DataEnd;
    }

    part def CubeSatEntity :> FunctionComponent{
        part sys : BaseComponent [1];
        part ss : EntityComponent [1..*];
        part pay : FunctionComponent [0..*];
        part adcs : FunctionComponent [1..*];
        part eps : FunctionComponent [1..*];
        part obdh : FunctionComponent [1..*];
        part comm : FunctionComponent [1..*];
        part tcs : FunctionComponent [0..*];
        part dep : FunctionComponent [0..1];
        part prop : FunctionComponent [0..*];
        part gs : FunctionComponent [0..*];
        part others : FunctionComponent [0..*]; 
    }

    enum def CurrentType{
        enum DC;
        enum AC;
    }

    item def ElectricPower{
        attribute current : ElectricCurrentValue;
        attribute voltage : SourceVoltageValue;
        attribute type : CurrentType;
    }
    
    attribute def Material{
        attribute name : String;
        attribute mechanicalProperty{
            attribute youngsModule : ISQ::ModulusOfElasticityValue;
            attribute yieldStress : ISQ::NormalStressValue;
            attribute ultimateStrength : ISQ::NormalStressValue;
        }
    }

    enum def InterfaceType{
        enum I2C;
        enum SPI;
    }
    enum def SystemType{
        enum SYS;    // 总体
        enum SS;     // 结构
        enum PAY;    // 载荷
        enum ADCS;   // 姿控
        enum EPS;    // 供电
        enum OBDH;   // 星务
        enum COMM;   // 通信
        enum TCS;    // 热控
        enum DEP;    // 部署
        enum PROP;   // 推进
        enum GS;     // 地面站
        enum OTHERS; // 其他
    }


}