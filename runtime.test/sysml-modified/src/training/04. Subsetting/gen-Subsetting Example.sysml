package 'Subsetting Example'{
	part def Vehicle{
		part parts [ * ] : VehiclePart;
		part eng : Engine :> parts;
		part trans : Transmission :> parts;
		part wheels [ 4 ] : Wheel :> parts;
	}
	abstract part def VehiclePart;
	part def Engine : VehiclePart;
	part def Transmission : VehiclePart;
	part def Wheel : VehiclePart;
}
