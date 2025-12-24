package Features{
	classifier A;
	classifier B;
	feature f{
	}
	feature g{
	}
	feature x : A : B :> g ::> f{
	}
	// Equivalent declaration:
	feature x1 : A : B :> g :> f{
	}
	classifier C;
	feature y{
	}
	featuring F of y by C;
	feature y1 : A :> x featured by C{
	}
	feature z disjoint from y unions f unions g{
	}
	feature z1 intersects f intersects g differences y differences y1 differences z{
	}
	classifier Person;
	abstract feature person : Person{
	}
	// Default subsets Base::things.
	feature child :> person{
	}
	feature adult differences person differences child{
	}
	classifier Fuel;
	classifier Tanks{
		feature fuelInPort{
			in feature fuelFlow : Fuel{
			}
		}
		feature fuelOutPort ~ fuelInPort{
		}
	}
	feature parent [ 1 .. 2 ] : Person{
	}
	feature mother [ 1 ] : Person :> parent{
	}
	specialization t1 typing f : B;
	specialization t2 typing g : A;
	specialization Sub subset parent :> person;
	specialization subset mother :> parent;
	classifier LegalRecord{
		feature guardian [ 1 ]{
		}
	}
	class RegisteredAsset{
		composite var feature identifier [ 0 .. 1 ]{
		}
	}
	classifier Vehicle :> RegisteredAsset{
		derived var feature vin [ 1 ] = identifier{
		}
		var feature v : Vehicle{
		}
		binding vin = v.vin;
		var feature w = v.vin{
		}
		feature x = vin{
		}
		binding x = vin;
	}
	feature legalIdentification{
	}
	specialization Redef redefinition LegalRecord::guardian :>> parent;
	specialization redefinition Vehicle::vin :>> RegisteredAsset::identifier;
	redefinition Vehicle::vin :>> legalIdentification;
}
