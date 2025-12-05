package VehicleUsages{
	doc /*
	 * Example usages of elements from the vehicle definitions model.
	 */
	private import SI::N;
	private import SI::m;
	private import ScalarFunctions :: *;
	public import VehicleDefinitions :: *;
	/* VALUES */
	T1 = 10.0 [N * m];
	T2 = 20.0 [N * m];
	/* PARTS */
	part narrowRimWheel : Wheel{
		doc /* Narrow-rim wheel configuration with 4 to 5 lugbolts. */
		part lugbolt [ 4 .. 5 ] : Lugbolt;
	}
	part wideRimWheel : Wheel{
		doc /* Wide-rim wheel configuration with 4 to 6 lugbolts. */
		part lugbolt [ 4 .. 6 ] : Lugbolt;
	}
	part vehicle_C1 : Vehicle{
		doc /* Basic Vehicle configuration showing a part hierarchy. */
		part frontAxleAssembly : AxleAssembly{
			part frontWheel [ 2 ] :> narrowRimWheel{
				part [ 4 ] :>> lugbolt{
					attribute :>> tighteningTorque = T1;
				}
			}
			part frontAxle : Axle;
		}
		part rearAxleAssembly : AxleAssembly{
			part rearWheel [ 2 ] :> wideRimWheel{
				part [ 6 ] :>> lugbolt{
					attribute :>> tighteningTorque = T2;
				}
			}
			part rearAxle : Axle;
		}
	}
	part vehicle_C2 :> vehicle_C1{
		doc /* Specialized configuration with part-specific ports. */
		part :>> frontAxleAssembly{
			part leftFrontWheel :> frontWheel = frontWheel#(1);
			part rightFrontWheel :> frontWheel = frontWheel#(2);
			interface leftFrontMount : Mounting connect frontAxle.leftMountingPoint to leftFrontWheel.hub;
			interface rightFrontMount : Mounting connect frontAxle.rightMountingPoint to rightFrontWheel.hub;
		}
		part rearAxleAssembly :>> vehicle_C1::rearAxleAssembly{
			part leftRearWheel :> rearWheel = rearWheel#(1);
			part rightRearWheel :> rearWheel = rearWheel#(2);
			interface leftRearMount : Mounting connect rearAxle.leftMountingPoint to leftRearWheel.hub;
			interface rightRearMount : Mounting connect rearAxle.rightMountingPoint to rightRearWheel.hub;
		}
	}
	part vehicle_C3 :> vehicle_C2{
		doc /* Further specialized configuration with a connection to a deeply-nested port. */
		part transmission : Transmission{
			port drive : ~DriveIF;
		}
		part :>> rearAxleAssembly{
			part :>> rearAxle{
				port drive : DriveIF;
			}
		}
		interface driveShaft connect transDrive ::> transmission.drive to axleDrive ::> rearAxleAssembly.rearAxle.drive{
			flow transDrive.driveTorque to axleDrive.driveTorque;
		}
	}
}
