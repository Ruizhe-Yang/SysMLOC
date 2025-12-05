package 'Connections Example'{
	part def WheelHubAssembly;
	part def WheelAssembly;
	part def Tire;
	part def TireBead;
	part def Wheel;
	part def TireMountingRim;
	part def LugBoltMountingHole;
	part def Hub;
	part def LugBoltThreadableHole;
	part def LugBoltJoint;
	connection def PressureSeat{
		end [ 1 ] part bead : TireBead;
		end [ 1 ] part mountingRim : TireMountingRim;
	}
	part wheelHubAssembly : WheelHubAssembly{
		part wheel [ 1 ] : WheelAssembly{
			part t [ 1 ] : Tire{
				part bead [ 2 ] : TireBead;
			}
			part w [ 1 ] : Wheel{
				part rim [ 2 ] : TireMountingRim;
				part mountingHoles [ 5 ] : LugBoltMountingHole;
			}
			connection : PressureSeat connect bead ::> t.bead to mountingRim ::> w.rim;
		}
		part lugBoltJoints [ 0 .. 5 ] : LugBoltJoint;
		part hub [ 1 ] : Hub{
			part h [ 5 ] : LugBoltThreadableHole;
		}
		connect [ 0 .. 1 ] lugBoltJoints to [ 1 ] wheel.w.mountingHoles;
		connect [ 0 .. 1 ] lugBoltJoints to [ 1 ] hub.h;
	}
}
