standard library package VectorCalculations{
	doc /*
	 * This package package defines calculations for the construction of and computations on VectorQuantityValues.
	 */
	private import ScalarValues::Boolean;
	private import ScalarValues::Number;
	private import Quantities::ScalarQuantityValue;
	private import Quantities::VectorQuantityValue;
	private import MeasurementReferences::VectorMeasurementReference;
	private import MeasurementReferences::CoordinateTransformation;
	calc def '[' : BaseFunctions::'['{
		in elements [ 1 .. n ] ordered : Number;
		in mRef [ 1 ] : VectorMeasurementReference;
		return quantity [ 1 ] : VectorQuantityValue;
		private attribute n = mRef.flattenedSize;
	}
	calc def isZeroVectorQuantity : VectorFunctions::isZeroVector{
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def isUnitVectorQuantity{
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : Boolean;
	}
	/* Addition and subtraction */
	calc def '+' : VectorFunctions::'+'{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def '-' : VectorFunctions::'-'{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	/* Multiplication and division */
	calc def scalarVectorMult : VectorFunctions::scalarVectorMult{
		in [ 1 ] : Number;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def vectorScalarMult : VectorFunctions::vectorScalarMult{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : Number;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def scalarQuantityVectorMult{
		in [ 1 ] : ScalarQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def vectorScalarQuantityMult{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def vectorScalarDiv : VectorFunctions::vectorScalarDiv{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : Number;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def vectorScalarQuantityDiv{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def inner : VectorFunctions::inner{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : Number;
	}
	calc def outer{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	alias '*' for scalarVectorMult;
	/* Norm and angle */
	calc def norm : VectorFunctions::norm{
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : Number;
	}
	calc def angle : VectorFunctions::angle{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : Number;
	}
	/* Coordinate transformation */
	calc def transform{
		in transformation : CoordinateTransformation;
		in sourceVector : VectorQuantityValue{
			:>> mRef = transformation.source;
		}
		return targetVector : VectorQuantityValue{
			:>> mRef = transformation.target{
				:>> dimensions = sourceVector.mRef.dimensions;
			}
		}
	}
}
