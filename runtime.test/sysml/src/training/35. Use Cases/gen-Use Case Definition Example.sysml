package 'Use Case Definition Example'{
	part def Vehicle;
	part def Person;
	part def Environment;
	part def 'Fuel Station';
	use case def 'Provide Transportation'{
		subject vehicle : Vehicle;
		actor driver : Person;
		actor passengers [ 0 .. 4 ] : Person;
		actor environment : Environment;
		objective{
			doc /* Transport driver and passengers from starting location 
			 * to ending location.
			 */
		}
	}
	use case def 'Enter Vehicle'{
		subject vehicle : Vehicle;
		actor driver : Person;
		actor passengers [ 0 .. 4 ] : Person;
	}
	use case def 'Exit Vehicle'{
		subject vehicle : Vehicle;
		actor driver : Person;
		actor passengers [ 0 .. 4 ] : Person;
	}
}
