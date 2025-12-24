package OneToUnrestrictedConnectorsModelToBeExecuted{
	doc /* 
	 */
	private import WithoutConnectorsModelToBeExecuted::BikeFork;
	classifier Bicycle{
		feature carrier [ * ] : BikeBasket{
		}
		feature holdsWheel [ * ] : BikeFork{
		}
		connector carrierFixed : BikeBasketFixed from [ * ] carrier to [ 1 ] holdsWheel;
	}
	classifier BikeBasket;
	assoc BikeBasketFixed{
		end feature basket : BikeBasket{
		}
		end feature fixedTo : BikeFork{
		}
	}
}
package OneToUnrestrictedConnectorsExecution{
	doc /* 
	 */
	private import Atoms :: *;
	private import OneToUnrestrictedConnectorsModelToBeExecuted :: *;
	private import OneToOneConnectorsExecution::MyBikeFork1;
	private import OneToOneConnectorsExecution::MyBikeFork2;
	private import OneToOneConnectorsExecution::MyBikeFork;
	#atom classifier MyBikeBasket1 :> BikeBasket;
	#atom classifier MyBikeBasket2 :> BikeBasket;
	classifier MyBikeBasket unions MyBikeBasket1 unions MyBikeBasket2;
	#atom assoc MyBikeBasket1_Fork1_BBF_Link :> BikeBasketFixed{
		end feature : MyBikeBasket1 :>> basket{
		}
		end feature : MyBikeFork1 :>> fixedTo{
		}
	}
	#atom assoc MyBikeBasket2_Fork1_BBF_Link :> BikeBasketFixed{
		end feature : MyBikeBasket2 :>> basket{
		}
		end feature : MyBikeFork1 :>> fixedTo{
		}
	}
	classifier MyBikeBasket_Fork_BBF_Link unions MyBikeBasket1_Fork1_BBF_Link unions MyBikeBasket2_Fork1_BBF_Link;
	#atom classifier MyBike :> Bicycle{
		feature [ 2 ] : MyBikeBasket :>> carrier{
		}
		feature [ 2 ] : MyBikeFork :>> holdsWheel{
		}
		connector [ 2 ] : MyBikeBasket_Fork_BBF_Link :>> carrierFixed from [ * ] carrier to [ 1 ] holdsWheel;
	}
}
