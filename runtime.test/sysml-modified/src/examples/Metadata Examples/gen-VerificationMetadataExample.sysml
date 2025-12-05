package VerificationMetadataExample{
	private import VerificationCases :: *;
	private import VerificationMethodKind :: *;
	verification def MassTest;
	verification massTests : MassTest{
		metadata VerificationMethod{
			kind = (test,demo);
		}
		objective;
		action weighVehicle{
			metadata VerificationMethod{
				kind = analyze;
			}
		}
	}
}
