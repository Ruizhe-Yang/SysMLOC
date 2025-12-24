package ChangingFeatureValuesModelToBeExecuted{
	doc /* 
	 */
	private import ScalarValues::Boolean;
	private import FeatureReferencingPerformances::FeatureWritePerformance;
	behavior Manufacture{
		feature objectToFinish [ 1 ] : Product{
		}
		step paint [ 1 ] : Paint{
			:>> objectToPaint = objectToFinish{
			}
		}
		step dry [ * ] : Dry{
			:>> objectToDry = objectToFinish{
			}
		}
		succession p_before_d first [ 1 ] paint then [ 1 ] dry;
		step ship [ * ] : Ship{
			:>> objectToShip = objectToFinish{
			}
		}
		succession d_before_s first [ 1 ] dry then [ 1 ] ship;
	}
	struct Product{
		var feature isPainted [ 1 ] : Boolean := false{
		}
		var feature isDry [ 1 ] : Boolean := true{
		}
		var feature isShipped [ 1 ] : Boolean := false{
		}
	}
	behavior Paint{
		feature objectToPaint [ 1 ] : Product{
		}
		step painting [ 1 ] : FeatureWritePerformance{
			in : Product :>> onOccurrence = objectToPaint{
				: Product :>> startingAt{
					[ 1 ] : Boolean :> isDry :>> accessedFeature{
					}
				}
			}
			in :>> replacementValues = false{
			}
		}
		succession p_before_p first [ 1 ] painting then [ 1 ] painted;
		step painted [ * ] : FeatureWritePerformance{
			in : Product :>> onOccurrence = objectToPaint{
				: Product :>> startingAt{
					[ 1 ] : Boolean :> isPainted :>> accessedFeature{
					}
				}
			}
			in :>> replacementValues = true{
			}
		}
	}
	behavior Dry{
		feature objectToDry [ 1 ] : Product{
		}
		step dried [ 1 ] : FeatureWritePerformance{
			in : Product :>> onOccurrence = objectToDry{
				: Product :>> startingAt{
					[ 1 ] : Boolean :> isDry :>> accessedFeature{
					}
				}
			}
			in :>> replacementValues = true{
			}
		}
	}
	behavior Ship{
		feature objectToShip [ 1 ] : Product{
		}
		step shipped [ 1 ] : FeatureWritePerformance{
			in : Product :>> onOccurrence = objectToShip{
				: Product :>> startingAt{
					[ 1 ] : Boolean :> isShipped :>> accessedFeature{
					}
				}
			}
			in :>> replacementValues = true{
			}
		}
	}
}
package ChangingFeatureValuesExecution{
	doc /* 
	 */
	private import Atoms :: *;
	private import ChangingFeatureValuesModelToBeExecuted :: *;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensBefore;
	private import FeatureReferencingPerformances::FeatureWritePerformance;
	struct ProductTimeSlice :> Product{
		feature :>> isPainted{
		}
		feature :>> isDry{
		}
		feature :>> isShipped{
		}
	}
	#atom struct MyProduct :> Product{
		feature beforePaint [ 1 ] : ProductTimeSlice :> timeSlices{
		}
		feature whilePainting [ 1 ] : ProductTimeSlice :> timeSlices{
		}
		feature afterPaint [ 1 ] : ProductTimeSlice :> timeSlices{
		}
		feature afterDry [ 1 ] : ProductTimeSlice :> timeSlices{
		}
		feature afterShip [ 1 ] : ProductTimeSlice :> timeSlices{
		}
	}
	behavior MyProductFeatureWrite :> FeatureWritePerformance{
		in : MyProduct :>> onOccurrence{
		}
	}
	#atom behavior PaintingMyProductFeatureWrite :> MyProductFeatureWrite;
	#atom behavior PaintedMyProductFeatureWrite :> MyProductFeatureWrite;
	#atom assoc MyPaintingFW_Before_PaintFW_Link :> HappensBefore{
		end feature : PaintingMyProductFeatureWrite :>> earlierOccurrence{
		}
		end feature : PaintedMyProductFeatureWrite :>> laterOccurrence{
		}
	}
	#atom behavior MyPaint :> Paint{
		feature : MyProduct :>> objectToPaint{
		}
		step : PaintingMyProductFeatureWrite :>> painting{
			in onOccurrence{
			}
		}
		step : PaintedMyProductFeatureWrite :>> painted{
			in onOccurrence{
			}
		}
		succession : MyPaintingFW_Before_PaintFW_Link :>> p_before_p first painting then painted;
	}
	#atom behavior MyDry :> Dry{
		feature : MyProduct :>> objectToDry{
		}
		step : MyProductFeatureWrite :>> dried{
			in onOccurrence{
			}
		}
	}
	#atom assoc MyPaint_Before_Dry_Link :> HappensBefore{
		end feature : MyPaint :>> earlierOccurrence{
		}
		end feature : MyDry :>> laterOccurrence{
		}
	}
	#atom behavior MyShip :> Ship{
		feature : MyProduct :>> objectToShip{
		}
		step : MyProductFeatureWrite :>> shipped{
			in onOccurrence{
			}
		}
	}
	#atom assoc MyDry_Before_Ship_Link :> HappensBefore{
		end feature : MyDry :>> earlierOccurrence{
		}
		end feature : MyShip :>> laterOccurrence{
		}
	}
	#atom behavior MyManufacture :> Manufacture{
		feature : MyProduct :>> objectToFinish{
		}
		feature :> objectToFinish.beforePaint.startShot.timeCoincidentOccurrences :>> startShot{
		}
		feature obPiP chains objectToFinish.beforePaint.isPainted = false{
		}
		feature obPiD chains objectToFinish.beforePaint.isDry = true{
		}
		feature obPiS chains objectToFinish.beforePaint.isShipped = false{
		}
		step : MyPaint :>> paint{
			feature :>> paint::objectToPaint :>> MyPaint::objectToPaint{
			}
		}
		feature :> objectToFinish.beforePaint.immediateSuccessors :> objectToFinish.whilePainting.startShot.timeCoincidentOccurrences chains paint.painting.endShot{
		}
		feature owPiP chains objectToFinish.whilePainting.isPainted = false{
		}
		feature owPiD chains objectToFinish.whilePainting.isDry = false{
		}
		feature owPiS chains objectToFinish.whilePainting.isShipped = false{
		}
		feature :> objectToFinish.whilePainting.immediateSuccessors :> objectToFinish.afterPaint.startShot.timeCoincidentOccurrences chains paint.painted.endShot{
		}
		feature oaPiP chains objectToFinish.afterPaint.isPainted = true{
		}
		feature oaPiD chains objectToFinish.afterPaint.isDry = false{
		}
		feature oaPiS chains objectToFinish.afterPaint.isShipped = false{
		}
		step : MyDry :>> dry{
			feature :>> dry::objectToDry :>> MyDry::objectToDry{
			}
		}
		succession [ 1 ] : MyPaint_Before_Dry_Link :>> p_before_d first paint then dry;
		feature :> objectToFinish.afterPaint.immediateSuccessors :> objectToFinish.afterDry.startShot.timeCoincidentOccurrences chains dry.dried.endShot{
		}
		feature oaDiP chains objectToFinish.afterDry.isPainted = true{
		}
		feature oaDiD chains objectToFinish.afterDry.isDry = true{
		}
		feature oaDiS chains objectToFinish.afterDry.isShipped = false{
		}
		step : MyShip :>> ship{
			feature :>> ship::objectToShip :>> MyShip::objectToShip{
			}
		}
		succession [ 1 ] : MyDry_Before_Ship_Link :>> d_before_s first dry then ship;
		feature :> objectToFinish.afterDry.immediateSuccessors :> objectToFinish.afterShip.startShot.timeCoincidentOccurrences chains ship.shipped.endShot{
		}
		feature :> objectToFinish.afterShip.timeCoincidentOccurrences :>> endShot{
		}
		feature oaSiP chains objectToFinish.afterShip.isPainted = true{
		}
		feature oaSiD chains objectToFinish.afterShip.isDry = true{
		}
		feature oaSiS chains objectToFinish.afterShip.isShipped = true{
		}
	}
}
