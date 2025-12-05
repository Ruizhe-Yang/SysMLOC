package 'Parts Example-1'{
	// Definitions
	part def Vehicle{
		part eng : Engine;
	}
	part def Engine{
		part cyl [ 4 .. 6 ] : Cylinder;
	}
	part def Cylinder;
	// Usages
	part smallVehicle : Vehicle{
		part :>> eng{
			part [ 4 ] :>> cyl;
		}
	}
	part bigVehicle : Vehicle{
		part :>> eng{
			part [ 6 ] :>> cyl;
		}
	}
}
