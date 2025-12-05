package '14c-Language-Extensions'{
	private import ScalarValues :: *;
	library package FMEALibrary{
		abstract occurrence def Situation;
		abstract occurrence situations [ * ] nonunique : Situation;
		occurrence def Cause : Situation{
			attribute occurs [ 0 .. 1 ] : Real;
		}
		abstract occurrence causes [ * ] nonunique : Cause;
		occurrence def FailureMode : Situation{
			attribute detected [ 0 .. 1 ] : Real;
		}
		abstract occurrence failureModes [ * ] nonunique : FailureMode;
		occurrence def Effect : Situation{
			attribute severity [ 0 .. 1 ] : String;
		}
		abstract occurrence effects [ * ] nonunique : Effect;
		item def FMEAItem : Situation{
			attribute RPN [ 0 .. 1 ] : Real;
			occurrence :>> causes;
			occurrence :>> failureModes;
			occurrence :>> effects;
		}
		abstract item fmeaItems [ * ] nonunique : FMEAItem;
		connection def Causation : Occurrences::HappensBefore{
			end [ * ] ref cause : Situation;
			end [ * ] ref effect : Situation;
		}
		abstract connection causations [ * ] nonunique : Causation;
		requirement def FMEARequirement;
		abstract requirement fmeaRequirements [ * ] nonunique : FMEARequirement;
		requirement def RequirementWithSIL : FMEARequirement{
			attribute sil : SIL;
		}
		enum def SIL{
			A;
			B;
			C;
		}
		connection def Violation{
			end [ * ] ref sit : Situation;
			end [ * ] ref req : FMEARequirement;
		}
		abstract connection violations [ * ] nonunique : Violation;
		abstract connection def ControllingMeasure{
			end [ * ] ref sit : Situation;
			end [ * ] ref req : FMEARequirement;
		}
		connection def Prevention : ControllingMeasure;
		abstract connection preventions [ * ] nonunique : Prevention;
		connection def Mitigation : ControllingMeasure;
		abstract connection mitigations [ * ] nonunique : Mitigation;
	}
	library package FMEAMetadata{
		private import Metaobjects::SemanticMetadata;
		private import FMEALibrary :: *;
		enum def Status{
			Approved;
			NotApproved;
		}
		metadata def StatusHolder{
			status : Status;
		}
		metadata def < situation > SituationMetadata : SemanticMetadata{
			:>> baseType default situations meta SysML::Usage;
		}
		metadata def < cause > CauseMetadata : SituationMetadata{
			:>> baseType = causes meta SysML::Usage;
		}
		metadata def < failure > FailureModeMetadata : SituationMetadata{
			:>> baseType = failureModes meta SysML::Usage;
		}
		metadata def < effect > EffectMetadata : SituationMetadata{
			:>> baseType = effects meta SysML::Usage;
		}
		metadata def < fmea > FMEAItemMetadata : SituationMetadata{
			: SysML::ItemDefinition :> annotatedElement;
			: SysML::ItemUsage :> annotatedElement;
			:>> baseType = fmeaItems meta SysML::Usage;
		}
		metadata def < causation > CausationMetadata : SemanticMetadata{
			: SysML::ConnectionUsage :>> annotatedElement;
			:>> baseType = causations meta SysML::Usage;
		}
		metadata def < fmeaspec > FMEARequirementMetadata : SemanticMetadata{
			: SysML::RequirementUsage :>> annotatedElement;
			:>> baseType = fmeaRequirements meta SysML::Usage;
		}
		metadata def < violation > ViolationMetadata : SemanticMetadata{
			: SysML::ConnectionUsage :>> annotatedElement;
			:>> baseType = violations meta SysML::Usage;
		}
		abstract metadata def ControllingMeasureMetadata : SemanticMetadata{
			: SysML::ConnectionUsage :>> annotatedElement;
		}
		metadata def < prevention > PreventionMetadata : ControllingMeasureMetadata{
			:>> baseType = preventions meta SysML::Usage;
		}
		metadata def < mitigation > MitigationMetadata : ControllingMeasureMetadata{
			:>> baseType = mitigations meta SysML::Usage;
		}
	}
	package FMEAUserModel{
		private import FMEALibrary :: *;
		private import FMEAMetadata :: *;
		#fmeaspec requirement req1{
			doc /* Meter designed according to ISO00124 */
		}
		#fmeaspec requirement req2{
			doc /* Device working for 1 week without the need to replace batteries */
		}
		#fmeaspec requirement req3 : RequirementWithSIL{
			metadata StatusHolder{
				status = Status::Approved;
			}
			doc /* Alarm when battery has sank */
			:>> sil = SIL::A;
		}
		#fmea item def 'Glucose FMEA Item'{
			#prevention connect 'battery depleted' to req1;
			#cause occurrence 'battery depleted'{
				:>> occurs = 0.005;
			}
			#causation connect 'battery depleted' to 'battery cannot be charged';
			#failure occurrence 'battery cannot be charged'{
				:>> detected = 0.013;
			}
			#causation connect 'battery cannot be charged' to 'glucose level undetected';
			#effect occurrence 'glucose level undetected';
			#causation connect 'glucose level undetected' to 'therapy delay';
			#effect occurrence 'therapy delay'{
				:>> severity = "High";
			}
		}
		#violation connect 'Glucose Meter in Use' to req2;
		#mitigation connect 'Glucose Meter in Use' to req3;
		#fmea item 'Glucose Meter in Use' : 'Glucose FMEA Item'{
			part 'glucose meter'{
				event 'glucose level undetected' [ * ];
				part battery{
					event 'battery depleted' [ * ];
					event 'battery cannot be charged' [ * ];
				}
				part pump;
				part reservoir;
			}
			part patient{
				event 'therapy delay' [ * ];
			}
		}
	}
}
