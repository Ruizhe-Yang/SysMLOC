package RequirementMetadataExample{
	private import Metaobjects::SemanticMetadata;
	private import ModelingMetadata :: *;
	private import RiskMetadata :: *;
	private import RiskLevelEnum :: *;
	requirement def Goal;
	requirement goals [ * ] nonunique : Goal;
	metadata def goal : SemanticMetadata{
		:>> baseType = goals meta SysML::RequirementUsage;
	}
	requirement < '1' > vehicleMassRequirement{
		doc /* The total mass of a vehicle shall be less than or equal to the required mass. */
		metadata StatusInfo{
			status = StatusKind::tbd;
			risk{
				totalRisk = high;
				technicalRisk = medium;
				scheduleRisk = low;
				costRisk = medium;
			}
			originator = "Bob";
			owner = "Mary";
		}
	}
	#goal requirement deliverPayload{
		assume #goal constraint payloadMassLimit;
		require #goal constraint vehicleMassRequirement;
	}
}
