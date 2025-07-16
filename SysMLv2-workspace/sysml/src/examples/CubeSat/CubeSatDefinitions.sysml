package CubeSatDefinitions{
    private import SI::*;
    private import ISQ::*;
    private import ScalarValues::*;
    private import ShapeItems::*;
    private import SpatialItems::*;

    abstract part def BaseComponent{
        attribute mass : ISQ::MassValue := 0.0 [g];
        attribute temperature : ISQ::ThermodynamicTemperatureValue := 20.0 ['°C'];
        attribute material : Material;
        attribute price : Natural := 0.0;
        attribute systemType : SystemType;
    }

    part def EntityComponent :> BaseComponent, SpatialItem;

    part def FunctionComponent :> EntityComponent{
        port powerEnd : PowerEnd [0..*];
        port dataEnd : DataEnd [0..*];
    }

    abstract port def PortComponent :> BaseComponent;
    port def PowerEnd :> PortComponent;
    port def DataEnd :> PortComponent;

    flow def PowerLine{
		ref :>> payload : ElectricPower;
		end in source : PowerEnd;
		end out target : PowerEnd;
	}

    interface def DataLine{
        end port a : DataEnd;
        end port b : DataEnd;
    }

    part def CubeSatEntity{
        part body : BaseComponent [1];
        part structure : EntityComponent [1..*];
        part payload : FunctionComponent [0..*];
        part adcs : FunctionComponent [1..*];
        part power : FunctionComponent [1..*];
        part obdh : FunctionComponent [1..*];
        part communication : FunctionComponent [1..*];
        part thermalControl : FunctionComponent [0..*];
        part others : FunctionComponent [0..*];
    }

    package BodySystem{

    }

    package StructureSystem{
        part def TwoUStructure :> EntityComponent{
            :>> systemType = SystemType::Structure;
        }
    }

    package PayloadSystem{
        part def INMS :> FunctionComponent{
            :>> systemType = SystemType::Payload;
        }
    }
    package ADCSSystem{
        part def Gyro :> FunctionComponent{
            :>> systemType = SystemType::ADCS;
        }
        part def MTQ :> FunctionComponent{
            :>> systemType = SystemType::ADCS;
        }
        part def SunSensor :> FunctionComponent{
            :>> systemType = SystemType::ADCS;
        }
        part def Reaction :> FunctionComponent{
            :>> systemType = SystemType::ADCS;
        }
    }
    package PowerSystem{
        part def SolarPanel :> FunctionComponent{
            :>> systemType = SystemType::Power;    
        }
        part def PowerSupplyBoard :> FunctionComponent{
            :>> systemType = SystemType::Power;
        }
    }

    package OBDHSystem{
        part def OnBoardComputer :> FunctionComponent{
            :>> systemType = SystemType::OBDH;
        }
        part def Magnetometer :> FunctionComponent{
            :>> systemType = SystemType::OBDH;
        }
    }

    package CommunicationSystem{
        part def Antenna :> FunctionComponent{
            :>> systemType = SystemType::Communication;
        }
        part def Transceiver :> FunctionComponent{
            :>> systemType = SystemType::Communication;
        }
    }

    package ThermalControlSystem{

    }

    package OtherSystem{


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

    enum def Material{
        enum aluminum;
        enum copper;
        enum steel;
        enum plastics;
        enum composite;
    }

    enum def SystemType{
        enum Body;
        enum Structure;
        enum Payload;
        enum ADCS;
        enum Power;
        enum OBDH;
        enum Communication;
        enum ThermalControl;
        enum Other;
    }
}