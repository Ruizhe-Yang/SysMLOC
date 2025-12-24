package Vehicles_2{
	private import ScalarValues::String;
	private import MassRollup_1 :: *;
	class CarPart :> MassedThing{
		feature serialNumber : String{
		}
		feature m :>> mass{
		}
		composite subparts [ 0 .. * ] : CarPart :>> subcomponents{
		}
	}
	feature vehicle : CarPart{
		feature vin :>> serialNumber{
		}
		composite engine : CarPart :> subparts{
			//...
		}
		composite transmission : CarPart :> subparts{
			//...
		}
	}
	// Example usage
	private import SI :: *;
	feature v : vehicle{
		feature m :>> CarPart::m = 1000{
		}
		composite engine :>> vehicle::engine{
			feature m :>> CarPart::m = 100{
			}
		}
		composite transmission :>> vehicle::transmission{
			feature m :>> CarPart::m = 50{
			}
		}
	}
	// v.totalMass evaluates to 1150.0
}
