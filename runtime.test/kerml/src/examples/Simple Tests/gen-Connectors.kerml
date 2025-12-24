package Connectors{
	class A{
		feature a : A{
		}
		feature b : A{
		}
		connector c1 from a to b;
		abstract connector c2 = c1;
		connector = c2{
			end feature ::> a{
			}
			end feature ::> b{
			}
		}
		binding a = b;
		binding ab of a = b;
		binding{
			end feature ::> a{
			}
			end feature ::> b{
			}
		}
		succession a then b;
		succession s first a then b;
		succession{
			end feature ::> a{
			}
			end feature ::> b{
			}
		}
	}
	class B{
		feature a : A{
		}
		connector :> a.c1 from a.a to a.b;
	}
}
