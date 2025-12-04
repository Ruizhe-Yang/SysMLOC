library package 'Model Library Example'{
	private import ScalarValues::Real;
	private import RiskMetadata::Level;
	abstract occurrence def Situation;
	abstract occurrence situations [ * nonunique Situation abstract occurrence def Cause{
		attribute probability : Real;
	}
	abstract occurrence causes [ * nonunique Cause situations abstract occurrence def Failure{
		attribute severity : Level;
	}
	abstract occurrence failures [ * nonunique Failure situations abstract connection def Causation : Occurrences::HappensBefore{
		// end cause : Situation[*];
		// end effect : Situation[*];
	}
	abstract connection causations [ * nonunique Causation item def Scenario{
		occurrence :>> situations;
		occurrence :> situations :>> causes;
		occurrence :> situations :>> failures;
	}
	item scenarios [ * nonunique Scenario
}
