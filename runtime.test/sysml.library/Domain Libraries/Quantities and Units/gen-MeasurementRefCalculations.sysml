standard library package MeasurementRefCalculations{
	doc /*
	 * This package package defines calculations on MeasurementUnits and CoordinateFrames.
	 */
	private import ScalarValues::String;
	private import ScalarValues::Real;
	private import MeasurementReferences::MeasurementUnit;
	private import MeasurementReferences::ScalarMeasurementReference;
	private import MeasurementReferences::CoordinateFrame;
	/* MeasurementUnit operations */
	calc def '*' : DataFunctions::'*'{
		in x [ 1 ] : MeasurementUnit;
		in y [ 1 ] : MeasurementUnit;
		return [ 1 ] : MeasurementUnit;
	}
	calc def '/' : DataFunctions::'/'{
		in x [ 1 ] : MeasurementUnit;
		in y [ 1 ] : MeasurementUnit;
		return [ 1 ] : MeasurementUnit;
	}
	calc def '**' : DataFunctions::'**'{
		in x [ 1 ] : MeasurementUnit;
		in y [ 1 ] : Real;
		return [ 1 ] : MeasurementUnit;
	}
	calc def '^' : DataFunctions::'^'{
		in x [ 1 ] : MeasurementUnit;
		in y [ 1 ] : Real;
		return [ 1 ] : MeasurementUnit;
	}
	/* CoordinateFrame and MeasurementUnit operations */
	calc def 'CoordinateFrame*' : DataFunctions::'*'{
		in x [ 1 ] : CoordinateFrame;
		in y [ 1 ] : MeasurementUnit;
		return [ 1 ] : CoordinateFrame;
	}
	calc def 'CoordinateFrame/' : DataFunctions::'/'{
		in x [ 1 ] : CoordinateFrame;
		in y [ 1 ] : MeasurementUnit;
		return [ 1 ] : CoordinateFrame;
	}
	calc def ToString : BaseFunctions::ToString{
		doc /*
         * Returns the Unicode string symbol representing a scalar measurement reference.
         */
		in x [ 1 ] : ScalarMeasurementReference;
		return [ 1 ] : String;
	}
}
