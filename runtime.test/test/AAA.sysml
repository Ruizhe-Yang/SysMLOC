package AAA{
	private import Quantities::*;
	part def BBB;
	part def CCC;
	item def Parent;
	part def AAA :> BBB, CCC;
	part def ChildClass specializes Parent;
	part a{
		part c{
			part def eee;
			part ggg{
				port def bbbb;
			}
		}
	}
	package AA{
		private import ISQ::*;
		part d{
			private import ScalarValues::Real;
			private import a::c::ggg::*;
			
			port ff : bbbb;
			public import ScalarValues::*;
			part ee{
				requirement def h;
				requirement hh : h;
				end aa : bbbb;
				attribute def no1 :> String;
				attribute noo1 : no1 = "00";
				attribute no2 = NaturalFunctions::ToNatural(noo1);
				attribute no3 = IntegerFunctions::sum(1);
				attribute no4 = 1.0[SI::s];
				
				//part gg : ff;
			}
		}	
	}
	public import SysML::*;
	part Apartusage : Parts::Part{
		port port1 :> ownedPorts;
		action action1 :> ownedActions;
	}
	
	part aaa = Apartusage.done;
	part aaaq = Apartusage.spaceTimeEnclosedOccurrences;
	part aaaa = Apartusage.sameLifeOccurrences;
	
	requirement ARequirementUsage : Requirements::PerformanceRequirementCheck{
		subject Apartusage;
	}
}