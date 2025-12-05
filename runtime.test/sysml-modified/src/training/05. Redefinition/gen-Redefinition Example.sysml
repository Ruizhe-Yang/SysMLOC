package 'Redefinition Example'{
	part def Vehicle{
		part eng : Engine;
	}
	part def SmallVehicle : Vehicle{
		part smallEng : SmallEngine :>> eng;
	}
	part def BigVehicle : Vehicle{
		part bigEng : BigEngine :>> eng;
	}
	part def Engine{
		part cyl [ 4 .. 6 ] : Cylinder;
	}
	part def SmallEngine : Engine{
		part [ 4 ] :>> cyl;
	}
	part def BigEngine : Engine{
		part [ 6 ] :>> cyl;
	}
	part def Cylinder;
}
