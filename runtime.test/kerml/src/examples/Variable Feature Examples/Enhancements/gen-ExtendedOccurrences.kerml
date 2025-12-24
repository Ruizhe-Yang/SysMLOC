package ExtendedOccurrences{
	class Interval;
	class Moment :> Interval;
	class Timeslice{
		feature interval : Interval{
		}
		: Timeslice :>> self{
		}
	}
	class Snapshot :> Timeslice{
		feature moment : Moment :>> interval{
		}
		: Snapshot :>> self{
		}
	}
	class Life :> Timeslice;
	class ExtendedOccurrence :> Life{
		[ 1 .. * ] : Timeslice :>> timeSlices{
		}
		[ 1 .. * ] : Snapshot :> timeSlices :>> snapshots{
		}
		expr at{
			: Timeslice :>> that{
			}
			in interval : Interval{
			}
			return result : Timeslice{
			}
			binding result.portionOf = that;
			binding result.interval = interval;
		}
		expr while{
			in timeslice : Timeslice{
			}
			return result : Timeslice = at(timeslice.interval){
			}
		}
		var feature activeOccurrences :> Occurrences::occurrences{
			connector : Occurrences::HappensDuring from [ 1 ] that to [ 1 ] self;
		}
		var feature activeSuboccurrences :> Occurrences::occurrences{
			connector : Occurrences::HappensDuring from [ 1 ] that to [ 1 ] self;
		}
		// occurrences and performances are abstract package-level features.
		// It would be nice to put the variable next to them, but they cannot 
		// be package-level, or featured by Anything. Nevertheless, since
		// Occurrence is a specialization of Anything, it will have these 
		// features (might be worth redefining them explicitly), so the
		// variables can subset them. In the case below, performances will
		// contain every step in the occurrence, which is the correct domain
		// for the variable.
		var feature activePerformances :> Performances::performances{
			connector : Occurrences::HappensDuring from [ 1 ] that to [ 1 ] self;
		}
	}
	struct ExtendedObject :> ExtendedOccurrence{
		feature self : ExtendedObject :>> Objects::Object::self :>> ExtendedOccurrence::self{
		}
	}
}
