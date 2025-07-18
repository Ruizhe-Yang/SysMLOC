package EPS{
    private import CubeSat_Base::*;
    part def SolarPanel :> FunctionComponent{
        :>> sysType = SystemType::EPS;    
    }
    part def PowerSupplyBoard :> FunctionComponent{
        :>> sysType = SystemType::EPS;
    }
}