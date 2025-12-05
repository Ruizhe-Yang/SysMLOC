package 'Variation Definitions'{
	private import ScalarValues::Real;
	private import SI::mm;
	attribute def Diameter : ISQ::LengthValue;
	part def Cylinder{
		attribute diameter [ 1 ] : Diameter;
	}
	part def Engine{
		part cylinder [ 2 .. * ] : Cylinder;
	}
	part '4cylEngine' : Engine{
		part [ 4 ] :>> cylinder;
	}
	part '6cylEngine' : Engine{
		part [ 6 ] :>> cylinder;
	}
	// Variability model
	variation attribute def DiameterChoices : Diameter{
		variant attribute diameterSmall = 70[mm];
		variant attribute diameterLarge = 100[mm];
	}
	variation part def EngineChoices : Engine{
		variant '4cylEngine';
		variant '6cylEngine';
	}
}
