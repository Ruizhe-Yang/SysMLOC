standard library package TensorCalculations{
	doc /*
	 * This package package defines calculations for the construction of and computations on TensorQuantityValues.
	 */
	private import ScalarValues::Boolean;
	private import ScalarValues::Number;
	private import Quantities::ScalarQuantityValue;
	private import Quantities::VectorQuantityValue;
	private import Quantities::TensorQuantityValue;
	private import MeasurementReferences::TensorMeasurementReference;
	private import MeasurementReferences::CoordinateTransformation;
	calc def '[' : BaseFunctions::'['{
		in elements [ 1 .. n ] ordered : Number;
		in mRef [ 1 ] : TensorMeasurementReference;
		return quantity [ 1 ] : TensorQuantityValue;
		private attribute n = mRef.flattenedSize;
	}
	calc def isZeroTensorQuantity{
		in x [ 1 ] : TensorQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def isUnitTensorQuantity{
		in x [ 1 ] : TensorQuantityValue;
		return [ 1 ] : Boolean;
	}
	/* Addition and subtraction */
	calc def '+' : DataFunctions::'+'{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	calc def '-' : DataFunctions::'-'{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	/* Multiplication and division */
	calc def scalarTensorMult{
		in [ 1 ] : Number;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	calc def TensorScalarMult{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : Number;
		return [ 1 ] : TensorQuantityValue;
	}
	calc def scalarQuantityTensorMult{
		in [ 1 ] : ScalarQuantityValue;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	calc def TensorScalarQuantityMult{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	calc def tensorVectorMult{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : VectorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def vectorTensorMult{
		in [ 1 ] : VectorQuantityValue;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : VectorQuantityValue;
	}
	calc def tensorTensorMult{
		in [ 1 ] : TensorQuantityValue;
		in [ 1 ] : TensorQuantityValue;
		return [ 1 ] : TensorQuantityValue;
	}
	/* Tensor transformation */
	calc def transform{
		in transformation : CoordinateTransformation;
		in sourceTensor : TensorQuantityValue;
		return targetTensor : TensorQuantityValue;
	}
}
