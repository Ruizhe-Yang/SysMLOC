package RiskMetadataExample{
	private import RiskMetadata :: *;
	private import RiskLevelEnum :: *;
	part engine4cyl{
		metadata Risk{
			totalRisk = high;
			technicalRisk = medium;
			scheduleRisk = medium;
		}
		metadata Risk{
			totalRisk{
				probability = 0.3;
				impact = 0.7;
			}
		}
	}
}
