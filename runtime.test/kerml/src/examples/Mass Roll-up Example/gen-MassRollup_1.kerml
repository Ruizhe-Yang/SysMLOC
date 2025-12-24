package MassRollup_1{
	private import NumericalFunctions :: *;
	class MassedThing{
		feature mass : ScalarValues::Real{
		}
		composite subcomponents [ 0 .. * ] : MassedThing{
		}
		feature totalMass : ScalarValues::Real = mass + sum(subcomponents.totalMass){
		}
	}
}
