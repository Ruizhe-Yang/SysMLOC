package CarWithShapeAndCSG{
	private import SpatialItems :: *;
	private import ShapeItems :: *;
	private import Objects::Point;
	private import Quantities::VectorQuantityValue;
	private import MeasurementReferences::CoordinateFrame;
	private import MeasurementReferences::TranslationRotationSequence;
	private import MeasurementReferences::Translation;
	private import MeasurementReferences::Rotation;
	private import SI :: *;
	part def Car : SpatialItem{
		doc /*
		 * Car with simple engine
		 */
		item :>> shape = new Cuboid(4800 [mm], 1840 [mm], 1350 [mm]);
		attribute datum :>> coordinateFrame{
			:>> mRefs = (mm, mm, mm);
		}
		part powerSource [ 1 ] : Engine :> componentParts{
			:>> ecf{
				:>> mRefs = datum.mRefs;
				: TranslationRotationSequence :>> transformation{
					:>> source = datum;
					:>> elements = ( new Translation((3800, (1840-190)/2, 40)[datum]) );
				}
			}
		}
	}
	part def Engine : SpatialItem{
		doc /*
		 * Simple 2-cylinder engine
		 * 
		 * Note: The engine shape is modeled as a rectangular box with two cylindrical holes, a gross simplification.
		 */
		item [ 1 ] :>> shape;
		attribute < ecf > engineCoordinateFrame :>> coordinateFrame;
		part rawEngineBlock [ 1 ] :> subSpatialParts{
			item [ 1 ] : Box :>> shape{
				:>> length = 300 [mm];
				:>> width = 190 [mm];
				:>> height = 330 [mm];
			}
		}
		private attribute rearCylinderSpacing = 90 [mm];
		private item cylinder1 [ 1 ] :> subSpatialParts{
			item [ 1 ] : Cylinder :>> shape{
				:>> radius = 55 [mm];
				:>> height = 350 [mm];
			}
			attribute :>> coordinateFrame{
				: TranslationRotationSequence :>> transformation{
					:>> source = ecf;
					:>> elements = (new Translation( (rearCylinderSpacing, rawEngineBlock.shape.width/2, -10)[ecf]));
				}
			}
		}
		private attribute cylinderSpacing = 2*cylinder1.shape.radius + 20 [mm];
		private item cylinder2 [ 1 ] :> subSpatialParts{
			item [ 1 ] : Cylinder :>> shape{
				:>> radius = cylinder1.shape.radius;
				:>> height = cylinder1.shape.height;
			}
			attribute :>> coordinateFrame{
				: TranslationRotationSequence :>> transformation{
					:>> source = ecf;
					:>> elements = ( new Translation((rearCylinderSpacing + cylinderSpacing, rawEngineBlock.shape.width/2, -10)[ecf]) );
				}
			}
		}
		/* CSG difference of rawEngineBlock minus cylinder1 minus cylinder2 */
		attribute [ 1 ] :> differencesOf{
			item :>> elements = (rawEngineBlock, cylinder1, cylinder2);
		}
	}
}
