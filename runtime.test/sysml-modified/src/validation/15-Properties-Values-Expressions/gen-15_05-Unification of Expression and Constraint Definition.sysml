package '15_05-Unification of Expression and Constraint Definition'{
	private import '15_03-Value Expression' :: *;
	private import ControlFunctions::forAll;
	private import SI :: *;
	constraint def DiscBrakeConstraint{
		in wheelAssy [ 4 ] : WheelAssy;
		wheelAssy->forAll{
			in ref w: WheelAssy;
			2 * w.discBrakeAssy.radius < w.wheel.outerDiameter
		}
	}
	constraint def DiscBrakeFitConstraint_Alt{
		in discBrakeAssy [ 1 ] : DiscBrakeAssy;
		in wheel [ 1 ] : Wheel;
		2 * discBrakeAssy.radius < wheel.outerDiameter
	}
	part def Vehicle_2{
		attribute mass [ 1 ] : MassValue = 1200 [kg];
		attribute length [ 1 ] : LengthValue = 4.82 [m];
		part wheelAssy [ 4 ] : WheelAssy;
		constraint discBrakeConstraint : DiscBrakeConstraint{
			doc /*
			 * This constraint is computed, but not asserted. This means a tool can identify 
			 * when it is violated without the model being inconsistent.
			 */
			in wheelAssy = Vehicle_2::wheelAssy;
		}
	}
	part def WheelAssy{
		part wheel [ 1 ] : Wheel;
		part discBrakeAssy [ 1 ] : DiscBrakeAssy;
		assert constraint discBrakeFitConstraint_Alt : DiscBrakeFitConstraint_Alt{
			doc /*
			 * This constraint is asserted to be true, which means that the model
			 * is inconsistent if it the constraint is violated.
			 */
			in discBrakeAssy = WheelAssy::discBrakeAssy;
			in wheel = WheelAssy::wheel;
		}
	}
	part def DiscBrakeAssy{
		attribute radius [ 1 ] : LengthValue = 95 [mm];
	}
}
