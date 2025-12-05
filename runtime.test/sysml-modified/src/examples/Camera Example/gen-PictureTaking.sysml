package PictureTaking{
	part def Exposure;
	action def Focus{
		out xrsl : Exposure;
	}
	action def Shoot{
		in xsf : Exposure;
	}
	action takePicture{
		action focus [ 1 ] : Focus;
		flow of Exposure focus.xrsl to shoot.xsf;
		action shoot [ 1 ] : Shoot;
	}
}
