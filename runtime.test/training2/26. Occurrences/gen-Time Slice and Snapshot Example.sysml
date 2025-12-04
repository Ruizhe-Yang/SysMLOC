package 'Time Slice and Snapshot Example'{
	attribute def Date;
	item def Person;
	part def Vehicle{
		timeslice assembly;
		first assembly then delivery;
		snapshot delivery{
			attribute deliveryDate : Date;
		}
		then timeslice ownership [ 0 .. * ordered snapshot sale = start;
		ref item owner [ 1 ] : Person;
		timeslice driven [ 0 .. * ]{
			ref item driver [ 1 ] : Person;
		}
	}
	snapshot junked = done;
}
}
