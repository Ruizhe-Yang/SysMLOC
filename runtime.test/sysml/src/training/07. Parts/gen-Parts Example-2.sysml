package 'Parts Example-2'{
	// Definitions
	part def Vehicle;
	part def Engine;
	part def Cylinder;
	// Usages
	part vehicle : Vehicle{
		part eng : Engine{
			part cyl [ 4 .. 6 ] : Cylinder;
		}
	}
	part smallVehicle :> vehicle{
		part :>> eng{
			part [ 4 ] :>> cyl;
		}
	}
	part bigVehicle :> vehicle{
		part :>> eng{
			part [ 6 ] :>> cyl;
		}
	}
}
