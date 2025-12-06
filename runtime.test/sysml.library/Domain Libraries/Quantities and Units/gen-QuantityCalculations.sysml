standard library package QuantityCalculations{
	doc /*
	 * This package package defines calculations for the construction of and computations on ScalarQuantityValues.
	 */
	private import ScalarValues :: *;
	private import Quantities::ScalarQuantityValue;
	private import MeasurementReferences::ScalarMeasurementReference;
	private import MeasurementReferences::DimensionOneValue;
	calc def '[' : BaseFunctions::'['{
		in num [ 1 ] : Number;
		in mRef [ 1 ] : ScalarMeasurementReference;
		return quantity [ 1 ] : ScalarQuantityValue;
	}
	calc def isZero : NumericalFunctions::isZero{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean = NumericalFunctions::isZero(x.num);
	}
	calc def isUnit : NumericalFunctions::isUnit{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean = NumericalFunctions::isUnit(x.num);
	}
	calc def abs : NumericalFunctions::abs{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '+' : NumericalFunctions::'+'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 0 .. 1 ] : ScalarQuantityValue;
		return : ScalarQuantityValue;
	}
	calc def '-' : NumericalFunctions::'-'{
		in x : ScalarQuantityValue;
		in y [ 0 .. 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '*' : NumericalFunctions::'*'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '/' : NumericalFunctions::'/'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '**' : NumericalFunctions::'**'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : Real;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '^' : NumericalFunctions::'^'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : Real;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '<' : NumericalFunctions::'<'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def '>' : NumericalFunctions::'>'{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def '<=' : NumericalFunctions::'<='{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def '>=' : NumericalFunctions::'>='{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def max : NumericalFunctions::max{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def min : NumericalFunctions::min{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def '==' : DataFunctions::'=='{
		in x [ 1 ] : ScalarQuantityValue;
		in y [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Boolean;
	}
	calc def sqrt{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def floor{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def round{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : ScalarQuantityValue;
	}
	calc def ToString : BaseFunctions::ToString{
		in x [ 1 ] : ScalarQuantityValue;
		return : String;
	}
	calc def ToInteger{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Integer;
	}
	calc def ToRational{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Rational;
	}
	calc def ToReal{
		in x [ 1 ] : ScalarQuantityValue;
		return [ 1 ] : Real;
	}
	calc def ToDimensionOneValue{
		in x [ 1 ] : Real;
		return [ 1 ] : DimensionOneValue;
	}
	calc def sum : NumericalFunctions::sum{
		in collection [ 0 .. * ] : ScalarQuantityValue;
		private attribute zero [ 1 ] : ScalarQuantityValue;
		assert constraint{
			isZero(zero)
		}
		return : ScalarQuantityValue = NumericalFunctions::sum0(collection, zero);
	}
	calc def product : NumericalFunctions::product{
		in collection [ 0 .. * ] : ScalarQuantityValue;
		private attribute one [ 1 ] : ScalarQuantityValue;
		assert constraint{
			isUnit(one)
		}
		return : ScalarQuantityValue = NumericalFunctions::product1(collection, one);
	}
	calc def ConvertQuantity{
		in x [ 1 ] : ScalarQuantityValue;
		in targetMRef [ 1 ] : ScalarMeasurementReference;
		return [ 1 ] : ScalarQuantityValue;
	}
}
