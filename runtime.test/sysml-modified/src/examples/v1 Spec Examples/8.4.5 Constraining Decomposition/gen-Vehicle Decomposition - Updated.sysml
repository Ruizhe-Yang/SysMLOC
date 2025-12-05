package 'Vehicle Decomposition - Updated'{
	doc /*
	 * Example from the SysML 1.6 spec, subclause 8.4.5 Constraining Decomposition,
	 * updated for usage-focused approach.
	 */
	// Blocks
	part def Vehicle;
	part def 'Chassis Assembly';
	part def Wheel;
	part def LugBolt;
	part def RollBar;
	part def HeavyRollBar : RollBar;
	part def LightRollBar : RollBar;
	part def Engine;
	part def Cylinder;
	// Parts
	part vehicle : Vehicle{
		part chs [ 1 ] : 'Chassis Assembly'{
			part rb [ 0 .. 1 ] : RollBar;
			part w [ 4 ] : Wheel{
				part lb [ 6 .. 10 ] : LugBolt;
			}
		}
		part eng [ 1 ] : Engine{
			part cyl [ 4 .. 8 ] : Cylinder;
		}
	}
	part 'vehicle model 1' :> vehicle{
		part :>> chs{
			part [ 0 .. 1 ] : LightRollBar :>> rb;
			part :>> w{
				part :>> lb;
			}
		}
		part :>> eng{
			part [ 4 ] :>> cyl;
		}
		// Constrains total number of lugbolts.
		ref lugBolts [ 24 ] = chs.w.lb;
	}
	part 'vehicle model 2' :> vehicle{
		part :>> chs{
			part [ 0 ] :>> rb;
			part :>> w{
				// Constrains number of lugbolts per wheel.
				part [ 6 .. 7 ] :>> lb;
			}
		}
		part :>> eng{
			part [ 6 .. 8 ] :>> cyl;
		}
	}
}
