package Redefinition{
	classifier A{
		feature f{
		}
	}
	classifier B :> A{
		feature :>> f{
			feature g{
			}
		}
	}
	classifier C :> A , B{
		feature :> f{
			feature :>> g{
			}
		}
	}
	class X{
		feature :>> startShot{
		}
		feature :>> endShot{
		}
	}
}
