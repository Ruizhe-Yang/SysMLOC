package Inverses{
	class A{
		feature f : B disjoint from h inverse of B::g{
		}
		feature h : B{
		}
	}
	class B{
		feature g : A{
		}
	}
	inverse B::g of A::f;
	inverting Invert inverse B::g.f of A::h;
	feature gg : A inverse of A::f featured by B{
	}
}
