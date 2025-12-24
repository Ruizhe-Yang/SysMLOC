package Inheritance{
	class A{
		feature f{
		}
	}
	class B :> A;
	feature y : A{
		alias x for B::f;
		feature g :>> f{
		}
	}
	alias z for y::g;
	feature w :> y{
	}
	alias us for w::g;
	feature yy : y{
	}
}
