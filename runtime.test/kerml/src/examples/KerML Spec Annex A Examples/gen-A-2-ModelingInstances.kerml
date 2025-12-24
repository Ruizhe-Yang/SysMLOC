package ModelingInstances{
	doc /* 
	 */
	classifier Vehicle;
	classifier Bicycle :> Vehicle;
	classifier MyBike [ 1 ] :> Bicycle;
	classifier YourBike [ 1 ] :> Bicycle disjoint from MyBike;
}
package ModelingInstancesWithAtoms{
	doc /* 
	 */
	private import Atoms::atom;
	classifier Vehicle;
	classifier Bicycle :> Vehicle;
	#atom classifier MyBike :> Bicycle;
	#atom classifier YourBike :> Bicycle;
	/* Assigning feature values. */
	classifier Garage{
		feature stores [ * ] : Bicycle{
		}
	}
	classifier OurBicycle unions MyBike unions YourBike;
	#atom classifier OurGarage :> Garage{
		feature [ 2 ] : OurBicycle :>> stores{
		}
	}
}
