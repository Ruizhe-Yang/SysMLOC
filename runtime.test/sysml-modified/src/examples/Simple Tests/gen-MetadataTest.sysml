package MetadataTest{
	private import 'User Defined Extensions' :: *;
	library package 'User Defined Extensions'{
		#Security enum def ClassificationLevel : ScalarValues::Natural{
			uncl : ClassificationLevel = 0;
			conf : ClassificationLevel = 1;
			#Security secret : ClassificationLevel = 2;
		}
		metadata def Classified{
			ref : SysML::Usage :>> annotatedElement;
			ref classificationLevel : ClassificationLevel;
		}
		metadata def Security;
	}
	ref x{
		metadata Classified{
			classificationLevel = ClassificationLevel::conf;
		}
	}
	ref y{
		metadata Classified{
			classificationLevel = ClassificationLevel::conf;
		}
		metadata Security;
	}
	private ref #Classified #Security z1;
	abstract #Classified z2;
	ref z{
		#Security #Classified metadata Classified{
			classificationLevel = ClassificationLevel::secret;
		}
	}
}
