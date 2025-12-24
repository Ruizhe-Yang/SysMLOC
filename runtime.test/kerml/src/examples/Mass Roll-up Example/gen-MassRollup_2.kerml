package MassRollup_2{
	private import NumericalFunctions :: *;
	private import ISQ :: *;
	class MassedThing{
		feature mass : ScalarValues::Real{
		}
		feature totalMass : ScalarValues::Real = mass + sum(subcomponents.totalMass){
		}
		feature subcomponents :>> massedThings{
		}
	}
	feature massedThings [ 0 .. * ] : MassedThing{
	}
}
