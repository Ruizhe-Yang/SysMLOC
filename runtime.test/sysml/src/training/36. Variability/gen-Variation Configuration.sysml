package 'Variation Configuration'{
	private import 'Variation Usages' :: *;
	part vehicle4Cyl :> vehicleFamily{
		part :>> engine = engine::'4cylEngine';
		part :>> transmission = transmission::manualTransmission;
	}
	part vehicle6Cyl :> vehicleFamily{
		part :>> engine = engine::'6cylEngine';
		part :>> transmission = transmission::manualTransmission;
	}
}
