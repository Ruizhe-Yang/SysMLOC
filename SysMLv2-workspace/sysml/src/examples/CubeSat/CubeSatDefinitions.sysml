package CubeSatDefinitions{
    public import SI::*;
    public import ISQ::*;
    public import ScalarValues::*;
    public import ShapeItems::*;
    public import SpatialItems::*;
    // private import MeasurementReferences::CoordinateFrame;
    public import MeasurementReferences::TranslationRotationSequence;
    public import MeasurementReferences::Translation;
    public import MeasurementReferences::Rotation;

    abstract part def BaseComponent{
        attribute sysType : SystemType;
    }

    part def EntityComponent :> BaseComponent, SpatialItem{
        attribute mass : ISQ::MassValue;
        attribute massError : ISQ::MassValue;
        attribute tupper : ISQ::ThermodynamicTemperatureValue;
        attribute tlower : ISQ::ThermodynamicTemperatureValue;
        attribute material : Material[1..*];
        attribute price : Natural;
        attribute vendor : String[1..*];
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

    package SYS{
    }

    package SS{
        part def OneUnitStructure :> EntityComponent{
            :>> sysType = SystemType::SS;
            part body{
                item :>> shape : Box {
                    :>> length = 100.0 [mm];
                    :>> width = 100.0 [mm];
                    :>> height = 100.0 [mm];
                }
                attribute :>> coordinateFrame {
                    :>> transformation : TranslationRotationSequence {
                        :>> elements = (Translation( (0, 0, 0)[source]), Rotation((0, 0, 1)[source], 0['°']));
                    }
                }
                attribute lengthError : LengthValue[0..1];
                attribute widthError : LengthValue[0..1];
                attribute heightError : LengthValue[0..1];
            }
            part feet : Rectangle{
                item :>> shape : Box {
                    :>> length = 8.5 [mm];
                    :>> width = 8.5 [mm];
                }
                attribute lengthError : LengthValue[0..1];
                attribute widthError : LengthValue[0..1];
            }
        }

        part def TwoUnitsStructure :> OneUnitStructure{
            item :>> shape {
                :>> height = 277.0 [mm];
            }
        }

        part def ThreeUnitsStructure :> OneUnitStructure{
            item :>> shape {
                :>> height = 340.0 [mm];
            }
        }
    }

    package PAY{
        part def INMS :> FunctionComponent{
            :>> sysType = SystemType::PAY;
        }
    }

    package ADCS{
        part def Gyro :> FunctionComponent{
            :>> sysType = SystemType::ADCS;
        }
        part def MTQ :> FunctionComponent{
            :>> sysType = SystemType::ADCS;
        }
        part def SunSensor :> FunctionComponent{
            :>> sysType = SystemType::ADCS;
        }
        part def Reaction :> FunctionComponent{
            :>> sysType = SystemType::ADCS;
        }
    }
    package EPS{
        part def SolarPanel :> FunctionComponent{
            :>> sysType = SystemType::EPS;    
        }
        part def PowerSupplyBoard :> FunctionComponent{
            :>> sysType = SystemType::EPS;
        }
    }

    package OBDH{
        part def OnBoardComputer :> FunctionComponent{
            :>> sysType = SystemType::OBDH;
        }
        part def Magnetometer :> FunctionComponent{
            :>> sysType = SystemType::OBDH;
        }
        part def Bus :> FunctionComponent{
            :>> sysType = SystemType::OTHERS;
        }
    }

    package COMM{
        part def Antenna :> FunctionComponent{
            :>> sysType = SystemType::COMM;
        }
        part def Transceiver :> FunctionComponent{
            :>> sysType = SystemType::COMM;
        }
    }

    package TCS{

    }

    package DEP{

    }

    package PROP{

    }

    package GS{
        
    }

    package OTHERS{


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