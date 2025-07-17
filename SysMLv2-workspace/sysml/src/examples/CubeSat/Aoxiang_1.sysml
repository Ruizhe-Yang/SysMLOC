package Aoxiang_1{
    private import CubeSatDefinitions::*;

    /* 1. System Overview */
    part AoXiang1Entity : CubeSatEntity{
        :>> vendor = "Northwestern Polytechnical University";
        :>> ss = twoU;
        :>> pay = INMS;
        :>> adcs = (gyro, mtq, sunSensor, reaction);
        :>> eps = (solarPanel, powerSupplyBoard);
        :>> obdh = (onBoardComputer, Magnetometer);
        :>> comm = (antenna, transceiver);
        :>> tcs;
        :>> others;
    }

    /* 2. Payload Subsystem */
    part INMS : FunctionComponent{
        doc /* 
            The INMS is a miniaturized analyzer designed for sampling of low mass ionized and neutral 
            particles in lower thermosphere, i.e., O, O2, and N2. The key sensor components consist of
             a collimatorion filter, an ionizer and a charged particle spectrometer. 
            */
        :>> sysType = SystemType::PAY;
        :>> mass = 300.0 [g];
        :>> massError = 0.3*mass [g];
        :>> vendor = "University College London";
        port INMSport :> dataEnd {
            :>> BAUDRate = 38400;
            :>> dataWidth = 8 [bit];
            :>> parityBit = false;
            :>> STARTBit = 1 [bit];
            :>> STOPBit = 1 [bit];
        }
    }

    /* 3. Structural Subsystem */
    /* 3.1 Dimension */
    part twoU : SS::TwoUnitsStructure{
        doc /*
            AoXiang-1 is a 2U CubeSat.
            */
        :>> body{
            :>> lengthError = 0.1 [mm];
            :>> widthError = 0.1 [mm];
            :>> heightError = 0.1 [mm];
        }
        :>> feet{
            :>> lengthError = 0.1 [mm];
            :>> widthError = 0.1 [mm];
        }
        :>> material = AL7075;
    }

    /* 3.2 Material */
    attribute AL7075 : Material{
        doc /*
            The material adopted to construct the AoXiang-1 CubeSat is aluminum 7075, 
            since the AL7075 has relative high yield strength and ultimate strength with low density.
            */
        :>> name = "Aluminum 7075";
        :>> mechanicalProperty{
            :>> youngsModule = 72e9 [Pa];
            :>> yieldStress; = 320e6 [Pa];
            :>> ultimateStrength = 650e6 [Pa];
        }
    }
    /* 3.3 Main components of structure*/

    /* 3.4 Mass budget*/

    part gyro : ADCS::Gyro;
    part mtq : ADCS::MTQ;
    part sunSensor : ADCS::SunSensor;
    part reaction : ADCS::Reaction;
    part solarPanel : EPS::SolarPanel;
    part powerSupplyBoard : EPS::PowerSupplyBoard;
    part onBoardComputer : OBDH::OnBoardComputer;
    part Magnetometer : OBDH::Magnetometer;
    part antenna : COMM::Antenna;
    part transceiver : COMM::Transceiver;
    
    // private import 'Requirement CubeSat'::*;
    // private import cubeSatProjects::*;
    // part Aoxiang_1System{
    //     part Aoxiang : CubeSat;
    //     part AoxiangProject : CubeSatProject;
    //     satisfy CubeSatSystemRequirements by Aoxiang{
    //         satisfy 'QB50-SYS-1.1.6' by Aoxiang;
    //     }
    //     satisfy '2' by AoxiangProject{
    //         satisfy 'QB50-SYS-2.1.1' by AoxiangProject;
    //     }
    // }
}