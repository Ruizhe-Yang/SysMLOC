package AnalysisAnnotation{
	private import ScalarValues::Real;
	private import AnalysisTooling :: *;
	private import ISQ :: *;
	action def ComputeDynamics{
		metadata ToolExecution{
			toolName = "ModelCenter";
			uri = "aserv://localhost/Vehicle/Equation1" ; } in dt : TimeValue { metadata ToolVariable { name = "deltaT" ; } } in whlpwr : PowerValue { metadata ToolVariable { name = "power" ; } } in Cd : Real { metadata ToolVariable { name = "C_D" ; } } in Cf : Real { metadata ToolVariable { name = "C_F" ; } } in tm : MassValue { metadata ToolVariable { name = "mass" ; } } in v_in : SpeedValue { metadata ToolVariable { name = "v0" ; } } in x_in : LengthValue { metadata ToolVariable { name = "x0" ; } } out a_out : AccelerationValue { metadata ToolVariable { name = "a" ; } } out v_out : SpeedValue { metadata ToolVariable { name = "v" ; } } out x_out : LengthValue { metadata ToolVariable { name = "x" ; } } } }
