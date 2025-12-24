package FeatureChains{
	classifier F{
		feature a : A{
		}
	}
	feature f : F{
	}
	classifier A{
		feature g = f.a{
		}
	}
	classifier B{
		feature f : F{
		}
		feature a : A{
		}
	}
	feature b : B{
		connector f.a to a.g;
		binding f.a = a.g;
	}
	feature g :> f.a{
	}
	subset g.g :> b.f.a;
	redefinition b.f :>> b.a;
	subtype g.g :> b.f.a;
	disjoint b.f.a from b.a;
	feature h1 unions f unions b.f unions b.a{
	}
	feature h2 disjoint from h1 intersects f.a intersects g differences b.f differences b.a{
	}
	feature b_f_a chains b chains f.a{
	}
}
