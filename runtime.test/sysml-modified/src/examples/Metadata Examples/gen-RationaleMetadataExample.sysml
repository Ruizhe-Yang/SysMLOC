package RationaleMetadataExample{
	private import ModelingMetadata::Rationale;
	/* Example: the following provides the rationale for selecting the engine4cyl based on a trade study analysis. 
    The rationale could be contained in the vehicle configuration with the selected engine */
	part engine;
	part engine4cyl :> engine;
	part engine6cyl :> engine;
	metadata engineSelectionRationale : Rationale about engine4cyl{
		text = "This rationale for selecting the engine4cyl refers to the engineTradeOffAnalysis.";
		explanation = engineTradeOffAnalysis;
	}
	private import TradeStudies :: *;
	analysis engineTradeOffAnalysis : TradeStudy{
		subject alternatives [ 2 ] :> engine = (engine4cyl, engine6cyl);
		/* ... */
		return selectedEngine :> engine;
	}
}
