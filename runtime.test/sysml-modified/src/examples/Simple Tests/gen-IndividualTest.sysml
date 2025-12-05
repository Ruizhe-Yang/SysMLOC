package IndividualTest{
	individual def IO1;
	individual occurrence def IO2{
		individual io : IO1;
	}
	individual item def II1{
		individual item ii : II1;
	}
	item def I{
		part i : I;
	}
	individual item def II2 : I{
		individual item : II2 :>> i;
	}
	individual part def IP1{
		individual part p : IP1;
	}
	part def P{
		part p : P;
	}
	individual part def IP2 : P{
		individual part : IP2 :>> p;
	}
	individual action def AP1{
		individual action a : AP1;
	}
	action def A{
		action a : A;
	}
	individual action def IA2 : A{
		individual action : IA2 :>> a;
	}
}
