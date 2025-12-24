behavior TakePicture{
	private import Camera;
	feature camera [ 1 ] : Camera :> involvedObjects{
	}
	class Exposure;
	behavior Focus{
		out xrsl : Exposure{
		}
	}
	behavior Shoot{
		in xsf : Exposure{
		}
	}
	step step1 [ 1 ] : Focus;
	step step2 [ 1 ] : Shoot;
	succession flow exposure [ 1 ] of Exposure from step1.xrsl to step2.xsf;
	succession step1 then camera.focusedState;
	succession step2 then camera.shotState;
}
