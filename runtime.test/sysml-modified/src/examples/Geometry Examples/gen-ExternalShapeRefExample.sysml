package ExternalShapeRefExample{
	private import ScalarValues::String;
	private import ShapeItems :: *;
	private import ISQ::mass;
	private import SI::mm;
	metadata def ExternalShapeRef{
		doc /*
		 * Metadata to reference an externally defined shape.
		 */
		attribute purpose [ 1 ] : String;
		attribute shapeIri [ 1 ] : String;
	}
	part myBatteryUnit{
		item : Shell :>> shape{
			metadata ExternalShapeRef{
				purpose = "highLoD";
				shapeIri = "file:/detailed-geometry/LEMS-250W_BatteryHousing_Example.step";
			}
		}
		private item envelopingBoxBatteryUnit : Box :> envelopingShapes{
			:>> length = 140[mm];
			:>> width = 148[mm];
			:>> height = 90[mm];
		}
	}
}
