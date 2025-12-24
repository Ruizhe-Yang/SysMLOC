package DecisionsAndMergesModelToBeExecuted{
	doc /* 
	 */
	private import ControlPerformances::DecisionPerformance;
	private import ControlPerformances::MergePerformance;
	private import Occurrences::HappensBefore;
	private import Links::SelfLink;
	behavior Manufacture{
		/* Before decision. */
		step admit [ 1 ] : Admit;
		succession a_before_i first [ 1 ] admit then [ 1 ] inspect;
		/* Decision. */
		step inspect [ * ] : DecisionPerformance;
		/* Two decision branches. */
		succession i_before_f first [ 1 ] inspect then [ 0 .. 1 ] finish;
		step finish [ * ] : Touchup;
		succession i_before_r first [ 1 ] inspect then [ 0 .. 1 ] recycle;
		step recycle [ * ] : MarkForRecycling;
		/* Two merge branches. */
		succession f_before_ms first [ 0 .. 1 ] finish then [ 1 ] mShip;
		succession r_before_ms first [ 0 .. 1 ] recycle then [ 1 ] mShip;
		/* Merge */
		step mShip [ * ] : MergePerformance;
		/* After merge */
		succession ms_before_s first [ 1 ] mShip then [ 1 ] ship;
		step ship [ * ] : Ship;
		/* Decision and merge timing constraints. */
		feature inspectOutgoingHBLinks [ * ] : HappensBefore unions i_before_f unions i_before_r{
		}
		connector bindIOHBL : SelfLink from [ 1 ] inspectOutgoingHBLinks to [ 1 ] inspect.outgoingHBLink;
		feature mShipIncomingHBLinks [ * ] : HappensBefore unions f_before_ms unions r_before_ms{
		}
		connector bindmSIHBL : SelfLink from [ 1 ] mShipIncomingHBLinks to [ 1 ] mShip.incomingHBLink;
	}
	behavior Admit;
	behavior Touchup;
	behavior MarkForRecycling;
	behavior Ship;
}
package DecisionsAndMergesExecution{
	doc /* 
	 */
	private import Atoms :: *;
	private import DecisionsAndMergesModelToBeExecuted :: *;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensBefore;
	private import ControlPerformances::DecisionPerformance;
	private import ControlPerformances::MergePerformance;
	/* Before decision. */
	#atom behavior MyAdmit :> Admit;
	/* Decision. */
	#atom behavior MyInspect :> DecisionPerformance;
	#atom assoc MyAdmit_Before_Inspect_Link :> HappensBefore{
		end feature : MyAdmit :>> earlierOccurrence{
		}
		end feature : MyInspect :>> laterOccurrence{
		}
	}
	/* One decision branch taken. */
	#atom behavior MyTouchup :> Touchup;
	#atom assoc MyInspect_Before_Touchup_Link :> HappensBefore{
		end feature : MyInspect :>> earlierOccurrence{
		}
		end feature : MyTouchup :>> laterOccurrence{
		}
	}
	/* One merge branch taken. Merge. */
	#atom behavior MyMergeToShip :> MergePerformance;
	#atom assoc MyTouchup_Before_Merge_Link :> HappensBefore{
		end feature : MyTouchup :>> earlierOccurrence{
		}
		end feature : MyMergeToShip :>> laterOccurrence{
		}
	}
	/* After merge. */
	#atom behavior MyShip :> Ship;
	#atom assoc MyMerge_Before_Ship_Link :> HappensBefore{
		end feature : MyMergeToShip :>> earlierOccurrence{
		}
		end feature : Ship :>> laterOccurrence{
		}
	}
	behavior MyManufactureSteps unions MyAdmit unions MyInspect unions MyTouchup unions MyMergeToShip unions MyShip;
	#atom behavior MyManufacture :> Manufacture{
		feature [ 5 ] : MyManufactureSteps :>> timeEnclosedOccurrences{
		}
		/* Before decision. */
		step [ 1 ] : MyAdmit :>> admit;
		/* Decision. */
		step [ 1 ] : MyInspect :>> inspect;
		succession [ 1 ] : MyAdmit_Before_Inspect_Link :>> a_before_i first admit then inspect;
		/* One decision branch taken. */
		step [ 1 ] : MyTouchup :>> finish;
		succession [ 1 ] : MyInspect_Before_Touchup_Link :>> i_before_f first inspect then finish;
		/* One merge branch taken. */
		succession [ 1 ] : MyTouchup_Before_Merge_Link :>> f_before_ms first finish then mShip;
		/* Merge. */
		step [ 1 ] : MyMergeToShip :>> mShip;
		/* After merge */
		step [ 1 ] : MyShip :>> ship;
		succession [ 1 ] : MyMerge_Before_Ship_Link :>> ms_before_s first mShip then ship;
		/* Decision and merge timing constraints. */
		feature : MyInspect_Before_Touchup_Link :>> inspectOutgoingHBLinks{
		}
		feature : MyTouchup_Before_Merge_Link :>> mShipIncomingHBLinks{
		}
	}
}
