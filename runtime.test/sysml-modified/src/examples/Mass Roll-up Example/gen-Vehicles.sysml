package VehicleMasses{
	private import ScalarValues :: *;
	private import MassRollup :: *;
	part def CarPart : MassedThing{
		attribute serialNumber : String;
	}
	part car : CarPart :> compositeThing{
		attribute vin :>> serialNumber;
		part carParts [ * ] : CarPart :>> subcomponents;
		part engine :> simpleThing :> carParts{
			//...
		}
		part transmission :> simpleThing :> carParts{
			//...
		}
	}
	// Example usage
	private import SI :: *;
	part c :> car{
		:>> mass = 1000 [kg];
		part :>> engine{
			:>> mass = 100 [kg];
		}
		part :>> transmission{
			:>> mass = 50 [kg];
		}
	}
	// c.totalMass --> 1150.0 [kg]
}
