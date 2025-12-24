package OneToOneConnectorsModelToBeExecuted{
	doc /* 
	 */
	public import WithoutConnectorsModelToBeExecuted::Wheel;
	public import WithoutConnectorsModelToBeExecuted::BikeFork;
	classifier Bicycle{
		feature rollsOn [ 2 ] : Wheel{
		}
		feature holdsWheel [ * ] : BikeFork{
		}
		connector fixWheel : BikeWheelFixed from [ 1 ] rollsOn to [ 1 ] holdsWheel;
	}
	assoc BikeWheelFixed{
		end feature wheel : Wheel{
		}
		end feature fixedTo : BikeFork{
		}
	}
}
package OneToOneConnectorsExecution{
	doc /* 
	 */
	private import Atoms :: *;
	public import OneToOneConnectorsModelToBeExecuted :: *;
	public import WithoutConnectorsExecution::MyWheel1;
	public import WithoutConnectorsExecution::MyWheel2;
	public import WithoutConnectorsExecution::MyWheel;
	#atom classifier MyBikeFork1 :> BikeFork;
	#atom classifier MyBikeFork2 :> BikeFork;
	classifier MyBikeFork unions MyBikeFork1 unions MyBikeFork2;
	#atom assoc MyBikeWheel1_Fork1_BWF_Link :> BikeWheelFixed{
		end feature : MyWheel1 :>> wheel{
		}
		end feature : MyBikeFork1 :>> fixedTo{
		}
	}
	#atom assoc MyBikeWheel2_Fork2_BWF_Link :> BikeWheelFixed{
		end feature : MyWheel2 :>> wheel{
		}
		end feature : MyBikeFork2 :>> fixedTo{
		}
	}
	classifier MyBikeWheel_Fork_BWF_Link unions MyBikeWheel1_Fork1_BWF_Link unions MyBikeWheel2_Fork2_BWF_Link;
	#atom classifier MyBike :> Bicycle{
		feature : MyWheel :>> rollsOn{
		}
		feature : MyBikeFork :>> holdsWheel{
		}
		connector [ 2 ] : MyBikeWheel_Fork_BWF_Link :>> fixWheel from [ 1 ] rollsOn to [ 1 ] holdsWheel;
	}
}
