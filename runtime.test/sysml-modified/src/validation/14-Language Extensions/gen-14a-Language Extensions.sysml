package '14a-Language Extensions'{
	private import 'User Defined Extensions' :: *;
	package 'User Defined Extensions'{
		enum def ClassificationLevel{
			uncl;
			conf;
			secret;
		}
		metadata def Classified{
			ref : SysML::PartUsage :>> annotatedElement;
			attribute classificationLevel [ 1 ] : ClassificationLevel;
		}
	}
	part part_X{
		metadata Classified{
			classificationLevel = ClassificationLevel::conf;
		}
	}
	// Alternative shorthand notation
	part part_Y{
		metadata Classified{
			classificationLevel = ClassificationLevel::conf;
		}
	}
}
