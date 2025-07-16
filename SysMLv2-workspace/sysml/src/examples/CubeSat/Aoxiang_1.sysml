package Aoxiang_1{
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
    private import CubeSatDefinitions::*;
    part AoXiang1Entity : CubeSatEntity{
        :>> structure = twoU;
        :>> payload = inms;
        :>> adcs = (gyro, mtq, sunSensor, reaction);
    }

    part twoU : StructureSystem::TwoUStructure;
    part inms : PayloadSystem::INMS;
    part gyro : ADCSSystem::Gyro;
    part mtq : ADCSSystem::MTQ;
    part sunSensor : ADCSSystem::SunSensor;
    part reaction : ADCSSystem::Reaction;


}