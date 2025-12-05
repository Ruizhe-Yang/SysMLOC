package ConnectionTest{
	part p{
		part x{
			part x1;
		}
	}
	part def P{
		part y;
		connect p to y;
		part p1 :> p;
		connect p1.x to y;
		connect p1.x.x1 to y;
	}
	abstract connection def C{
		part p;
		end end1;
		end end2;
		end end3;
	}
	part d1;
	part d2;
	part d3;
	part d4;
	connection bus : C connect ( d1 , d2 , d3 , d4 );
	connection : C{
		end ::> d1 :>> end1;
		end end2 ::> d2;
		end end3 ::> d3;
	}
	connection{
		part q;
		end ref end1 :> q ::> d1;
		end end2 ::> d2;
	}
	abstract flow def F;
	message : F p to p;
	part def A{
		ref b : B;
	}
	part def B;
	connection def AB{
		end [ 1 ] item a : A{
			metadata M;
		}
		end b : B;
	}
	metadata def M;
}
