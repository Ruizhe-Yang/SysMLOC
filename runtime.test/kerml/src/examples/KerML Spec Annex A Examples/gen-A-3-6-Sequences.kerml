package SequencesModelToBeExecuted{
	doc /* 
	 */
	behavior Manufacture{
		step paint [ 1 ] : Paint;
		step dry [ * ] : Dry;
		succession p_before_d first [ 1 ] paint then [ 1 ] dry;
		step ship [ * ] : Ship;
		succession d_before_s first [ 1 ] dry then [ 1 ] ship;
	}
	behavior Paint;
	behavior Dry;
	behavior Ship;
}
package SequencesExecution{
	doc /* 
	 */
	private import Atoms :: *;
	private import SequencesModelToBeExecuted :: *;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensBefore;
	#atom behavior MyPaint :> Paint;
	#atom behavior MyDry :> Dry;
	#atom assoc MyPaint_Before_Dry_Link :> HappensBefore{
		end feature : MyPaint :>> earlierOccurrence{
		}
		end feature : MyDry :>> laterOccurrence{
		}
	}
	behavior MyManufactureStepsPD unions MyPaint unions MyDry;
	#atom behavior MyShip :> Ship;
	#atom assoc MyDry_Before_Ship_Link :> HappensBefore{
		end feature : MyDry :>> earlierOccurrence{
		}
		end feature : MyShip :>> laterOccurrence{
		}
	}
	behavior MyManufactureStepsPDS unions MyManufactureStepsPD unions MyShip;
	#atom behavior MyManufacture :> Manufacture{
		feature [ 3 ] : MyManufactureStepsPDS :>> timeEnclosedOccurrences{
		}
		step : MyPaint :>> paint;
		step [ 1 ] : MyDry :>> dry;
		succession [ 1 ] : MyPaint_Before_Dry_Link :>> p_before_d first paint then dry;
		step [ 1 ] : MyShip :>> ship;
		succession [ 1 ] : MyDry_Before_Ship_Link :>> d_before_s first dry then ship;
	}
}
