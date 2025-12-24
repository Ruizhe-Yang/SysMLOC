package TimingForStructuresModelToBeExecuted1{
	doc /* 
	 */
	private import WithoutConnectorsModelToBeExecuted::Wheel;
	private import WithoutConnectorsModelToBeExecuted::BikeFork;
	private import Occurrences::Occurrence;
	struct Bicycle{
		feature rollsOn [ 2 ] : Wheel :> timeCoincidentOccurrences{
		}
		feature holdsWheel [ 2 ] : BikeFork :> timeCoincidentOccurrences{
		}
	}
}
package TimingForStructuresExecution1{
	doc /* 
	 */
	private import Atoms :: *;
	private import TimingForStructuresModelToBeExecuted1 :: *;
	private import OneToOneConnectorsExecution::MyWheel;
	private import OneToOneConnectorsExecution::MyBikeFork;
	struct MyBikeTimeCoincident unions MyWheel unions MyBikeFork unions MyBike;
	#atom struct MyBike :> Bicycle{
		feature : MyBike :>> self{
		}
		feature [ 5 ] : MyBikeTimeCoincident :>> timeCoincidentOccurrences{
		}
		feature : MyWheel :>> rollsOn{
		}
		feature : MyBikeFork :>> holdsWheel{
		}
	}
}
package TimingForStructuresModelToBeExecuted2{
	doc /* 
	 */
	private import WithoutConnectorsModelToBeExecuted::Wheel;
	private import WithoutConnectorsModelToBeExecuted::BikeFork;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensDuring;
	struct Bicycle{
		feature rollsOn [ 2 ] : Wheel{
		}
		feature holdsWheel [ 2 ] : BikeFork{
		}
		feature allParts : Occurrence unions rollsOn unions holdsWheel{
		}
		connector b_during_ap : HappensDuring from [ 1 ] self to [ * ] allParts;
	}
}
package TimingForStructuresExecution2{
	doc /* 
	 */
	private import Atoms :: *;
	private import TimingForStructuresModelToBeExecuted2 :: *;
	private import Occurrences::HappensDuring;
	private import OneToOneConnectorsExecution::MyWheel;
	private import OneToOneConnectorsExecution::MyBikeFork;
	struct MyWheel1 :> OneToOneConnectorsExecution::MyWheel1;
	struct MyWheel2 :> OneToOneConnectorsExecution::MyWheel2;
	struct MyBikeFork1 :> OneToOneConnectorsExecution::MyBikeFork1;
	struct MyBikeFork2 :> OneToOneConnectorsExecution::MyBikeFork2;
	#atom assoc MyBike_During_Wheel1_Link :> HappensDuring{
		end feature : MyBike :>> shorterOccurrence{
		}
		end feature : MyWheel1 :>> longerOccurrence{
		}
	}
	#atom assoc MyBike_During_Wheel2_Link :> HappensDuring{
		end feature : MyBike :>> shorterOccurrence{
		}
		end feature : MyWheel2 :>> longerOccurrence{
		}
	}
	#atom assoc MyBike_During_Fork1_Link :> HappensDuring{
		end feature : MyBike :>> shorterOccurrence{
		}
		end feature : MyBikeFork1 :>> longerOccurrence{
		}
	}
	#atom assoc MyBike_During_Fork2_Link :> HappensDuring{
		end feature : MyBike :>> shorterOccurrence{
		}
		end feature : MyBikeFork2 :>> longerOccurrence{
		}
	}
	assoc MyBike_During_Parts_Link :> HappensDuring unions MyBike_During_Wheel1_Link unions MyBike_During_Fork1_Link unions MyBike_During_Wheel2_Link unions MyBike_During_Fork2_Link;
	struct MyBikeParts unions MyWheel unions MyBikeFork;
	#atom struct MyBike :> Bicycle{
		feature : MyWheel :>> rollsOn{
		}
		feature : MyBikeFork :>> holdsWheel{
		}
		feature [ 4 ] : MyBikeParts :>> allParts{
		}
		feature : MyBike :>> self{
		}
		connector [ 4 ] : MyBike_During_Parts_Link :>> b_during_ap from [ 1 ] self to [ * ] allParts;
	}
}
package TimingForStructuresModelToBeExecuted3{
	doc /* 
	 */
	private import WithoutConnectorsModelToBeExecuted::Wheel;
	private import WithoutConnectorsModelToBeExecuted::BikeFork;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensWhile;
	struct Bicycle{
		feature rollsOn [ 2 ] : Wheel{
		}
		feature holdsWheel [ 2 ] : BikeFork{
		}
		feature allParts : Occurrence unions rollsOn unions holdsWheel{
		}
		feature : Bicycle :>> endShot{
		}
		connector be_while_pe : HappensWhile from [ 1 ] endShot to [ * ] endShot.allParts.endShot;
	}
}
package TimingForStructuresExecution3{
	doc /* 
	 */
	private import Atoms :: *;
	private import TimingForStructuresModelToBeExecuted3 :: *;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensWhile;
	private import WithoutConnectorsModelToBeExecuted::Wheel;
	private import WithoutConnectorsModelToBeExecuted::BikeFork;
	/* End atoms */
	#atom struct MyWheel1End :> Wheel;
	#atom struct MyWheel1 :> Wheel{
		feature : MyWheel1End :>> endShot{
		}
	}
	#atom struct MyWheel2End :> Wheel;
	#atom struct MyWheel2 :> Wheel{
		feature : MyWheel2End :>> endShot{
		}
	}
	struct MyBikeFork1End :> BikeFork;
	#atom struct MyBikeFork1 :> BikeFork{
		feature : MyBikeFork1End :>> endShot{
		}
	}
	struct MyBikeFork2End :> BikeFork;
	#atom struct MyBikeFork2 :> BikeFork{
		feature : MyBikeFork2End :>> endShot{
		}
	}
	#atom struct MyBikeEnd :> Bicycle;
	/* HappensWhile atoms */
	#atom assoc MyBikeEnd_While_Wheel1End_Link :> HappensWhile{
		end feature : MyBikeEnd :>> thisOccurrence{
		}
		end feature : MyWheel1End :>> thatOccurrence{
		}
	}
	#atom assoc MyBikeEnd_While_Wheel2End_Link :> HappensWhile{
		end feature : MyBikeEnd :>> thisOccurrence{
		}
		end feature : MyWheel2End :>> thatOccurrence{
		}
	}
	#atom assoc MyBikeEnd_While_Fork1End_Link :> HappensWhile{
		end feature : MyBikeEnd :>> thisOccurrence{
		}
		end feature : MyBikeFork1End :>> thatOccurrence{
		}
	}
	#atom assoc MyBikeEnd_While_Fork2End_Link :> HappensWhile{
		end feature : MyBikeEnd :>> thisOccurrence{
		}
		end feature : MyBikeFork2End :>> thatOccurrence{
		}
	}
	assoc MyBikeEnd_While_PartsEnd_Link :> HappensWhile unions MyBikeEnd_While_Wheel1End_Link unions MyBikeEnd_While_Fork1End_Link unions MyBikeEnd_While_Wheel2End_Link unions MyBikeEnd_While_Fork2End_Link;
	#atom struct MyBike :> Bicycle{
		feature : MyBikeEnd :>> endShot{
		}
		connector [ 4 ] : MyBikeEnd_While_PartsEnd_Link :>> be_while_pe from [ 1 ] endShot to [ * ] endShot.allParts.endShot;
	}
}
