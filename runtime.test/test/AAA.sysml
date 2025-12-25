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
			package ee{
				part def bbbb :> AAA;
			}
		}
	}
	package AA{
		private import ISQ::*;
		part d{
			private import ScalarValues::Real;
			private import a::c::ee::bbbb;
			private import SI::*;
			part def ff :> bbbb;
			part ee{
				part def h;
				part hh : h;
				part aa : bbbb;
				part gg : ff;
			}
		}	
	}
}