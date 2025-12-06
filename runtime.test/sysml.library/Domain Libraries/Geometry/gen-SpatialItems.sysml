standard library package SpatialItems{
	doc /*
	 * This package models physical items that have a spatial extent and act as a spatial frame of reference
	 * for obtaining position and displacement vectors of points within them.
	 */
	private import Objects::Point;
	private import SpatialFrames::SpatialFrame;
	private import Quantities::VectorQuantityValue;
	private import MeasurementReferences::ThreeDCoordinateFrame;
	private import MeasurementReferences::nullTransformation;
	private import Time::Clock;
	private import Time::TimeInstantValue;
	private import ScalarValues::Natural;
	private import ISQ::universalCartesianSpatial3dCoordinateFrame;
	private import ISQ::Position3dVector;
	private import ISQ::Displacement3dVector;
	private import VectorFunctions::isZeroVector;
	private import SequenceFunctions::isEmpty;
	private import ControlFunctions::forAll;
	item def SpatialItem : SpatialFrame{
		doc /*
		 * A SpatialItem is an Item with a three-dimensional spatial extent that also acts as a SpatialFrame of reference.
		 */
		ref item [ 1 ] : Clock :>> localClock default Time::universalClock{
			doc /*
			 * A local Clock to be used as the corresponding time reference within this SpatialItem. 
			 * By default this is the singleton universalClock.
			 */
		}
		attribute coordinateFrame [ 1 ] : ThreeDCoordinateFrame default universalCartesianSpatial3dCoordinateFrame{
			doc /*
             * The three-dimensional CoordinateFrame to be used as the measurement reference for position 
             * and displacement vector values relative to this SpatialItem.
             * By default this is the singleton universalCartesianSpatial3dCoordinateFrame.
             */
		}
		item originPoint [ 1 ] : Point :> spaceShots{
			doc /*
			 * The Point at the origin of the coordinateFrame of this SpatialItem.
			 */
		}
		assert constraint originPointConstraint{
			doc /*
			 * The CurrentPositionOf the originPoint must always be a zero vector.
			 */
			isZeroVector(CurrentPositionOf(originPoint, that))
		}
		item subSpatialItems [ 1 .. * ] : SpatialItem :> subitems{
			ref item :>> SpatialItem::localClock :>> subitems::localClock;
		}
		part subSpatialParts [ 1 .. * ] : SpatialItem :> subSpatialItems :> subparts{
			ref item :>> SpatialItem::localClock :>> subSpatialItems::localClock :>> subparts::localClock;
		}
		item componentItems [ 1 .. * ] : SpatialItem :> subSpatialItems{
			doc /*
			 * A SpatialItem with componentItems is entirely made up of those items (the SpatialItem occurs only
			 * as a collection of its componentItems).  By default they have the same localClock and equivalent
			 * coordinate frame as the SpatialItem they make up.  A SpatialItem without componentItems occurs
			 * on its own, separately from its subitems.
			 */
			ref item :>> SpatialItem::localClock :>> subSpatialItems::localClock default (that as SpatialItem).localClock;
			attribute :>> coordinateFrame{
				attribute :>> mRefs default (that.that as SpatialItem).coordinateFrame.mRefs;
				attribute [ 1 ] :>> transformation default nullTransformation{
					attribute :>> source default (that.that.that as SpatialItem).coordinateFrame;
				}
			}
		}
		private attribute cunionNum [ 1 ] : Natural = if isEmpty(componentItems) ? 0 else 1;
		private attribute componentUnion [ cunionNum ] :> unionsOf{
			doc /*
			 * A SpatialItem with componentItems is is a spatial union of them.
			 */
			item [ 1 .. * ] : SpatialItem :>> elements = componentItems;
		}
		part componentParts [ 1 .. * ] : SpatialItem :> componentItems :> subSpatialParts{
			ref item :>> SpatialItem::localClock :>> componentItems::localClock :>> subSpatialParts::localClock :>> subparts::localClock;
		}
	}
	calc def PositionOf : SpatialFrames::PositionOf{
		doc /*
		 * The PositionOf a Point relative to a SpatialItem, at a specific TimeInstantValue relative to a given Clock,
		 * is a positionVector that is a VectorQuantityValue in the coordinateFrame of the SpatialItem.
		 * The default Clock is the localClock of the SpatialItem.
		 */
		in point [ 1 ] : Point;
		in timeInstant [ 1 ] : TimeInstantValue;
		in enclosingItem [ 1 ] : SpatialItem :>> 'frame';
		in clock [ 1 ] : Clock default enclosingItem.localClock;
		return positionVector [ 1 ] : Position3dVector{
			attribute :>> mRef = enclosingItem.coordinateFrame;
		}
	}
	calc def CurrentPositionOf : SpatialFrames::CurrentPositionOf{
		doc /*
		 * The CurrentPositionOf a Point relative to a SpatialItem and a Clock is the PositionOf
		 * the Point relative to the SpatialItem at the currentTime of the Clock.
		 */
		in point [ 1 ] : Point;
		in enclosingItem [ 1 ] : SpatialItem :>> 'frame';
		in clock [ 1 ] : Clock default enclosingItem.localClock;
		return positionVector [ 1 ] : Position3dVector{
			attribute :>> mRef = enclosingItem.coordinateFrame;
		}
	}
	calc def DisplacementOf : SpatialFrames::DisplacementOf{
		doc /*
		 * The DisplacementOf two Points relative to a SpatialItem, at a specific TimeInstantValue relative to a
		 * given Clock, is the displacementVector computed as the difference between the PositionOf the 
		 * first Point and PositionOf the second Point, relative to that SpatialItem, at that timeInstant.
		 */
		in point1 [ 1 ] : Point;
		in point2 [ 1 ] : Point;
		in timeInstant [ 1 ] : TimeInstantValue;
		in spatialItem [ 1 ] : SpatialItem :>> 'frame';
		in clock [ 1 ] : Clock default spatialItem.localClock;
		return displacementVector [ 1 ] : Displacement3dVector{
			attribute :>> mRef = spatialItem.coordinateFrame;
		}
	}
	calc def CurrentDisplacementOf : SpatialFrames::CurrentDisplacementOf{
		doc /*
		 * The CurrentDisplacementOf two Points relative to a SpatialItem and a Clock is the DisplacementOf
		 * the Points relative to the SpatialItem, at the currentTime of the Clock.
		 */
		in point1 [ 1 ] : Point;
		in point2 [ 1 ] : Point;
		in spatialItem [ 1 ] : SpatialItem :>> 'frame';
		in clock [ 1 ] : Clock default spatialItem.localClock;
		return displacementVector [ 1 ] : Displacement3dVector{
			attribute :>> mRef = spatialItem.coordinateFrame;
		}
	}
}
