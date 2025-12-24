package Associations{
	datatype X;
	class Y;
	assoc A{
		end x_cross [ 1 .. 1 ] feature x : X{
		}
		end y_cross [ 1 .. * ] feature y : Y{
		}
	}
	assoc B :> A{
		end x1{
		}
		end [ 0 .. * ] feature y1 :>> y{
		}
	}
	metaclass M;
	assoc XY{
		end [ 0 .. 1 ] feature x : X{
			metadata M;
		}
		end feature y : Y{
		}
	}
}
