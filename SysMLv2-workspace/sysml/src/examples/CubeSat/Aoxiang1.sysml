package Aoxiang1{
    private import CubeSat_Definitions::*;
    /* 1. System Overview */
    part aoXiang1Entity : CubeSatEntity{
        :>> vendor = "Northwestern Polytechnical University";
        :>> sys :>  aoXiang1Sys;
        :>> ss  :>  twoU;
        :>> pay  =  INMS;
        :>> adcs =  (sunSensor_1, sunSensor_2, sunSensor_3,
                    HMC5983,
                    ADIS16355,
                    GPSReceiver,
                    threeAxisReactionWeel,
                    ISIS_MTQ);
        :>> eps  =  (solarPanel, 
                    powerSupplyBoard);
        :>> obdh =  (onBoardComputer, 
                    Magnetometer);
        :>> comm =  (antenna,
                    transceiver);
        :>> tcs;
        :>> dep;
        :>> prop;
        :>> gs;
        :>> others = (connector1, connector2);
    }

    part aoXiang1Sys : SYS::QB50_SYS{
        :>> geometricCenter = aoXiang1Entity.ss.geometricCenter;
        :>> gravityCenter = CountCubeSatGravityCenter(aoXiang1Entity);
    }

    /* 2. Payload Subsystem */
    part INMS : PAY::PayloadDevice{
        doc /* 
            The INMS is a miniaturized analyzer designed for sampling of low mass ionized and neutral 
            particles in lower thermosphere, i.e., O, O2, and N2. The key sensor components consist of
             a collimatorion filter, an ionizer and a charged particle spectrometer. 
            */
        :>> mass = 210 [g];
        :>> massError = 90 [g];
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
        :>> mass = 280 [g];
        :>> massError = 20 [g];
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
    /* 3.3 Main components of structure */

    /* 3.4 Mass budget */
    attribute AoXiang1EntityMass : ISQ::MassValue = CountCubeSatSystemMass(aoXiang1Entity);
    
    /* 3.5 Center of gravity */
    attribute AoXiang1GeometricCenter = aoXiang1Entity.sys.geometricCenter;
    attribute AoXiang1GravityCenter = aoXiang1Entity.sys.gravityCenter;

    /* 3.6 Access hatch on the structure */
    part def MDC1_9S1 :> FunctionComponent{
        :>> sysType = SystemType::OTHERS;
        doc /*
            The umbilical connector is MDC1-9S1. The dimension of the connector is in12.2ⅹ3.6ⅹ7.5mm.
            The detail information is in the figure below.
            */
        item :>> shape : Box {
            :>> length = 12.2 [mm];
            :>> width = 3.6 [mm];
            :>> height =7.5 [mm];
        }
    }
    part connector1 : MDC1_9S1{
        attribute :>> coordinateFrame {
            :>> transformation : TranslationRotationSequence {
                :>> elements = (Translation((43.5, 12, 0)[source]), Rotation((0, 0, 1)[source], 0['°']));
            }
        }
    }
    part connector2 : MDC1_9S1{
        attribute :>> coordinateFrame {
            :>> transformation : TranslationRotationSequence {
                :>> elements = (Translation((43.5, 63, 0)[source]), Rotation((0, 0, 1)[source], 0['°']));
            }
        }
    }

    /* 4 Attitude Determination and Control Subsystem */
    /* 4.1 Sensors */
    /* 4.1.1 Sun Sensor */
    part sunSensor : ADCS::SunSensor{
        doc /*
            In order to achieve high resolution,
            AoXiang-1 select CubeSat Sun Sensor (CSS) for QB50 mission.
            */
        :>> vendor = "SSBV Space and Ground System Ltd";
        item :>> shape : Box {
            :>> length = 33 [mm];
            :>> width = 11 [mm];
            :>> height = 6 [mm];
        }
        :>> accuracy = 0.5['°'];
        :>> mass = 0.5[g];
        :>> power = 10e-3[A];
        :>> fieldOfView = 114['°'];
        :>> updateRate = 10[Hz];
    }
    part sunSensor_1 :> sunSensor;
    part sunSensor_2 :> sunSensor;
    part sunSensor_3 :> sunSensor;

    /* 4.1.2 Magnetometer */
    part HMC5983 : ADCS::Magnetometer{
        doc /*
            On the OBC board, we utilize HMC5983 magnetometer from Honeywell as one of the attitude determination device.
            HMC5983 is a low cost three-axis low cost magnetometer. The HMC5983 includes magnetoresistive sensors, amplification,
            automatic degaussing strap drivers, offset cancellation, and a 12-bit ADC.
            */
        item :>> shape : Box {
            :>> length = 33 [mm];
            :>> width = 11 [mm];
            :>> height = 6 [mm];
        }
        :>> mass = 15e-3[g];
        :>> accuracy = 2.0e-3[T];
        :>> magneticFieldRange{
            :>> upper = 8.0;
            :>> lower = -8.0;
        }
        :>> interfaceType = (InterfaceType::I2C, InterfaceType::SPI);
        :>> offsetCompensatio = "Automatic";
        :>> power = 0.43e-3[W];
        :>> updateRate = 220[Hz];
    }

    /* 4.1.3 Gyro */
    part ADIS16355 : ADCS::Gyro{
        doc /*
            An Analog DeviceADIS16355 was used to measure the tip-off rates of AoXiang-1.
            ADIS 16355 incorporate a Tri-axis gyroscope and a Tri-axis accelerometer.
            */
        :>> digitalRangeScaling =(75, 150, 300)['°'/s];
        :>> triAxisMeasurementRange = 14[bit];
    }

    /* 4.1.4 GPS receiver */
    part GPSReceiver : ADCS::Reaction{
        doc /*
            The GPS receiver is used to get the position information of AoXiang-1. 
            Low latency and high update rates give the response time and accuracy required for precise dynamic applications.
            */
        port TLL :> dataEnd;
    }
    
    /* 4.2 Actuator */
    /* 4.2.1 Reaction Wheel */
    part threeAxisReactionWeel : ADCS::ThreeAxisReactionWeel{
        doc /*
            The reaction wheel is the implement of brushless DC motor speed control with PWM control mode. 
            Reaction wheel uses Faulhaber brushless DC motor as a drive. 
            */
        item :>> shape : Box {
            :>> length = 33 [mm];
            :>> width = 11 [mm];
            :>> height = 6 [mm];
        }
        :>> mass = 80 [g];
        :>> accuracy = 0.5['°'];
        :>> poweConsumption{
            :>> typical = 250e-3[W];
            :>> peak = 1.5[W];
        }
        :>> maxRotateSpeed = 12000['s⁻¹'];
        :>> momentum = 6e-6['kg⋅m²'];
        :>> maxTorque = 0.2e-3['N⋅m'];
    }

    /* 4.2 MTQ */
    part ISIS_MTQ : ADCS::MTQ{
        doc /*
            The ISIS MTQ is a PCB based 3-axis actuator. 
            It is designed to provide maximum flexibility in placing actuators in a CubeSat structure.
            */
        item :>> shape : Box {
            :>> length = 96 [mm];
            :>> width = 90 [mm];
            :>> height = 22 [mm];
        }
        :>> mass = 200[g];
        :>> actuationPower_Rods = "0.5W/0.2Am2"; // TBD
        :>> actuationPower_AirCore = "0.7W/0.2Am2"; // TBD
        :>> interfaceType = InterfaceType::I2C;
        :>> offsetCompensatio = "Automatic";
        :>> updateRate = 220[Hz];
        :>> processor = "MSP430";

    }

    part NPU_MTQ : ADCS::MTQ{
        doc /*
            Another candidate MTQ is made by NPU. The system use a MSP430 controller to receive the temperature information of board, 
            control command from OBC and generate control momentum.
            The communication bus is I2C.
            */
    }

    /* 4.3 Attitude determination */
    // TBD

    /* 4.4 Attitude control */
    // TBD

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