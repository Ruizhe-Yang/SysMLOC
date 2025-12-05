package 'Individuals and Time Slices'{
	private import 'Individuals and Snapshots Example' :: *;
	individual item def Alice : Person;
	individual item def Bob : Person;
	individual : Vehicle_1{
		timeslice aliceDriving{
			ref individual item : Alice :>> driver;
			snapshot :>> start{
				:>> mass = 2000.0;
			}
			snapshot :>> done{
				:>> mass = 1500.0;
			}
		}
		then timeslice bobDriving{
			ref individual item : Bob :>> driver;
		}
	}
}
