package '15_12-Compound Value Type'{
	private import ScalarValues :: *;
	private import USCustomaryUnits::'in';
	/*
	 * Real world user models would use quantity and vector types
	 * from library models. They are included here for the purpose
	 * of showing how such attribute defs can be defined.
	 */
	attribute def PositionVector{
		attribute x [ 1 ] : Real;
		attribute y [ 1 ] : Real;
		attribute z [ 1 ] : Real;
	}
	attribute def LengthValue : Real;
	attribute def TireInfo{
		attribute manufacturer : String;
		attribute hubDiameter : LengthValue;
		attribute width : Integer;
		attribute placement [ 0 .. 1 ] : PositionVector;
	}
	attribute frenchTireInfo : TireInfo{
		attribute :>> manufacturer = "Michelin";
		attribute :>> hubDiameter = 18.0['in'];
		attribute :>> width = 245;
	}
}
