package 'Wheel Package'{
	doc /*
	 * Example from the SysML 1.6 spec, subclause 8.4.1 Wheel Hub Assembly.
	 */
	private import ISQ :: *;
	pressure = force / length^2;
	part def WheelHubAssembly{
		part wheel [ 1 ] : WheelAssembly;
		part lugBoltJoints [ 5 ] : LugBoltJoint{
			ref :> hub.h :>> threadedHole;
			ref :> wheel.w.mountingHoles :>> mountingHole;
		}
		part hub [ 1 ] : Hub;
	}
	part def WheelAssembly{
		inflationPressure :> pressure;
		part t [ 1 ] : Tire{
			part bead :>> Tire::bead;
		}
		part w [ 1 ] : Wheel{
			part rim :>> Wheel::rim;
		}
		connection : PressureSeat connect t.bead to w.rim;
	}
	part def Tire{
		tireSpecification : ScalarValues::String;
		part bead [ 2 ] : TireBead;
		action mountTire;
	}
	part def TireBead;
	connection def PressureSeat{
		end [ 1 ] : TireBead;
		end [ 1 ] : TireMountingRim;
	}
	part def Wheel{
		diameter :> length;
		width :> length;
		part rim [ 2 ] : TireMountingRim;
		part v [ 1 ] : InflationValve;
		part weight [ 0 .. 6 ] : BalanceWeight;
		part mountingHoles [ 5 ] : LugBoltMountingHole;
	}
	connection def BandMount{
		end [ 1 ] : Wheel;
		end [ 1 ] : WirelessTirePressureMonitor;
	}
	part def WirelessTirePressureMonitor{
		action transmitPressure;
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
		ref mountingHole [ 1 ] : LugBoltMountingHole;
		ref threadedHole [ 1 ] : LugBoltThreadableHole;
	}
	part def Hub{
		part h [ 5 ] : LugBoltThreadableHole;
	}
	part def LugBoltThreadableHole{
		lugBoltSize :> length;
		threadSize :> length;
	}
}
