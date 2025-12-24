package Vehicles_1{
	private import ScalarValues::String;
	private import MassRollup_1 :: *;
	class Vehicle :> MassedThing{
		feature vin : String{
		}
		feature m :>> mass{
		}
		composite engine : Engine :> subcomponents{
		}
		composite transmission : Transmission :> subcomponents{
		}
	}
	class Engine :> MassedThing{
		feature serialNumber : String{
		}
		feature m :>> mass{
		}
		// ...
	}
	class Transmission :> MassedThing{
		feature serialNumber : String{
		}
		feature m :>> mass{
		}
		// ...
	}
	// Example usage
	private import SI :: *;
	feature v : Vehicle{
		feature m :>> Vehicle::m = 1000{
		}
		composite engine :>> Vehicle::engine{
			feature m :>> Engine::m = 100{
			}
		}
		composite transmission :>> Vehicle::transmission{
			feature m :>> Transmission::m = 50{
			}
		}
	}
	// v.totalMass evaluates to 1150.0
}
