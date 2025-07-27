package SYS{
    private import CubeSat_Base::*;
    private import CubeSat_CalcFunctions::*;
    public import Time::Iso8601DateTimeStructure;
    part def CubeSatSystem :> FunctionComponent{
        attribute track : Track;

    }
    part def QB50_SYS :> CubeSatSystem;
    
    attribute def Track;

    attribute def EarthOrbit :> Track{
        attribute Epoch : Iso8601DateTimeStructure;
        attribute semiMajorAxis : ISQ::LengthValue;
        attribute inclination : ISQ::AngularMeasureValue;
        attribute eccentricity : Positive;
        attribute RAAN : ISQ::AngularMeasureValue;
        attribute argumentOfPerigee : ISQ::AngularMeasureValue;
        attribute meanAnomalyAtEpoch : ISQ::AngularMeasureValue;

        attribute orbitAltitude : ISQ::LengthValue[1..2];
        attribute orbitalPeriod : ISQ::TimeValue = CountOrbitalPeriod(semiMajorAxis, GravitationalConstant);
    }

}