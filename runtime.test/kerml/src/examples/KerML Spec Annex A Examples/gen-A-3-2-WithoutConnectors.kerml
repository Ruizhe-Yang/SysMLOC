package WithoutConnectorsModelToBeExecuted{
	doc /* 
	 */
	classifier Bicycle{
		feature rollsOn [ 2 ] : Wheel{
		}
		feature holdsWheel [ * ] : BikeFork{
		}
	}
	classifier Wheel;
	classifier BikeFork;
}
package WithoutConnectorsExecution{
	doc /* 
	 */
	private import Atoms :: *;
	private import WithoutConnectorsModelToBeExecuted :: *;
	#atom classifier MyWheel1 :> Wheel;
	#atom classifier MyWheel2 :> Wheel;
	classifier MyWheel unions MyWheel1 unions MyWheel2;
	#atom classifier MyBike :> Bicycle{
		feature : MyWheel :>> rollsOn{
		}
	}
}
