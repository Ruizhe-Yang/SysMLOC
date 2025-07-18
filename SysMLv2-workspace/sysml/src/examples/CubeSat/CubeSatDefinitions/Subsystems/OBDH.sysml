package OBDH{
    private import CubeSat_Base::*;
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