package CubeSat_CalcFunctions {
    private import CubeSat_Base::*;
    
    calc def CountCubeSatSystemMass{
        in cs : CubeSatEntity;
        return cubesatMass : ISQ::MassValue = sum(cs.sys.mass, cs.ss.mass, cs.pay.mass, cs.adcs.mass,
        cs.eps.mass, cs.obdh.mass, cs.comm.mass, cs.tcs.mass, cs.dep.mass, cs.prop.mass,
        cs.sys.massError, cs.ss.massError, cs.pay.massError, cs.adcs.massError,
        cs.eps.massError, cs.obdh.massError, cs.comm.massError, cs.tcs.massError, cs.dep.massError, cs.prop.massError);
    }

    calc def CountCubeSatGravityCenter{
        in cs : CubeSatEntity; 
        return : CartesianPosition3dVector;
    }
}