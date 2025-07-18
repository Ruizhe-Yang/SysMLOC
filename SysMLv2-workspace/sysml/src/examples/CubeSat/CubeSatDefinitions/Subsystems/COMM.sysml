package COMM{
    private import CubeSat_Base::*;
    part def Antenna :> FunctionComponent{
        :>> sysType = SystemType::COMM;
    }
    part def Transceiver :> FunctionComponent{
        :>> sysType = SystemType::COMM;
    }
}