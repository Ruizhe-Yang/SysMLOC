package 'Wheel Package - Updated'{
	doc /*
	 * Example from the SysML 1.6 spec, subclause 8.4.1 Wheel Hub Assembly.
	 */
	private import ISQ :: *;
	// Quantities
	pressure = force / length^2;
	// Blocks
	part def WheelHubAssembly;
	part def WheelAssembly{
		inflationPressure :> pressure;
	}
	part def Tire{
		tireSpecification : ScalarValues::String;
		action mountTire;
		// Should be operation
	}
	part def TireBead;
	connection def PressureSeat{
		end [ 1 ] : TireBead;
		end [ 1 ] : TireMountingRim;
	}
	part def Wheel{
		diameter :> length;
		width :> length;
	}
	connection def BandMount{
		end [ 1 ] : Wheel;
		end [ 1 ] : WirelessTirePressureMonitor;
	}
	part def WirelessTirePressureMonitor{
		action transmitPressure;
		// Should be operation
	}
	part def TireMountingRim;
	part def InflationValve;
	part def BalanceWeight;
	part def LugBoltMountingHole{
		lugBoltSize :> length;
	}
	part def LugBoltJoint{
		torque :> ISQ::torque;
		boltTension :> force;
	}
	part def Hub;
	part def LugBoltThreadableHole{
		lugBoltSize :> length;
		threadSize :> length;
	}
	// Parts
	part wheelHubAssembly : WheelHubAssembly{
		part wheel [ 1 ] : WheelAssembly{
			part t [ 1 ] : Tire{
				part bead [ 2 ] : TireBead;
			}
			part w [ 1 ] : Wheel{
				part rim [ 2 ] : TireMountingRim;
				part v [ 1 ] : InflationValve;
				part weight [ 0 .. 6 ] : BalanceWeight;
				part mountingHoles [ 5 ] : LugBoltMountingHole;
			}
			connection : PressureSeat connect t.bead to w.rim;
		}
		part lugBoltJoints [ 5 ] : LugBoltJoint{
			ref mountingHole [ 1 ] : LugBoltMountingHole :> wheel.w.mountingHoles;
			ref threadedHole [ 1 ] : LugBoltThreadableHole :> hub.h;
		}
		part hub [ 1 ] : Hub{
			part h [ 5 ] : LugBoltThreadableHole;
		}
	}
}
