package 'Filtering Example-1'{
	private import ScalarValues::Boolean;
	metadata def Safety{
		attribute isMandatory : Boolean;
	}
	part vehicle{
		part interior{
			part alarm;
			part seatBelt [ 2 ]{
				metadata Safety{
					isMandatory = true;
				}
			}
			part frontSeat [ 2 ];
			part driverAirBag{
				metadata Safety{
					isMandatory = false;
				}
			}
		}
		part bodyAssy{
			part body;
			part bumper{
				metadata Safety{
					isMandatory = true;
				}
			}
			part keylessEntry;
		}
		part wheelAssy{
			part wheel [ 2 ];
			part antilockBrakes [ 2 ]{
				metadata Safety{
					isMandatory = false;
				}
			}
		}
	}
	package 'Safety Features'{
		/* Parts that contribute to safety. */
		public import vehicle :: **;
		filter @Safety;
	}
	package 'Mandatory Safety Features'{
		/* Parts that contribute to safety AND are mandatory. */
		public import vehicle :: **;
		filter @Safety and Safety::isMandatory;
	}
}
