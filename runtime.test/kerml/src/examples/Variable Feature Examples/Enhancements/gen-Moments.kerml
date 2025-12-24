package Moments{
	private import Occurrences::Life;
	private import Occurrences::Occurrence;
	class Eternity :> Life{
		// Nothing before/after or outside.
		// Could be many of these, see universal below.
		[ 0 ] :>> predecessors{
		}
		[ 0 ] :>> successors{
		}
		[ 0 ] :>> outsideOfOccurrences{
		}
	}
	class UniversalEternity [ 1 ] :> Eternity{
		: Period :>> timeSlices{
		}
		//Includes life.
		: Moment :>> snapshots{
		}
	}
	feature universalEternity [ 1 ] : UniversalEternity{
	}
	class Period{
		//Includes life and snapshots.
		//↓↓ With UE redef, exactly UE timeslices.
		[ 1 ] : UniversalEternity :>> timeSliceOf{
		}
	}
	class all InstantOccurrence :> Occurrence{
		// Probly useful elsewhere, eg, to type snapshots.
		[ 1 ] :>> snapshots{
		}
		// Or startShot subsets endShot;
	}
	// Or middleTimeslice [0];
	class Moment :> Period , InstantOccurrence{
		//↓↓ With UE redef, exactly UE snapshots.
		[ 1 ] : UniversalEternity :>> snapshotOf{
		}
	}
	private import Occurrence::spaceTimeCoincidentOccurrences;
	//UE portion "corresponding" to an occurrence.
	feature coincidentUEPortion [ 1 ] : Occurrence :> spaceTimeCoincidentOccurrences :> universalEternity.portions featured by Occurrence{
	}
}
