package 'Constraints Example-2'{
	private import ISQ :: *;
	private import SI :: *;
	private import NumericalFunctions :: *;
	part def Engine;
	part def Transmission;
	constraint def MassConstraint{
		attribute partMasses [ 0 .. * ] : MassValue;
		attribute massLimit : MassValue;
		sum(partMasses) <= massLimit
	}
	part def Vehicle{
		constraint massConstraint : MassConstraint{
			:>> partMasses = (chassisMass, engine.mass, transmission.mass);
			:>> massLimit = 2500[kg];
		}
		attribute chassisMass : MassValue;
		part engine : Engine{
			attribute mass : MassValue;
		}
		part transmission : Engine{
			attribute mass : MassValue;
		}
	}
}
