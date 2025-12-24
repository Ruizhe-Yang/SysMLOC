package Vehicles_3{
	private import ScalarValues :: *;
	private import MassRollup_2 :: *;
	class CarPart :> MassedThing{
		feature serialNumber : String{
		}
		feature m :>> MassedThing::mass{
		}
		feature subparts :>> carParts{
		}
	}
	composite feature carParts [ 0 .. * ] : CarPart :> massedThings{
	}
	feature vehicle :> carParts{
		feature vin :>> serialNumber{
		}
		feature :>> engine{
		}
		feature :>> transmission{
		}
	}
	composite feature engine :> carParts{
		//...
	}
	composite feature transmission :> carParts{
		//...
	}
	// Example usage
	private import SI :: *;
	feature v : vehicle{
		feature m :>> CarPart::m = 1000{
		}
		composite :>> engine = e{
		}
		composite :>> transmission = t{
		}
	}
	feature e :> engine{
		feature m :>> CarPart::m = 100{
		}
	}
	feature t :> transmission{
		feature m :>> CarPart::m = 50{
		}
	}
	// v.totalMass evaluates to 1150.0
}
