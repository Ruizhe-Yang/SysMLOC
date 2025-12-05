package 'Metadata Example-2'{
	action computeDynamics{
		private import AnalysisTooling :: *;
		metadata ToolExecution{
			toolName = "ModelCenter";
			uri = "aserv://localhost/Vehicle/Equation1" ; } in dt : ISQ::TimeValue { metadata ToolVariable { name = "deltaT" ; } } in a : ISQ::AccelerationValue { metadata ToolVariable { name = "mass" ; } } in v_in : ISQ::SpeedValue { metadata ToolVariable { name = "v0" ; } } in x_in : ISQ::LengthValue { metadata ToolVariable { name = "x0" ; } } out v_out : ISQ::SpeedValue { metadata ToolVariable { name = "v" ; } } out x_out : ISQ::LengthValue { metadata ToolVariable { name = "x" ; } } } }
