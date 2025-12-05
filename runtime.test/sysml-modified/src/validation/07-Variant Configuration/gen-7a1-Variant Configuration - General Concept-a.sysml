package '7a1-Variant Configuration - General Concept-a'{
	action doX;
	action doY;
	part part1;
	part part2;
	part part3{
		port p1;
	}
	part part4;
	part part5{
		port p2;
		variation perform action doXorY{
			variant perform doX;
			variant perform doY;
		}
	}
	part part6;
	abstract part def SubsystemA{
		abstract part [ 0 .. 1 ] :>> part3;
	}
	abstract part def SubsystemB{
		abstract part [ 1 ] :>> part5;
	}
	part anyVehicleConfig{
		variation part subsystemA : SubsystemA{
			variant part subsystem1 : SubsystemA{
				part [ 1 ] :>> part1;
				part [ 1 ] :>> part2;
			}
			variant part subsystem2 : SubsystemA{
				part [ 1 ] :>> part2;
				part [ 1 ] :>> part3;
			}
		}
		variation part subsystemB : SubsystemB{
			variant part subsystem3 : SubsystemB{
				part [ 1 ] :>> part4;
				part [ 1 ] :>> part5;
			}
			variant part subsystem4 : SubsystemB{
				part [ 1 ] :>> part5;
				part [ 1 ] :>> part6;
			}
		}
		connect [ 0 .. 1 ] subsystemA.part3.p1 to [ 1 ] subsystemB.part5.p2;
		assert constraint{
			subsystemA != subsystemA::subsystem2 | subsystemB == subsystemB::subsystem3
		}
	}
	part vehicleConfigA :> anyVehicleConfig{
		part :>> subsystemA = subsystemA::subsystem1;
		part :>> subsystemB = subsystemB::subsystem3{
			part :>> part5{
				perform action :>> doXorY = doX;
			}
		}
	}
	part VehicleConfigB :> anyVehicleConfig{
		part :>> subsystemA = subsystemA::subsystem2;
		part :>> subsystemB = subsystemB::subsystem4{
			part :>> part5{
				perform action :>> doXorY = doY;
			}
		}
	}
}
