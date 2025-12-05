package 'Vehicle Decomposition'{
	doc /*
	 * Example from the SysML 1.6 spec, subclause 8.4.5 Constraining Decomposition.
	 */
	part def Vehicle{
		part chs [ 1 ] : 'Chassis Assembly'{
			part rb :>> 'Chassis Assembly'::rb;
			part :>> w{
				part :>> lb;
			}
		}
		part eng [ 1 ] : Engine{
			part cyl :>> Engine::cyl;
		}
		ref cylinderBR [ * ] = eng.cyl;
		ref rollBarBR [ * ] = chs.rb;
		ref lugBoltBR [ 24 .. 32 ] = chs.w.lb;
	}
	part def 'Chassis Assembly'{
		part w [ 4 ] : Wheel;
		part rb [ 0 .. 1 ] : RollBar;
	}
	part def Wheel{
		part lb [ 6 .. 10 ] : LugBolt;
	}
	part def LugBolt;
	part def RollBar;
	part def HeavyRollBar : RollBar;
	part def LightRollBar : RollBar;
	part def Engine{
		part cyl [ 4 .. 8 ] : Cylinder;
	}
	part def Cylinder;
	part def 'Vehicle Model 1' : Vehicle{
		ref [ 4 ] :>> cylinderBR;
		ref [ * ] : LightRollBar :>> rollBarBR;
		ref [ 24 ] :>> lugBoltBR;
	}
	part def 'Vehicle Model 2' : Vehicle{
		ref [ 6 .. 8 ] :>> cylinderBR;
		ref [ 0 ] :>> rollBarBR;
		ref [ 24 .. 28 ] :>> lugBoltBR;
		// 6..7 per wheel
	}
}
