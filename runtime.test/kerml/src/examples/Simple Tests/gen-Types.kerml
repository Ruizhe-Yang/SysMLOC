package Types{
	abstract type A :> Base::Anything;
	type all x :> A , Base::things;
	// This Type has exactly one instance.
	type Singleton [ 1 ] :> Base::Anything;
	type Super :> Base::Anything{
		private package P{
			type Sub :> Super;
		}
		protected feature f : P::Sub{
		}
	}
	type B :> Base::Anything;
	specialization Gen subtype A :> B;
	specialization subtype x :> Base::things;
	type Original :> Base::Anything{
		in feature Input{
		}
	}
	type Conjugate1 :> Base::Anything;
	type Conjugate2 :> Base::Anything;
	conjugation c1 conjugate Conjugate1 ~ Original;
	conjugation c2 conjugate Conjugate2 ~ Original;
	type Conjugate3 ~ Original;
	type Conjugate4 ~ Conjugate1;
	type C :> B disjoint from A;
	type D :> Base::Anything unions A unions B;
	type E :> Base::Anything intersects A intersects B;
	type F :> Base::Anything differences A differences B;
}
