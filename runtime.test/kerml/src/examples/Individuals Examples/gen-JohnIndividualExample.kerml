package JohnIndividualExample{
	private import Objects :: *;
	class Person :> Object{
		doc /*
		  This is the class of persons, each of whom has an age.
		  It is NOT restricted to maximal portions.
		  (The specialization of Object would normally be left implicit.)
		*/
		class Life :> Person , Occurrences::Life;
		feature age : ScalarValues::Natural{
		}
		feature : Person :>> portions{
			doc /*
		    These redefinitions enforce the "rigidity" constraint for Person.
		    They ensure that all portions of a person are also persons and 
		    that a person can only be a portion of another person. This implies
		    that the class Person must also include all the portions of any one 
		    of its instances. The redefinitions for the portion features
		    also implicitly constraint the typing of the time slice and snapshot
		    features, since they are subsets of portioning.
		    (It is currently awkward to have to declare these redefinitions
		    explicitly.)
		  */
		}
		feature : Person :>> portionOf{
		}
	}
	class President :> Person{
		doc /*
		  This is the class of presidents, each of which must be a time slice
		  of the life of some individual person.
		  (Note that this class is NOT "rigid".)
		*/
		feature [ 1 ] : Person::Life :>> timeSliceOf{
		}
	}
	class John :> Person{
		doc /*
		  This is the class of the specific (individual) person who is John.
		  There is at most one such person.
		*/
		class all JohnLife [ 0 .. 1 ] :> John , Occurrences::Life;
	}
	class JohnAsPresident :> John , President{
		doc /*
		  This is the class of time slices of John's life in which he is
		  a president.
		*/
	}
	class Country :> Object{
		doc /*
		  This is the class of countries, each of which may have at most one
		  president.
		*/
		class all Life :> Country , Occurrences::Life;
		feature presidentOfCountry [ 0 .. 1 ] : President{
		}
		// Rigidity constraint.
		feature : Country :>> portions{
		}
		feature : Country :>> portionOf{
		}
	}
	class UnitedStates :> Country{
		doc /*
		  This is the class of the specific country that is the
		  United States. It contains a single instance. The United States
		  always has a president who must be at least 35 years old.
		*/
		class all USLife [ 1 ] :> UnitedStates , Occurrences::Life;
		feature presidentOfUS [ 1 ] :>> presidentOfCountry{
			inv{
				age >= 35
			}
		}
	}
	class UnitedStatesWithJohnAsPresident :> UnitedStates{
		doc /*
		  This is the class of time slices of the United States during
		  which John is president of the United States.
		*/
		feature : UnitedStates::Life :>> timeSliceOf{
		}
		feature : JohnAsPresident :>> presidentOfUS{
		}
	}
}
