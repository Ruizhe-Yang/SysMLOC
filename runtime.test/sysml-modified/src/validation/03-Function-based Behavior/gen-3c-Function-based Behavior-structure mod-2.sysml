package '3c-Function-based Behavior-structure mod-2'{
	part def Vehicle;
	part def VehicleFrame;
	part def HitchBall;
	part def TrailerCoupler;
	part def Trailer;
	part def TrailerFrame;
	connection def TrailerHitch{
		end hitch : HitchBall;
		end coupler : TrailerCoupler;
	}
	part 'vehicle-trailer system'{
		part vehicle : Vehicle{
			part vehicleFrame : VehicleFrame{
				part hitch : HitchBall;
			}
		}
		connection trailerHitch [ 0 .. 1 ] : TrailerHitch connect vehicle.vehicleFrame.hitch to trailer.trailerFrame.coupler;
		part trailer : Trailer{
			part trailerFrame : TrailerFrame{
				part coupler : TrailerCoupler;
			}
		}
		perform action{
			action 'connect trailer to vehicle'{
				// Assert that exactly one connection exists during the
				// performance of this action.
				abstract ref [ 1 ] :>> trailerHitch;
			}
			then action 'disconnect trailer from vehicle'{
				// Assert that exactly no connection exists during the
				// performance of this action.
				abstract ref [ 0 ] :>> trailerHitch;
			}
		}
	}
}
