// ===== BEGIN: Kernel Data Type Library.kerml =====
// ===== BEGIN: Collections.kerml =====
standard library package Collections {
	doc
	/*
	 * This package defines a standard set of Collection data types. Unlike sequences of values 
	 * defined directly using multiplicity, these data types allow for the possibility of collections 
	 * as elements of collections.
	 */

	private import Base::*;
	private import ScalarValues::*;
	private import SequenceFunctions::size;
	private import IntegerFunctions::*;
	private import ControlFunctions::*;

	abstract datatype Collection {
		doc
		/*
		 * Collection is the top level abstract supertype of all collection types.
		 * The name elements is used to denote the members or contents of the collection.
		 */
		
		feature elements[0..*] nonunique;
	}

    abstract datatype OrderedCollection :> Collection {
    	doc
		/*
		 * OrderedCollection is the abstract supertype for all ordered collection types.
		 */
    	
		feature elements[0..*] ordered nonunique :>> Collection::elements;
    }

    abstract datatype UniqueCollection :> Collection {
    	doc
		/*
		 * UniqueCollection is the abstract supertype for all collection types with unique elements.
		 */
		
		feature elements[0..*] :>> Collection::elements {
			/* Note: Redefinition of 'elements' is unique by default. */
		}
    }

    datatype Array :> OrderedCollection {
    	doc
	    /*
	     * An Array is a fixed size, multi-dimensional Collection of which the elements are nonunique and ordered. 
	     * Its dimensions specify how many dimensions the array has, and how many elements there are in each dimension. 
	     * The rank is equal to the number of dimensions. The flattenedSize is equal to the total number of elements 
	     * in the array.
	     * 
	     * Feature elements is a flattened sequence of all elements of an Array and can be accessed by a tuple of indices. 
	     * The number of indices is equal to rank. The elements are packed according to row-major convention, as in the C programming language.
	     * 
	     * The elements of an Array can be assessed by a tuple of indices. The number of indices in such tuple is equal to rank. 
		 * The packing of the elements, i.e. the flattened representation, follows the row-major convention, 
		 * as in the C programming language.
		 * 
		 * Note 1. Feature dimensions may be empty, which denotes a zero dimensional array, allowing an Array to collapse to a single element. 
		 * This is useful to allow for specialization of an Array into a type restricted to represent a scalar. 
		 * The flattenedSize of a zero dimensional array is 1.
		 * 
		 * Note 2: An Array can represent the generalized mathematical concept of an infinite matrix of any rank, i.e. not limited to rank two.
	     */
	     
        feature dimensions: Positive[0..*] ordered nonunique {
        	doc
       		/* Feature `dimensions` defines the N-dimensional shape of the Array
             * The alternative name `shape` (as used in many programming languages) is not used as it would interfere with a geometric shape feature.
 			 */
        }
        feature rank: Natural[1] = size(dimensions);
        feature flattenedSize: Positive[1] = dimensions->reduce '*' ?? 1;
        inv { flattenedSize == size(elements) }
    }
    
	datatype Bag :> Collection {
		doc
		/*
		 * Bag is a variable-size, unordered collection of nonunique elements.
		 */		
	}
	
	datatype Set :> UniqueCollection {
		doc
		/*
		 * Set is a variable-size, unordered collection of unique elements.
		 */
	}

	datatype OrderedSet :> OrderedCollection, UniqueCollection 
		intersects OrderedCollection, UniqueCollection {
		doc
		/*
		 * OrderedSet is a variable-size, ordered collection of unique elements.
		 */	
		
		feature elements[0..*] ordered :>> OrderedCollection::elements, UniqueCollection::elements {
			/* Note: Redefinition of `elements` is unique by default. */
		}
	}
		
	datatype List :> OrderedCollection {
		doc
		/*
		 * List is a variable-size, ordered collection of nonunique elements.
		 */
	}

    datatype KeyValuePair {
    	doc
		/*
		 * KeyValuePair is a tuple of a key and a value for use in Map collections.
		 * The key must be immutable.
		 */
    	
        feature key: Anything[0..*] ordered nonunique;
        feature val: Anything[0..*] ordered nonunique;
    }

    datatype Map :> Collection {
    	doc
		/*
		 * Map is a variable-size, unordered collection of elements that are key-value pairs.
		 */
    	
		feature elements: KeyValuePair[0..*] :>> Collection::elements {
			/* Note: Redefinition of `elements` is unique by default. 
			 * The `key` of any `KeyValuePair` must be unique over the collection of `KeyValuePair`. 
			 * The `val` does not need to be unique. 
			 */			
		}
    }

    datatype OrderedMap :> Map {
    	doc
		/*
		 * OrderedMap is a variable-size, ordered collection of elements that are key-value pairs. 
		 */

		feature elements: KeyValuePair[0..*] ordered :>> Map::elements {
			/* Note: Redefinition of `elements` is unique by default. */
		}
    }
    
}
// ===== END: Collections.kerml =====

// ===== BEGIN: ScalarValues.kerml =====
standard library package ScalarValues {
	doc
	/*
	 * This package contains a basic set of primitive scalar (non-collection) data types. 
	 * These include Boolean and String types and a hierarchy of concrete Number types, from 
	 * the most general type of Complex numbers to the most specific type of Positive integers.</p>
	 */

	private import Base::DataValue;
	
	abstract datatype ScalarValue specializes DataValue;
	datatype Boolean specializes ScalarValue;
	datatype String specializes ScalarValue;
	abstract datatype NumericalValue specializes ScalarValue;
	
    abstract datatype Number specializes NumericalValue;
	datatype Complex specializes Number;
	datatype Real specializes Complex;	
	datatype Rational specializes Real;
	datatype Integer specializes Rational;
	datatype Natural specializes Integer;
    datatype Positive specializes Natural;	
}		
// ===== END: ScalarValues.kerml =====

// ===== BEGIN: VectorValues.kerml =====
standard library package VectorValues {
	doc
	/*
	 * This package provides a basic model of abstract vectors as well as concrete vectors
	 * whose components are numerical values. The package VectorFunctions defines the 
	 * corresponding vector-space functions.
	 */

	private import ScalarValues::NumericalValue;
	private import ScalarValues::Real;
	private import Collections::Array;
	
	abstract datatype VectorValue {
		doc
		/*
		 * A VectorValue is an abstract data type whose values may be operated on using
		 * VectorFunctions.
		 */
	}
	
	datatype NumericalVectorValue :> VectorValue, Array intersects VectorValue, Array {
		doc
		/*
		 * A NumericalVectorValue is a kind of VectorValue that is specifically represented
		 * as a one-dimensional array of NumericalValues. The dimension is allowed to be empty,
		 * permitting a NumericalVectorValue of rank 0, which is essentially isomorphic to a
		 * scalar NumericalValue.
		 */
	
		feature dimension[0..1] :>> dimensions;
		feature :>> elements : NumericalValue;
	}
	
	datatype CartesianVectorValue :> NumericalVectorValue {
		doc
		/*
		 * CartesianVectorValue is a specialization Numerical VectorValue for which there are 
		 * specific implementations in VectorFunctions of the abstract vector-space functions.
		 * 
		 * Note: The restriction of the element type to Real is to facilitate
		 * the complete definition of these functions.
		 */
	
		feature :>> elements : Real;
	}

	datatype ThreeVectorValue :> NumericalVectorValue {
		doc
		/*
		 * A ThreeVectorValue is a NumericalVectorValue that has dimension 3.
		 */
	
		feature :>> dimension = 3;
	}
	
	datatype CartesianThreeVectorValue :> CartesianVectorValue, ThreeVectorValue 
		intersects CartesianVectorValue, ThreeVectorValue {
		doc
		/*
		 * A CartesianThreeVectorValue is a NumericalVectorValue that is both Cartesian and
		 * has dimension 3.
		 */
	}	
}
// ===== END: VectorValues.kerml =====

// ===== END: Kernel Data Type Library.kerml =====

// ===== BEGIN: Kernel Function Library.kerml =====
// ===== BEGIN: BaseFunctions.kerml =====
standard library package BaseFunctions {
	doc
	/*
	 * This package defines a basic set of functions defined on all kinds of values. 
	 * Most correspond to similarly named operators in the KerML expression syntax.
	 */

	private import Base::Anything;
	private import Objects::Object;
	private import Metaobjects::Metaobject;
	private import KerML::Metaclass;
	private import ScalarValues::*;
	
	abstract function '=='{ in x: Anything[0..1]; in y: Anything[0..1]; 
		return : Boolean[1];
	}
	function '!='{ in x: Anything[0..1]; in y: Anything[0..1]; 
		return : Boolean[1] = not (x == y);
	}
	
	abstract function '==='{ in x: Anything[0..1]; in y: Anything[0..1]; 
		return : Boolean[1];
	}
	function '!=='{ in x: Anything[0..1]; in y: Anything[0..1]; 
		return : Boolean[1] = not (x === y);
	}
	
	abstract function ToString{ in x: Anything[0..1]; 
		return : String;
	}
	
	abstract function '['{ in x: Anything[0..*] nonunique; in y: Anything[0..*] nonunique; 
		return : Anything[0..*] nonunique;
	}
	abstract function '#'{ in seq: Anything[0..*] ordered nonunique; in index: Positive[1..*] ordered nonunique; 
		return : Anything[0..1];
	}
	abstract function ','{ in seq1: Anything[0..*] ordered nonunique; in seq2: Anything[0..*] ordered nonunique; 
		return : Anything[0..*] ordered nonunique;
	}
	
    abstract function 'all'{
     	return : Object[0..*];
    }
    
	abstract function 'istype'{ 
		in seq: Anything[0..*];
		in 'type': Anything;
		return : Boolean[1];
	}
	
	abstract function 'hastype'{ 
		in seq: Anything[0..*];
		in 'type': Anything;
		return : Boolean;
	}
	
	abstract function '@'{ 
		in seq: Anything[0..*];
		in 'type': Anything;
		return : Boolean[1];
	}
	
	abstract function '@@'{ 
		in seq: Metaobject[0..*];
		in 'type': Metaobject;
		return : Boolean[1];
	}
	
	abstract function 'as'{ 
		in seq: Anything[0..*] ordered nonunique; 
		return : Anything[0..*] ordered nonunique;
	}
	
	abstract function 'meta'{ 
		in seq: Metaobject[0..*] ordered nonunique; 
		return : Metaobject[0..*] ordered nonunique;
	}
	
}
// ===== END: BaseFunctions.kerml =====

// ===== BEGIN: BooleanFunctions.kerml =====
standard library package BooleanFunctions {
	doc
	/*
	 * This package defines functions on Boolean values, including those corresponding to 
	 * (non-conditional) logical operators in the KerML expression notation.
	 */

	public import ScalarValues::*;
	
	function 'not' specializes ScalarFunctions::'not' { in x: Boolean[1]; return : Boolean[1]; }
	function 'xor' specializes ScalarFunctions::'xor' { in x: Boolean[1]; in y: Boolean[1]; return : Boolean[1]; }
	
	function '|' specializes ScalarFunctions::'|' { in x: Boolean[1]; in y: Boolean[1]; return : Boolean[1]; }
	function '&' specializes ScalarFunctions::'&' { in x: Boolean[1]; in y: Boolean[1]; return : Boolean[1]; }
	
	function '==' specializes DataFunctions::'==' { in x: Boolean[0..1]; in y: Boolean[0..1]; return : Boolean[1]; }
	
	function ToString specializes BaseFunctions::ToString { in x: Boolean[1]; return : String[1]; }
	function ToBoolean { in x: String[1]; return : Boolean[1]; }
	
}
	
// ===== END: BooleanFunctions.kerml =====

// ===== BEGIN: CollectionFunctions.kerml =====
standard library package CollectionFunctions {
	doc
	/*
	 * This package defines functions on Collections (as defined in the Collections package). 
	 * For functions on general sequences of values, see the SequenceFunctions package.
	 */

	private import Base::Anything;
	private import ScalarValues::*;
	private import SequenceFunctions::equals;
	private import SequenceFunctions::includes;
	private import ControlFunctions::exists;
	public import Collections::*;
	
	function '==' specializes BaseFunctions::'==' { in col1: Collection[0..1]; in col2: Collection[0..1];
		return : Boolean[1] = col1.elements->equals(col2.elements);
	}
	
	function size { in col: Collection[1];
		return : Natural[1] = SequenceFunctions::size(col.elements);
	}
	
	function isEmpty { in col: Collection[1]; 
		return : Boolean[1] = SequenceFunctions::isEmpty(col.elements);
	}
	
	function notEmpty { in col: Collection[1]; 
		return : Boolean[1] = SequenceFunctions::notEmpty(col.elements);
	}
	
	function contains { in col: Collection[1]; in values: Anything[*];
		return : Boolean[1] = col.elements->includes(values);
	}
	
	function containsAll { in col1: Collection[1]; in col2: Collection[2]; 
		return : Boolean[1] = contains(col1, col2.elements);
	}	
	
	function head { in col: OrderedCollection[1]; 
		return : Anything[0..1] = SequenceFunctions::head(col.elements);
	}
	
	function tail { in col: OrderedCollection[1]; 
		return : Anything[0..*] ordered nonunique = SequenceFunctions::tail(col.elements);	
	}
	
	function last { in col: OrderedCollection[1]; 
		return : Anything[0..1] = SequenceFunctions::last(col.elements);
	}
	
	function '#' specializes BaseFunctions::'#' { in col: OrderedCollection[1]; in index: Positive[1];
		// Cast ensures this function is not called recursively if the elements of col are OrderedCollections.
		return : Anything[0..1] = (col.elements as Anything)#(index);		
	}
	
	function 'array#' specializes BaseFunctions::'#' { in arr: Array[1]; in indexes: Positive[n] ordered nonunique;		
		private feature n : Natural[1] = arr.rank;
		
		// Assumes row-major ordering for elements.
		private function index { in arr: Array[1]; in i : Natural; in indexes : Positive[1..*];
			if i <= 1? indexes#(1) else arr.dimensions#(i) * (index(arr, i-1, indexes) - 1) + indexes#(i)
		}
		
		return : Anything[0..1] =
			if n == 0 or (1..n)->exists {in i; indexes#(i) > arr.dimensions#(i)}? null 
			else arr.elements#(index(arr, n, indexes));
	}	
}
// ===== END: CollectionFunctions.kerml =====

// ===== BEGIN: ComplexFunctions.kerml =====
standard library package ComplexFunctions {
	doc
	/*
	 * This package defines functions on Complex values, including concrete specializations of the 
	 * general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
		
	feature i: Complex[1] = rect(0.0, 1.0);
	
	function rect { in re: Real[1]; in im: Real[1]; return : Complex[1]; }
	function polar { in abs: Real[1]; in arg: Real[1]; return : Complex[1]; }
	
	function re { in x: Complex[1]; return : Real[1]; }
	function im { in x: Complex[1]; return : Real[1]; }
	
	function isZero specializes NumericalFunctions::isZero { in x : Complex[1];
		return : Boolean[1] = re(x) == 0.0 and im(x) == 0.0;
	}
	function isUnit specializes NumericalFunctions::isUnit { in x : Complex[1];
		return : Boolean[1] = re(x) == 1.0 and im(x) == 0.0;
	}
	
	function abs specializes NumericalFunctions::abs { in x: Complex[1]; return : Real[1]; }
	function arg { in x: Complex[1]; return : Real[1]; }
	
	function '+' specializes NumericalFunctions::'+' { in x: Complex[1]; in y: Complex[0..1]; return : Complex[1]; }
	function '-' specializes NumericalFunctions::'-' { in x: Complex[1]; in y: Complex[0..1]; return : Complex[1]; }
	function '*' specializes NumericalFunctions::'*' { in x: Complex[1]; in y: Complex[1]; return : Complex[1]; }
	function '/' specializes NumericalFunctions::'/' { in x: Complex[1]; in y: Complex[1]; return : Complex[1]; }
	function '**' specializes NumericalFunctions::'**' { in x: Complex[1]; in y: Complex[1]; return : Complex[1]; }
	function '^' specializes NumericalFunctions::'^' { in x: Complex[1]; in y: Complex[1]; return : Complex[1]; }
	
	function '==' specializes DataFunctions::'==' { in x: Complex[0..1]; in y: Complex[0..1]; return : Boolean[1]; }
	
	function ToString specializes BaseFunctions::ToString { in x: Complex[1]; return : String[1]; }
	function ToComplex { in x: String[1]; return : Complex[1]; }
	
	function sum specializes NumericalFunctions::sum { in collection: Complex[0..*];
		return : Complex[1] default NumericalFunctions::sum0(collection, rect(0.0, 0.0));
	}
	
	function product specializes NumericalFunctions::product { in collection: Complex[0..*];
		return : Complex[1] default NumericalFunctions::product1(collection, rect(1.0, 0.0));
	}	
}
// ===== END: ComplexFunctions.kerml =====

// ===== BEGIN: ControlFunctions.kerml =====
standard library package ControlFunctions {
	doc
	/*
	 * This package defines functions that correspond to operators in the KerML expression notation 
	 * for which one or more operands are expressions whose evaluation is determined by another operand.
	 */

	private import Base::Anything;
	private import ScalarValues::ScalarValue;
	private import ScalarValues::Boolean;
	private import ScalarFunctions::min;
	private import ScalarFunctions::max;
	
	abstract function '.' {
		in feature source : Anything[0..*] nonunique {
	  		abstract feature target : Anything[0..*] nonunique;
	  	}	  	
	  	private feature chain chains source.target;
	    chain
	}
	
	abstract function 'if' { 
		in test: Boolean[1];
		in expr thenValue[0..1] { return : Anything[0..*] ordered nonunique; }
		in expr elseValue[0..1] { return : Anything[0..*] ordered nonunique; }
		return : Anything[0..*] ordered nonunique;
	}
	
	abstract function '??' {
		in firstValue: Anything[0..*] ordered nonunique;
		in expr secondValue[0..1] { return : Anything[0..*] ordered nonunique; }
		return : Anything[0..*] ordered nonunique;
	}
	
	function 'and' {
		in firstValue: Boolean[1];
		in expr secondValue[0..1] { return : Boolean[1]; }
		return : Boolean[1];
	}
	
	function 'or'{
		in firstValue: Boolean[1];
		in expr secondValue[0..1] { return : Boolean[1]; }
		return : Boolean[1];
	}
	
	function 'implies'{
		in firstValue: Boolean[1];
		in expr secondValue[0..1] { return : Boolean[1]; }
		return : Boolean[1];
	}
	
	abstract function collect { 
		in collection: Anything[0..*] ordered nonunique;
		in expr mapper[0..*] { in argument: Anything[1]; return : Anything[0..*] ordered nonunique; }
		return : Anything[0..*] ordered nonunique;
	}
	
	abstract function select { 
		in collection: Anything[0..*] ordered nonunique; 
		in expr selector[0..*] { in argument: Anything[1]; return : Boolean[1]; }
		return : Anything[0..*] ordered nonunique;
	}
	
	function selectOne { 
		in collection: Anything[0..*] ordered nonunique;
		in expr selector1[0..*] { in argument: Anything[1]; return : Boolean[1]; }
		return : Anything[0..1] = collection->select {in x; selector1(x)}#(1);
	}
	
	abstract function reject{ 
		in collection: Anything[0..*] ordered nonunique; 
		in expr rejector[0..*] { in argument: Anything[1]; return : Boolean[1]; }
		return : Anything[0..*] ordered nonunique;
	}
	
	abstract function reduce { 
		in collection: Anything[0..*] ordered nonunique; 
		in expr reducer[0..*] { in firstArg: Anything[1]; in secondArg: Anything[1]; return : Anything[1]; }
		return : Anything[0..*] ordered nonunique;
	}
	
	abstract function forAll { 
		in collection: Anything[0..*] ordered nonunique; 
		in expr test[0..*] { in argument: Anything[1]; return : Boolean[1]; }
		return : Boolean[1];
	}
	
	abstract function exists { 
		in collection: Anything[0..*] ordered nonunique;
		in expr test[0..*] { in argument: Anything[1]; return : Boolean[1]; }
		return : Boolean[1];
	}
	
	function allTrue {
		in collection: Boolean[0..*]; 
		return : Boolean[1] = collection->forAll {in x; x};
	}
	
	function anyTrue {
		in collection: Boolean[0..*];
		return : Boolean[1] = collection->exists {in x; x};
	}
	
	function minimize {
		in collection: ScalarValue[1..*];
		in expr fn[0..*] { in argument: ScalarValue[1]; return : ScalarValue[1]; }
		return : ScalarValue[1] = collection->collect {in x; fn(x)}->reduce min;
	}
	
	function maximize { 
		in collection: ScalarValue[1..*];
		in expr fn[0..*] { in argument: ScalarValue[1]; return : ScalarValue[1]; }
		return : ScalarValue = collection->collect {in x; fn(x)}->reduce max;
	}
	
}
// ===== END: ControlFunctions.kerml =====

// ===== BEGIN: DataFunctions.kerml =====
standard library package DataFunctions {
	doc
	/*
	 * This package defines the abstract base functions corresponding to all the unary and binary operators 
	 * in the KerML expression notation that might be defined on various kinds of DataValues.
	 */

	private import Base::DataValue;
	private import ScalarValues::Boolean;
	private import ControlFunctions::reduce;	
	
	abstract function '==' specializes BaseFunctions::'==' { in x: DataValue[0..1]; in y: DataValue[0..1]; 
		return : Boolean[1];
	}
	function '===' specializes BaseFunctions::'==='{ in x: DataValue[0..1]; in y: DataValue[0..1]; 
		return : Boolean[1] = x == y;
	}
	
	abstract function '+' { in x: DataValue[1]; in y: DataValue[0..1]; return : DataValue[1]; }
	abstract function '-' { in x: DataValue[1]; in y: DataValue[0..1]; return : DataValue[1]; }
	abstract function '*' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function '/' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function '**' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function '^' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function '%' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	
	abstract function 'not' { in x: DataValue[1]; return : DataValue[1]; }
	abstract function 'xor' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }

	abstract function '~' { in x: DataValue[1]; return : DataValue[1]; }
	abstract function '|' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function '&' { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	
	abstract function '<' { in x: DataValue[1]; in y: DataValue[1]; return : Boolean[1]; }
	abstract function '>' { in x: DataValue[1]; in y: DataValue[1]; return : Boolean[1]; }
	abstract function '<=' { in x: DataValue[1]; in y: DataValue[1]; return : Boolean[1]; }
	abstract function '>=' { in x: DataValue[1]; in y: DataValue[1]; return : Boolean[1]; }
	
	abstract function max { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	abstract function min { in x: DataValue[1]; in y: DataValue[1]; return : DataValue[1]; }
	
	abstract function '..' { in lower: DataValue[1]; in upper: DataValue[1]; return : DataValue[0..*] ordered; }	
}
// ===== END: DataFunctions.kerml =====

// ===== BEGIN: IntegerFunctions.kerml =====
standard library package IntegerFunctions {
	doc
	/*
	 * This package defines functions on Integer values, including concrete specializations of the 
	 * general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
	
	function abs specializes RationalFunctions::abs { in x: Integer[1]; return : Natural[1]; }
	
	function '+' specializes RationalFunctions::'+' { in x: Integer[1]; in y: Integer[0..1]; return : Integer[1]; }
	function '-' specializes RationalFunctions::'-' { in x: Integer[1]; in y: Integer[0..1]; return : Integer[1]; }
	function '*' specializes RationalFunctions::'*' { in x: Integer[1]; in y: Integer[1]; return : Integer[1]; }
	function '/' specializes RationalFunctions::'/' { in x: Integer[1]; in y: Integer[1]; return : Rational[1]; }
	function '**' specializes RationalFunctions::'**' { in x: Integer[1]; in y: Natural[1]; return : Integer[1]; }
	function '^' specializes RationalFunctions::'^' { in x: Integer[1]; in y: Natural[1]; return : Integer[1]; }
	function '%' specializes NumericalFunctions::'%' { in x: Integer[1]; in y: Integer[1]; return : Integer[1]; }
	
	function '<' specializes RationalFunctions::'<' { in x: Integer[1]; in y: Integer[1]; return : Boolean[1]; }
	function '>' specializes RationalFunctions::'>' { in x: Integer[1]; in y: Integer[1]; return : Boolean[1]; }
	function '<=' specializes RationalFunctions::'<=' { in x: Integer[1]; in y: Integer[1]; return : Boolean[1]; }
	function '>=' specializes RationalFunctions::'>=' { in x: Integer[1]; in y: Integer[1]; return : Boolean[1]; }

	function max specializes RationalFunctions::max { in x: Integer[1]; in y: Integer[1]; return : Integer[1]; }
	function min specializes RationalFunctions::min { in x: Integer[1]; in y: Integer[1]; return : Integer[1]; }

	function '==' specializes DataFunctions::'==' { in x: Integer[0..1]; in y: Integer[0..1]; return : Boolean[1]; }
	
	function '..' specializes ScalarFunctions::'..' { in lower: Integer[1]; in upper: Integer[1]; return : Integer[0..*]; }
	
	function ToString specializes RationalFunctions::ToString { in x: Integer[1]; return : String[1]; }
	function ToNatural { in x: Integer[1]; return : Natural[1]; }
	function ToInteger { in x: String[1]; return : Integer[1]; }
	
	function sum specializes RationalFunctions::sum { in collection: Integer[0..*]; 
		return : Integer[1] default NumericalFunctions::sum0(collection, 0);
	}
	
	function product specializes RationalFunctions::product { in collection: Integer[0..*];
		return : Integer[1] default NumericalFunctions::product1(collection, 1);
	}
}	
// ===== END: IntegerFunctions.kerml =====

// ===== BEGIN: NaturalFunctions.kerml =====
standard library package NaturalFunctions {
	doc
	/*
	 * This package defines functions on Natural values, including concrete specialization of the 
	 * general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
	
	function '+' specializes IntegerFunctions::'+' { in x: Natural[1]; in y: Natural[0..1]; return : Natural[1]; }
	function '*' specializes IntegerFunctions::'*' { in x: Natural[1]; in y: Natural[1]; return : Natural[1]; }
	function '/' specializes IntegerFunctions::'/' { in x: Natural[1]; in y: Natural[1]; return : Natural[1]; }
	function '%' specializes IntegerFunctions::'%' { in x: Natural[1]; in y: Natural[1]; return : Natural[1]; }
	
	function '<' specializes IntegerFunctions::'<' { in x: Natural[1]; in y: Natural[1]; return : Boolean[1]; }
	function '>' specializes IntegerFunctions::'>' { in x: Natural[1]; in y: Natural[1]; return : Boolean[1]; }
	function '<=' specializes IntegerFunctions::'<=' { in x: Natural[1]; in y: Natural[1]; return : Boolean[1]; }
	function '>=' specializes IntegerFunctions::'>=' { in x: Natural[1]; in y: Natural[1]; return : Boolean[1]; }	

	function max specializes IntegerFunctions::max { in x: Natural[1]; in y: Natural[1]; return : Natural[1]; }
	function min specializes IntegerFunctions::min { in x: Natural[1]; in y: Natural[1]; return : Natural[1]; }

	function '==' specializes IntegerFunctions::'==' { in x: Natural[0..1]; in y: Natural[0..1]; return : Boolean[1]; }
	
	function ToString specializes IntegerFunctions::ToString { in x: Natural[1]; return : String[1]; }
	function ToNatural{ in x: String[1]; return : Natural[1]; }
}	
// ===== END: NaturalFunctions.kerml =====

// ===== BEGIN: NumericalFunctions.kerml =====
standard library package NumericalFunctions {
	doc
	/*
	 * This package defines abstract functions on Numerical values for general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
	private import ControlFunctions::reduce;
	
	abstract function isZero{ in x: NumericalValue[1]; return : Boolean; }
	abstract function isUnit{ in x : NumericalValue[1]; return : Boolean; }
	
	abstract function abs{ in x: NumericalValue[1]; return : NumericalValue[1]; }
		
	abstract function '+' specializes ScalarFunctions::'+' { in x: NumericalValue[1]; in y: NumericalValue[0..1]; return : NumericalValue[1]; }
	abstract function '-' specializes ScalarFunctions::'-' { in x: NumericalValue[1]; in y: NumericalValue[0..1]; return : NumericalValue[1]; }
	abstract function '*' specializes ScalarFunctions::'*' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	abstract function '/' specializes ScalarFunctions::'/' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	abstract function '**' specializes ScalarFunctions::'**' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	abstract function '^' specializes ScalarFunctions::'^' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	abstract function '%' specializes ScalarFunctions::'%' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	
	abstract function '<' specializes ScalarFunctions::'<' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : Boolean[1]; }
	abstract function '>' specializes ScalarFunctions::'>' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : Boolean[1]; }
	abstract function '<=' specializes ScalarFunctions::'<=' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : Boolean[1]; }
	abstract function '>=' specializes ScalarFunctions::'>=' { in x: NumericalValue[1]; in y: NumericalValue[1]; return : Boolean[1]; }
	
	abstract function max specializes ScalarFunctions::max { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	abstract function min specializes ScalarFunctions::min { in x: NumericalValue[1]; in y: NumericalValue[1]; return : NumericalValue[1]; }
	
	abstract function sum { in collection: ScalarValue[0..*]; return : ScalarValue[1]; }	
	abstract function product { in collection: ScalarValue[0..*]; return : ScalarValue[1]; }
	
	function sum0 { in collection: NumericalValue[0..*]; in zero: ScalarValue[1]; 
 		inv { isZero(zero) }		
        return : ScalarValue = collection->reduce '+' ?? zero;
	}
	
	function product1 { in collection: ScalarValue[0..*]; in one: ScalarValue[1]; 
		inv { isUnit(one) }		
        return : ScalarValue = collection->reduce '*' ?? one;
	}
}
// ===== END: NumericalFunctions.kerml =====

// ===== BEGIN: OccurrenceFunctions.kerml =====
standard library package OccurrenceFunctions {
	doc
	/*
	 * This package defines utility functions that operate on occurrences, primarily related to 
	 * time during which those occurrences exist.
	 */
	
	private import Occurrences::Occurrence;
	private import Occurrences::HappensDuring;
	private import ScalarValues::Boolean;
	private import ScalarValues::Positive;
	private import SequenceFunctions::notEmpty;
	private import SequenceFunctions::size;
	private import SequenceFunctions::add;
	private import SequenceFunctions::addAt;
	private import SequenceFunctions::remove;
	private import SequenceFunctions::removeAt;
	private import ControlFunctions::forAll;
	 
	function '==='  specializes BaseFunctions::'===' { 
		doc
		/*
		 * Test whether two occurrences are portions of the same life. That is, whether they 
		 * represent different portions of the same entity (colloquially, whether they have
		 * the same "identity").
		 */
		 
		in x: Occurrence[0..1]; 
		in y: Occurrence[0..1];
		
		return : Boolean[1] = x.portionOfLife == y.portionOfLife;
	}
	
	function isDuring {
		doc
		/*
		 * Test whether a performance of this function happens during the input occurrence.
		 */
		
		in occ: Occurrence[1];
		
		private connector all during: HappensDuring[0..1] from self to occ;
		
		return : Boolean[1] = notEmpty(during);
	}
	
	function create {
		doc
		/*
		 * Ensure that the start of a given occurrence happens during a performance of this
		 * function. The occurrence is also returned from the function.
		 */
		
		inout occ: Occurrence[1];
			
		private connector : HappensDuring from occ.startShot to self;	
		
		return : Occurrence[1] = occ;
	}
	
	function destroy {
		doc
		/*
		 * Ensure that the end of a given occurrence happens during a performance of this
		 * function. The occurrence is also returned from the function.
		 */

		inout occ: Occurrence[0..1];
		
		private connector : HappensDuring from [0..1] occ.endShot to self;
		
		return : Occurrence[0..1] = occ;
	}
	
	function addNew {
		doc
		/*
		 * Add a newly created occurrence to the given group of occurrences and return the
		 * new occurrence.
		 */

		inout group: Occurrence[0..*] nonunique;
		inout occ: Occurrence[1];
		
		private composite step : add {
			inout seq1 = group;
			in seq2 = create(occ);
		}
		
		return : Occurrence[1] = occ;
	}
	
	function addNewAt {
		doc
		/*
		 * Add a newly created occurrence to the given ordered group of occurrences at the given
		 * index and return the new occurrence.
		 */

		inout group: Occurrence[0..*] ordered nonunique;
		inout occ: Occurrence[1];
		in index: Positive[1];
		
		private composite step : addAt {
			inout seq = group;
			in values = create(occ);
			in startIndex = index;
		}
		
		return : Occurrence[1] = occ;
	}
	
	behavior removeOld {
		doc
		/*
		 * Remove a given occurrence from a group of occurrences and destroy it.
		 */

		inout group: Occurrence[0..*] nonunique;
		inout occ: Occurrence[0..1];
		
		private composite step removeStep : remove {
			inout seq = group;
			in values = occ;
		}
		private succession removeStep then destroyStep;
		private composite step destroyStep : destroy {
			inout occ = removeOld::occ;
		}
		
	}
	
	behavior removeOldAt {
		doc
		/*
		 * Removes the occurrence at a given index in an ordered group of occurrences 
		 * and destroy it.
		 */
		inout group: Occurrence[0..*] ordered nonunique;
		in index: Positive[1];
		
		private feature oldOcc = group#(index);
		
		private composite step removeStep : remove {
			inout seq = group;
			in index = removeOldAt::index;
		}
		private succession removeStep then destroyStep;
		private composite step destroyStep : destroy {
			inout occ = oldOcc;
		}
		
	}
}
// ===== END: OccurrenceFunctions.kerml =====

// ===== BEGIN: RationalFunctions.kerml =====
standard library package RationalFunctions {
	doc
	/*
	 * This package defines Functions on Rational values, including concrete specializations of the 
	 * general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
	
	function rat { in numer: Integer[1]; in denum: Integer[1]; return : Rational[1]; }
	function numer { in rat: Rational[1]; return : Integer[1]; }
	function denom { in rat: Rational[1]; return : Integer[1]; }
	
	function abs specializes RealFunctions::abs { in x: Rational[1]; return : Rational[1]; }

	function '+' specializes RealFunctions::'+' { in x: Rational[1]; in y: Rational[0..1]; return : Rational[1]; }
	function '-' specializes RealFunctions::'-' { in x: Rational[1]; in y: Rational[0..1]; return : Rational[1]; }
	function '*' specializes RealFunctions::'*' { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }
	function '/' specializes RealFunctions::'/' { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }
	function '**' specializes RealFunctions::'**' { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }
	function '^' specializes RealFunctions::'^' { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }
	
	function '<' specializes RealFunctions::'<' { in x: Rational[1]; in y: Rational[1]; return : Boolean[1]; }
	function '>' specializes RealFunctions::'>' { in x: Rational[1]; in y: Rational[1]; return : Boolean[1]; }
	function '<=' specializes RealFunctions::'<=' { in x: Rational[1]; in y: Rational[1]; return : Boolean[1]; }
	function '>=' specializes RealFunctions::'>=' { in x: Rational[1]; in y: Rational[1]; return : Boolean[1]; }

	function max specializes RealFunctions::max { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }
	function min specializes RealFunctions::min { in x: Rational[1]; in y: Rational[1]; return : Rational[1]; }

	function '==' specializes RealFunctions::'==' { in x: Rational[0..1]; in y: Rational[0..1]; return : Boolean[1]; }
	
	function gcd{ in x: Rational[1]; in y: Rational[1]; return : Integer[1]; }
		
	function floor specializes RealFunctions::floor { in x: Rational[1]; return : Integer[1]; }
	function round specializes RealFunctions::round { in x: Rational[1]; return : Integer[1]; }
	
	function ToString specializes RealFunctions::ToString { in x: Rational[1]; return : String[1]; }
	function ToInteger{ in x: Rational[1]; return : Integer[1]; }
	function ToRational{ in x: String[1]; return : Rational[1]; }
	
	function sum specializes RealFunctions::sum { in collection: Rational[0..*];
		return : Rational[1] default NumericalFunctions::sum0(collection, rat(0, 1));
	}
	
	function product specializes RealFunctions::product { in collection: Rational[0..*];
		return : Rational[1] default NumericalFunctions::product1(collection, rat(1, 1));
	}	
}
// ===== END: RationalFunctions.kerml =====

// ===== BEGIN: RealFunctions.kerml =====
standard library package RealFunctions {
	doc
	/*
	 * This package defines Functions on Real values, including concrete specializations of the 
	 * general arithmetic and comparison operations.
	 */

	public import ScalarValues::*;
	
	function re :> ComplexFunctions::re{ in x: Real[1]; 
        return : Real[1] = x;
	}
	function im :> ComplexFunctions::im{ in x: Real[1]; 
        return : Real[1] = 0.0;
	}
	
	function abs specializes ComplexFunctions::abs { in x: Real[1]; return : Real[1]; }
	function arg specializes ComplexFunctions::arg { in x: Real[1]; 
        return : Real[1] = 0.0;
	}

	function '+' specializes ComplexFunctions::'+' { in x: Real[1]; in y: Real[0..1]; return : Real[1]; }
	function '-' specializes ComplexFunctions::'-' { in x: Real[1]; in y: Real[0..1]; return : Real[1]; }
	function '*' specializes ComplexFunctions::'*' { in x: Real[1]; in y: Real[1]; return : Real[1]; }
	function '/' specializes ComplexFunctions::'/' { in x: Real[1]; in y: Real[1]; return : Real[1]; }
	function '**' specializes ComplexFunctions::'**' { in x: Real[1]; in y: Real[1]; return : Real[1]; }
	function '^' specializes ComplexFunctions::'^' { in x: Real[1]; in y: Real[1]; return : Real[1]; }
	
	function '<' specializes NumericalFunctions::'<' { in x: Real[1]; in y: Real[1]; return : Boolean[1]; }
	function '>' specializes NumericalFunctions::'>' { in x: Real[1]; in y: Real[1]; return : Boolean[1]; }
	function '<=' specializes NumericalFunctions::'<=' { in x: Real[1]; in y: Real[1]; return : Boolean[1]; }
	function '>=' specializes NumericalFunctions::'>=' { in x: Real[1]; in y: Real[1]; return : Boolean[1]; }

	function max specializes NumericalFunctions::max { in x: Real[1]; in y: Real[1]; return : Real[1]; }
	function min specializes NumericalFunctions::min { in x: Real[1]; in y: Real[1]; return : Real[1]; }

	function '==' specializes ComplexFunctions::'==' { in x: Real[0..1]; in y: Real[0..1]; return : Boolean[1]; }
			
	function sqrt{ in x: Real[1]; return : Real[1]; }

	function floor{ in x: Real[1]; return : Integer[1]; }
	function round{ in x: Real[1]; return : Integer[1]; }
	
	function ToString specializes ComplexFunctions::ToString { in x: Real[1]; return : String[1]; }
	function ToInteger{ in x: Real[1]; return : Integer[1]; }
	function ToRational{ in x: Real[1]; return : Rational[1]; }
	function ToReal{ in x: String[1]; return : Real[1]; }
	
	function sum specializes ComplexFunctions::sum { in collection: Real[0..*]; 
        return : Real default NumericalFunctions::sum0(collection, 0.0);
	}
	
	function product specializes ComplexFunctions::product { in collection: Real[0..*]; 
        return : Real default NumericalFunctions::product1(collection, 1.0);
	}	
}
// ===== END: RealFunctions.kerml =====

// ===== BEGIN: ScalarFunctions.kerml =====
standard library package ScalarFunctions {
	doc
	/*
	 * This package defines abstract functions that specialize the DataFunctions for use with ScalarValues. 
	 */

	public import ScalarValues::*;
	
	abstract function '+' specializes DataFunctions::'+' { in x: ScalarValue[1]; in y: ScalarValue[0..1]; return : ScalarValue[1]; }
	abstract function '-' specializes DataFunctions::'-' { in x: ScalarValue[1]; in y: ScalarValue[0..1]; return : ScalarValue[1]; }
	abstract function '*' specializes DataFunctions::'*' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function '/' specializes DataFunctions::'/' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function '**' specializes DataFunctions::'**' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function '^' specializes DataFunctions::'^' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function '%' specializes DataFunctions::'%' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	
	abstract function 'not' specializes DataFunctions::'not' { in x: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function 'xor' specializes DataFunctions::'xor' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }

	abstract function '~' specializes DataFunctions::'~' { in x: ScalarValue[1]; return : ScalarValue[1]; }	
	abstract function '|' specializes DataFunctions::'|' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function '&' specializes DataFunctions::'&' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	
	abstract function '<' specializes DataFunctions::'<' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : Boolean[1]; }
	abstract function '>' specializes DataFunctions::'>' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : Boolean[1]; }
	abstract function '<=' specializes DataFunctions::'<=' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : Boolean[1]; }
	abstract function '>=' specializes DataFunctions::'>=' { in x: ScalarValue[1]; in y: ScalarValue[1]; return : Boolean[1]; }
	
	abstract function max specializes DataFunctions::max { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	abstract function min specializes DataFunctions::min { in x: ScalarValue[1]; in y: ScalarValue[1]; return : ScalarValue[1]; }
	
	abstract function '..' specializes DataFunctions::'..' { in lower: ScalarValue[1]; in upper: ScalarValue[1]; return : ScalarValue[0..*]; }
}
// ===== END: ScalarFunctions.kerml =====

// ===== BEGIN: SequenceFunctions.kerml =====
standard library package SequenceFunctions {
	doc
	/*
	 * This package defines functions that operate on general sequences of values. (For functions that
	 * operate on Collection values, see CollectionFunctions.)
	 */

	private import Base::Anything;
	private import Occurrences::SelfSameLifeLink;
	private import ScalarValues::*;
	private import ControlFunctions::*;
	
	function '#' specializes BaseFunctions::'#' { in seq: Anything[0..*] ordered nonunique; in index: Positive[1];
		return : Anything[0..1];
	}
	
	function equals{ in x: Anything[0..*] ordered nonunique; in y: Anything[0..*] ordered nonunique; 
		return : Boolean[1] =
			size(x) == size(y) and
			(1..size(x))->forAll {in i; x#(i) == y#(i)};
	}

	function same{ in x: Anything[0..*] ordered nonunique; in y: Anything[0..*] ordered nonunique;
		return : Boolean[1] =
			size(x) == size(y) and
			(1..size(x))->forAll {in i; x#(i) === y#(i)};
	}

	function size{ in seq: Anything[0..*] nonunique;
		return : Natural[1] = if isEmpty(seq)? 0 else size(tail(seq)) + 1;
	}
	function isEmpty{ in seq: Anything[0..*] nonunique;
		return : Boolean[1] = seq == null;
	}
	function notEmpty{ in seq: Anything[0..*] nonunique;
		return : Boolean[1] = not isEmpty(seq);
	}
	function includes{ in seq1: Anything[0..*] nonunique; in seq2: Anything[0..*] nonunique;
		return : Boolean[1] = seq2->forAll {in x; seq1->exists{in y; x == y}};
	}
	function includesOnly{ in seq1: Anything[0..*] nonunique; in seq2: Anything[0..*] nonunique;
		return : Boolean[1] = seq1->includes(seq2) and seq2->includes(seq1);
	}
	function excludes{ in seq1: Anything[0..*] nonunique; in seq2: Anything[0..*] nonunique;
		return : Boolean[1] = seq2->forAll {in x; seq1->excludes(x)};
	}
	
	function union{ in seq1: Anything[0..*] ordered nonunique; in seq2: Anything[0..*] ordered nonunique;
		return : Anything[0..*] ordered nonunique = (seq1, seq2);
	}
	function intersection{ in seq1: Anything[0..*] ordered nonunique; in seq2: Anything[0..*] ordered nonunique;
		return : Anything[0..*] ordered nonunique = seq1->select {in x; seq2->includes(x)};
	}
	function including{ in seq: Anything[0..*] ordered nonunique; in values: Anything[0..*] ordered nonunique;
		return : Anything[0..*] ordered nonunique = union(seq, values);
	}
	function includingAt{ in seq: Anything[0..*] ordered nonunique; in values: Anything[0..*] ordered nonunique;
		in index: Positive[1];
		return : Anything[0..*] ordered nonunique = 
			(seq->subsequence(1, index - 1), values, seq->subsequence(index + 1));
	}
	function excluding{ in seq: Anything[0..*] ordered nonunique; in values: Anything[0..*];
		return : Anything[0..*] ordered nonunique = seq->reject {in x; values->includes(x)};
	}
	function excludingAt{ in seq: Anything[0..*] ordered nonunique;
		in startIndex: Positive[1]; in endIndex: Positive[1] default startIndex;
		return : Anything[0..*] ordered nonunique = 
			(seq->subsequence(1, startIndex - 1), seq->subsequence(endIndex + 1));
	}
	
	function subsequence{ in seq: Anything[0..*] ordered nonunique; 
		in startIndex: Positive[1]; in endIndex: Positive[1] default size(seq);
		return : Anything[0..*] = (startIndex..endIndex)->collect {in i; seq#(i)};
	}
	function head{ in seq: Anything[0..*] ordered nonunique;
		return : Anything[0..1] = seq#(1);
	}
	function tail{ in seq: Anything[0..*] ordered nonunique;
		return : Anything[0..*] ordered nonunique = subsequence(seq, 2);
	}
	function last{ in seq: Anything[0..*] ordered nonunique;
		return : Anything[0..1] = seq#(size(seq));
	}
	
	behavior add { inout seq: Anything[0..*] ordered nonunique; in values: Anything[0..*] ordered nonunique;
		private feature newSeq = seq->including(values);
		feature redefines endShot: add {
			binding seq = newSeq;
		}
	}	
	behavior addAt { inout seq: Anything[0..*] ordered nonunique; in values: Anything[0..*] ordered nonunique;
		in index: Positive[1];
		private feature newSeq = seq->includingAt(values, index);
		feature redefines endShot: addAt {
			binding seq = newSeq;
		}
	}
	behavior remove{ inout seq: Anything[0..*] ordered nonunique; in values: Anything[0..*];
		private feature newSeq = seq->excluding(values);
		feature redefines endShot: remove {
			binding seq = newSeq;
		}
	}
	behavior removeAt{ inout seq: Anything[0..*] ordered nonunique;
		in startIndex: Positive[1]; in endIndex: Positive[1] default startIndex;
		private feature newSeq = seq->excludingAt(startIndex, endIndex);
		feature redefines endShot: removeAt {
			binding seq = newSeq;
		}
	}
}
// ===== END: SequenceFunctions.kerml =====

// ===== BEGIN: StringFunctions.kerml =====
standard library package StringFunctions {
	doc
	/*
	 * This package defines functions on String values, including those corresponding to string concatenation 
	 * and comparison operators in the KerML expression notation.
	 */

	public import ScalarValues::*;
	
	function '+' specializes ScalarFunctions::'+' { in x: String[1]; in y:String[1]; return : String[1]; }
	
	function Length{ in x: String[1]; return : Natural[1]; }
	function Substring{ in x: String[1]; in lower: Integer[1]; in upper: Integer[1]; return : String[1]; }
	
	function '<' specializes ScalarFunctions::'<' { in x: String[1]; in y: String[1]; return : Boolean[1]; }
	function '>' specializes ScalarFunctions::'>' { in x: String[1]; in y: String[1]; return : Boolean[1]; }
	function '<=' specializes ScalarFunctions::'<=' { in x: String[1]; in y: String[1]; return : Boolean[1]; }
	function '>=' specializes ScalarFunctions::'>=' { in x: String[1]; in y: String[1]; return : Boolean[1]; }

	function '==' specializes DataFunctions::'==' { in x: String[0..1]; in y: String[0..1]; return : Boolean[1]; }
	
	function ToString specializes BaseFunctions::ToString { in x: String[1];
		return : String[1] = x;
	}
}
// ===== END: StringFunctions.kerml =====

// ===== BEGIN: TrigFunctions.kerml =====
standard library package TrigFunctions {
	doc
	/*
	 * This package defines basic trigonometric functions on real numbers.
	 */

	public import ScalarValues::Real;
	
	feature pi : Real;
	inv piPrecision { RealFunctions::round(pi * 1E20) == 314159265358979323846.0 }
	
	function deg { in theta_rad : Real[1];
		return : Real[1] = theta_rad * 180 / pi;
	}
	function rad { in theta_deg : Real;
		return : Real[1] = theta_deg * pi / 180;
	}
	
	datatype UnitBoundedReal :> Real {
		inv unitBound { -1.0 <= that & that <= 1.0 }
	}
	
	function sin { in theta : Real[1]; return : UnitBoundedReal[1]; }
	function cos { in theta : Real[1]; return : UnitBoundedReal[1]; }
	function tan { in theta : Real[1]; 
        return : Real = sin(theta) / cos(theta);
	}
	function cot { in theta : Real; 
        return : Real = cos(theta) / sin(theta);
	}
	
	function arcsin { in x : UnitBoundedReal[1]; return : Real[1]; }
	function arccos { in x : UnitBoundedReal[1]; return : Real[1]; }
	function arctan { in x : Real[1]; return : Real[1]; }
}
// ===== END: TrigFunctions.kerml =====

// ===== BEGIN: VectorFunctions.kerml =====
standard library package VectorFunctions {
	doc
	/*
	 * This package defines abstract functions on VectorValues corresponding to the algebraic operations
	 * provided by a vector space with inner product. It also includes concrete implementations of these
	 * functions specifically for CartesianVectorValues.
	 */

	private import ScalarValues::NumericalValue;
	private import ScalarValues::Positive;
	private import ScalarValues::Real;
	private import ScalarValues::Boolean;
	private import NumericalFunctions::*;
	private import RealFunctions::sqrt;
	private import TrigFunctions::arccos;
	private import SequenceFunctions::size;
	private import ControlFunctions::*;
	
	public import VectorValues::*;
	
	/* Generic arithmetic functions for all VectorValues. */
	
	abstract function isZeroVector {
		doc
		/*
		 * Return whether a VectorValue is a zero vector.
		 */
		 
		in v: VectorValue[1]; 
		return : Boolean[1]; 
	}
	
	abstract function '+' specializes DataFunctions::'+' {
		doc
		/*
		 * With two arguments, returns the sum of two VectorValues. With one argument, returns that VectorValue.
		 */
		 
	 	in v: VectorValue[1]; 
	 	in w: VectorValue[0..1]; 
		return u: VectorValue[1];
		inv zeroAddition { w == null or isZeroVector(w) implies u == w }
		inv commutivity { w != null implies u == w + v }
	}
	
	abstract function '-' specializes DataFunctions::'-' {
		doc
		/*
		 * With two arguments, returns the difference of two VectorValues. With one arguments, returns the inverse
		 * of the given VectorValue, that is, the VectorValue that, when added to the original VectorValue, results in
		 * the zeroVector.
		 */
	 
		in v: VectorValue[1]; 
		in w: VectorValue[0..1]; 
		return u: VectorValue[1];
		inv negation { w == null implies isZeroVector(v + u) }
		inv difference { w != null implies v + u == w }
	}
	
	abstract function sum0 {
		doc
		/*
		 * Return the sum of a collection of VectorValues. If the collection is empty, return a given zero vector.
		 */
	 
		in coll: VectorValue[*] nonunique; 
		in zero: VectorValue[1]; 
		inv precondition { isZeroVector(zero) }
		return s: VectorValue[1] = coll->reduce '+' ?? zero;
	}

	/* Functions specific to NumericalVectorValues. */
	
	function VectorOf {
		doc
		/*
		 * Construct a NumericalVectorValue whose elements are a non-empty list of component NumericalValues.
		 * The dimension of the NumericalVectorValue is equal to the number of components.
		 */
	 
		in components: NumericalValue[1..*] ordered nonunique; 
		return : NumericalVectorValue[1] {
			:>> dimension = size(components);
			:>> elements = components;
		}
	}
	
	abstract function scalarVectorMult specializes DataFunctions::'*' {
		doc
		/*
		 * Scalar product of a NumericalValue and a NumericalVectorValue.
		 */
	 
		in x: NumericalValue[1]; 
		in v: NumericalVectorValue[1];
		return w: NumericalVectorValue[1];
		inv scaling { norm(w) == x * norm(v) }
		inv zeroLength { isZeroVector(w) implies isZero(norm(w))}
	}
	alias '*' for scalarVectorMult;
	
	abstract function vectorScalarMult specializes DataFunctions::'*' {
		doc
		/*
		 * Scalar product of a NumericalVectorValue and a NumericalValue, which has the same value as the scalar product of the
		 * NumericalValue and the NumericalVectorValue.
		 */
	 
		in v: NumericalVectorValue[1]; 
		in x: NumericalValue[1];
		return w: NumericalVectorValue[1] default scalarVectorMult(x, v);
	}
	
	abstract function vectorScalarDiv specializes DataFunctions::'/' {
		doc
		/*
		 * Scalar quotient of a NumericalVectorValue and a NumericalValue, defined as the scalar product of the inverse of the 
		 * NumericalValue and the NumericalVectorValue.
		 */
	 
		in v: NumericalVectorValue[1]; 
		in x: NumericalValue[1];
		return w: NumericalVectorValue[1] = scalarVectorMult(1.0 / x, v);
	}

	abstract function inner specializes DataFunctions::'*' {
		doc
		/*
		 * Inner product of two NumericalVectorValues.
		 */
	 
		in v: NumericalVectorValue[1]; 
		in w: NumericalVectorValue[1];
		return x: NumericalValue[1];
		inv commmutivity { x == inner(w, v) }
		inv zeroInner { isZeroVector(v) or isZeroVector(w) implies isZero(x)}
	}
	
	abstract function norm {
		doc
		/*
		 * The norm (magnitude) of a NumericalVectorValue, as a NumericalValue.
		 */
	 
		in v: NumericalVectorValue[1]; 
		return l : NumericalValue[1];
		inv squareNorm { l * l == inner(v,v) }
		inv lengthZero { isZero(l) == isZeroVector(v) }
	}
	
	abstract function angle {
		doc
		/*
		 * The angle between two NumericalVectorValues, as a NumericalValue.
		 */
		 
	 	in v: NumericalVectorValue[1]; 
	 	in w: NumericalVectorValue[1]; 
		return theta: NumericalValue[1];
		inv commutivity { theta == angle(w, v) }
		inv lengthInsensitive { theta == angle(w / norm(w), v / norm(v)) }
	}
	
	/* Specialized functions with concrete definitions for CartesianVectorValues. */
	
	function CartesianVectorOf {
		doc
		/*
		 * Construct a CartesianVectorValue whose elements are a non-empty list of Real components.
		 * The dimension of the NumericalVectorValue is equal to the number of components.
		 */
	 
		in components: Real[*] ordered nonunique; 
		return : CartesianVectorValue[1] {
			:>> dimension = size(components);
			:>> elements = components;
		}
	}
	function CartesianThreeVectorOf specializes CartesianVectorOf { 
		in components: Real[3] ordered nonunique;
		return : CartesianThreeVectorValue[1] {
		    feature :>> CartesianVectorOf::result::dimension, CartesianThreeVectorValue::dimension;
		}
	}
	
	feature cartesianZeroVector: CartesianVectorValue[3] =
		(
			CartesianVectorOf(0.0),
			CartesianVectorOf((0.0, 0.0)),
			CartesianThreeVectorOf((0.0, 0.0, 0.0))
		) {
		doc
		/*
		 * Cartesian zero vectors of 1, 2 and 3 dimensions.
		 */
	}
	feature cartesian3DZeroVector: CartesianThreeVectorValue[1] =
		cartesianZeroVector#(3);
	
	function isCartesianZeroVector specializes isZeroVector {
		doc
		/*
		 * A CartesianVectorValue is a zero vector if all its elements are zero.
		 */
	 
		in v: CartesianVectorValue[1]; 
		return : Boolean[1] = v.elements->forAll{in x; x == 0.0};
	}
	
	function 'cartesian+' specializes '+' { 
		in v: CartesianVectorValue[1]; 
		in w: CartesianVectorValue[0..1];
		inv precondition { w != null implies v.dimension == w.dimension }
		return u: CartesianVectorValue[1] =
			if w == null? v
			else CartesianVectorOf(
				(1..w.dimension)->collect{in i : Positive; v#(i) + w#(i)}
			);
	}
	
	function 'cartesian-' specializes '-' { 
		in v: CartesianVectorValue[1]; 
		in w: CartesianVectorValue[0..1];
		inv precondition { w != null implies v.dimension == w.dimension }
		return u: CartesianVectorValue[1] =
			CartesianVectorOf(
				if w == null? CartesianVectorOf(v.elements->collect{in x : Real; -x})
				else CartesianVectorOf(
					(1..v.dimension)->collect{in i : Positive; v#(i) - w#(i)}
				)
			);
	}
	
	function cartesianScalarVectorMult specializes scalarVectorMult { 
		in x: Real[1]; 
		in v: CartesianVectorValue[1];
		return w: CartesianVectorValue[1] =
			CartesianVectorOf(
				v.elements->collect{in y : Real; x * y}
			);
	}
	function cartesianVectorScalarMult specializes vectorScalarMult { 
		in v: CartesianVectorValue[1]; 
		in x: Real[1]; 
		return w: CartesianVectorValue[1] = cartesianScalarVectorMult(x, v);
	}
	
	function cartesianInner specializes inner { 
		in v: CartesianVectorValue[1]; 
		in w : CartesianVectorValue[1];
		inv precondition { v.dimension == w.dimension }
		return x: Real[1] =
			(1..v.dimension)->collect{in i : Positive; v#(i) * w#(i)}->reduce RealFunctions::'+';
	}
	
	function cartesianNorm specializes norm { 
		in v: CartesianVectorValue[1];
		return l : NumericalValue[1] = sqrt(cartesianInner(v, v));
	}
	
	function cartesianAngle specializes angle { 
		in v: CartesianVectorValue[1]; in w: CartesianVectorValue[1];
		inv precondition { v.dimension == w.dimension }
		return theta: Real[1] = arccos(cartesianInner(v, w) / (norm(v) * norm(w)));
	}
	
	function sum { 
		in coll: CartesianThreeVectorValue[*];
		return : CartesianThreeVectorValue[1] = sum0(coll, cartesian3DZeroVector);
	}
	
}
// ===== END: VectorFunctions.kerml =====

// ===== END: Kernel Function Library.kerml =====

// ===== BEGIN: Kernel Semantic Library.kerml =====
// ===== BEGIN: Base.kerml =====
standard library package Base {
	doc 
	/*
	 * This package defines the classifiers and features that provide the bases for the typing
	 * of all elements in the language.
	 */
	 		
	abstract classifier Anything {
		doc
		/*
	     * Anything is the top level generalized type in the language. 
	     */
		
		feature self: Anything[1] subsets things chains things.that {
			doc
			/*
			 * The source of a SelfLink of this thing to itself. self is thus a feature that
			 * relates everything to itself. It is also the value of the nested "that" feature
			 * of all other things featured by this thing.
			 */
		}
	}
	
	abstract datatype DataValue specializes Anything {
		doc
		/*
		 * Value is the most general classifier of entities that are values that do not change
		 * over time.
		 */
		
		feature self: DataValue redefines Anything::self;
	}
	
	abstract feature things: Anything [1..*] nonunique {
		doc
		/*
		 * things is the top-level feature in the language.
		 */

		feature that : Anything[1] {
			doc
			/*
			 * For each value of things, the "featuring instance" of that value. 
			 * This is enforced by declaring Anything::self to be the chaining of things.that, 
			 * restricting it the single value of self.
			 */			
		}
	}
	
	abstract feature dataValues: DataValue[0..*] nonunique subsets things {
		doc
		/*
		 * dataValues is a specialization of things restricted to type DataValue.
		 */
	}
		 
	abstract feature naturals: ScalarValues::Natural[0..*] subsets dataValues {
		doc
		/*
		 * naturals is a specialization of dataValues restricted to type Natural. 
		 * It is the root feature of all multiplicities, which map from a feature to
		 * the set of Natural numbers representing allowable cardinalities of the feature.
		 */
	}
	
	multiplicity exactlyOne [1..1] {
		doc
		/*
		 * exactlyOne is a multiplicity range requiring a cardinality of exactly one.
		 */
	}
	
	multiplicity zeroOrOne [0..1] {
		doc
		/*
		 * zeroOrOne is a multiplicity range requiring a cardinality of zero or one.
		 */		
	}
	
	multiplicity oneToMany [1..*] {
		doc
		/*
		 * oneToMany is a multiplicity range allowing any cardinality of one or more.
		 */
	}
	
	multiplicity zeroToMany [0..*] {
		doc
		/*
		 * zeroToMany is a multiplicity range allowing any cardinality of zero or more
		 * (that is, no restriction).
		 */
	}
	
}
// ===== END: Base.kerml =====

// ===== BEGIN: Clocks.kerml =====
standard library package Clocks {
	doc
	/*
	 * This package models Clocks that provide an advancing numerical reference 
	 * usable for quantifying the time of an Occurrence.
	 */

	private import ScalarValues::NumericalValue;
	private import ScalarValues::Real;
	private import Occurrences::Occurrence;
	private import Occurrences::Life;
	private import ControlFunctions::forAll;
	
	private struct UniversalClockLife[1] :> Clock, Life {
	    doc
	    /*
	     * UniversalClockLife is the classifier of the singleton Life of the universalClock.
	     */
	}
	
	feature universalClock : UniversalClockLife[1] {
		doc
		/*
		 * universalClock is a single Clock that can be used as a default universal
		 * time reference.
		 */
	}
	
	abstract struct Clock {
		doc
		/*
		 * A Clock provides a numerical currentTime that advances montonically
		 * over its lifetime. Clock is an abstract base Structure that can be
		 * specialized for different kinds of time quantification (e.g., discrete
		 * time, continuous time, time with units, etc.).
		 */
		 
		private thisClock : Clock :>> self;
		
		var feature currentTime : NumericalValue[1] {
			doc
			/*
			 * A scalar time reference that advances over the lifetime of the Clock. 
			 */
		}
						
		inv timeFlowConstraint {
			doc
			/*
			 * The currentTime of a snapshot of a Clock is equal to
			 * the TimeOf the snapshot relative to that Clock.
			 */
			
			snapshots->forAll{in s : Clock; 
				TimeOf(s, thisClock) == s.currentTime
			}
		}		
	}
	
	abstract function TimeOf {
		doc
		/*
		 * TimeOf returns a numerical timeInstant for a given Occurrence relative to
		 * a given Clock. The timeInstant is the time of the start of the Occurrence,
		 * which is considered to be synchronized with the snapshot of the Clock 
		 * with a currentTime equal to the returned timeInstant.
		 */
		
		in o : Occurrence[1];
		in clock : Clock[1] default localClock;
		return timeInstant : NumericalValue[1];
		
		 inv startTimeConstraint {
		 	doc
			/*
			 * The TimeOf an Occurrence is equal to the time of its start snapshot.
			 */
			 
		 	timeInstant == TimeOf(o.startShot, clock)
		 }	 

		inv timeOrderingConstraint {
			doc
			/*
			 * If one Occurrence happens before another, then the TimeOf the end
			 * snapshot of the first Occurrence is no greater than the TimeOf the 
			 * second Occurrence.
			 */
			
			o.predecessors->forAll{in p : Occurrence; 
				TimeOf(p.endShot, clock) <= timeInstant
			}
		}
				
		inv timeContinuityConstraint {
			doc
			/*
			 * If one Occurrence happens immediately before another, then the TimeOf 
			 * the end snapshot of the first Occurrence equals the TimeOf the second
			 * Occurrence.
			 */
		 
			o.immediatePredecessors->forAll{in p : Occurrence; 
				TimeOf(p.endShot, clock) == timeInstant
			}
		}				
	}
	
	function DurationOf {
		doc
		/*
		 * DurationOf returns the duration of a given Occurrence relative to a
		 * given Clock, which is equal to the TimeOf the end snapshot of the
		 * Occurrence minus the TimeOf its start snapshot.
		 */
		
		in o : Occurrence[1]; 
		in clock : Clock[1] default localClock;
		return duration : NumericalValue =
			TimeOf(o.endShot, clock) - TimeOf(o.startShot, clock);
	}
	
	struct BasicClock :> Clock {
		doc
		/*
		 * A BasicClock is a Clock whose currentTime is a Real number.
		 */
		
		var feature :>> currentTime : Real;
	}
	
	function BasicTimeOf :> TimeOf {
		doc
		/*
		 * BasicTimeOf returns the TimeOf an Occurrence as a Real number relative
		 * to a BasicClock.
		 */

		in o : Occurrence[1];
		in clock : BasicClock[1];
		return : Real[1];
	}
	
	function BasicDurationOf :> DurationOf {
		doc
		/*
		 * BasicDurationOf returns the DurationOf an Occurrence as a Real number relative
		 * to a BasicClock.
		 */
		
		in o : Occurrence[1];
		in clock : BasicClock[1];
		return : Real[1];
	}

}
// ===== END: Clocks.kerml =====

// ===== BEGIN: ControlPerformances.kerml =====
standard library package ControlPerformances {
	doc
	/*
	 * This package defines Behaviors to be used to type Steps that control the sequencing of performance
	 * of other Steps. 
	 */

	private import ScalarValues::Boolean;
	private import SequenceFunctions::size;
	private import SequenceFunctions::notEmpty;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensBefore;
	private import Occurrences::SelfSameLifeLink;
	private import Performances::Performance;
	private import Performances::BooleanEvaluation;
	
	behavior DecisionPerformance specializes Performance {
		doc
		/*
		 * A DecisionPerformance is a Performance that represents the selection of one of the Successions
		 * that have the DecisionPerforance behavior as their source. All such Successions must subset the 
		 * outgoingHBLink feature of the source DecisionPerformance. For each instance of DecisionPerformance, 
		 * the outgoingHBLink is an instance of exactly one of the Successions, ordering the DecisionPerformance
		 * as happening before an instance of the target of that Succcession.
		 */
		
		feature outgoingHBLink: HappensBefore[1] {
			doc
			/*
			 * Specializations subset this by all
			 * successions going out of a decision step.
			 */

			 end feature redefines earlierOccurrence subsets that;
		}
	}
	
	behavior MergePerformance specializes Performance {
		doc
		/*
		 * A MergePerformance is a Performance that represents the merging of all Successions that
		 * target the MergePerforance behavior. All such Successions must subset the incomingHBLink
		 * feature of the target MergePerformance. For each instance of MergePerformance, the
		 * incomingHBLink is an instance of exactly one of the Successions, ordering the
		 * MergePerformance as happening after an instance of the source of that Succession.
		 */

		feature incomingHBLink: HappensBefore[1] {
			doc
			/*
			 * Specializations subset this by all
			 * successions coming into a merge step.
			 */

			 end feature redefines laterOccurrence subsets that;
		}
	}

	abstract behavior IfPerformance specializes Performance {
		doc
		/*
		 * An IfPerformance is a Performance that determines whether the ifTest evaluation result is true 
		 * (by whether ifTrue has a value).
		 */	
		 
		in ifTest : BooleanEvaluation[1];
	}
	
	behavior IfThenPerformance specializes IfPerformance {
		doc
		/*
		 * An IfThenPerformance is an IfPerformance where the thenClause occurs after and only after the 
		 * ifTest evaluation result is true.
		 */
		
		in redefines ifTest;
		in thenClause : Occurrence[0..1];
		succession [1] ifTest then [0..1] thenClause;
		inv { ifTest() == thenClause->notEmpty() }
	}
	
	behavior IfElsePerformance specializes IfPerformance {
		doc
		/*
		 * An IfElsePerformance is an IfPerformance where the elseClause occurs after and only 
		 * after the ifTest evaluation result is not true.
		 */

		in redefines ifTest;
		in elseClause : Occurrence[0..1];
		succession [1] ifTest then [0..1] elseClause;
		inv { not ifTest() == elseClause->notEmpty() }
	}
	
	behavior IfThenElsePerformance specializes IfThenPerformance {
		doc
		/*
		 * An IfThenElsePerformance is an IfThenPerformance with an additional elseClause that
		 * occurs after and only after the ifTest evaluation is false.
		 */
		 
		in redefines ifTest;
		in redefines thenClause;
        in elseClause : Occurrence[0..1];
        succession [1] ifTest then [0..1] elseClause;
        inv { not ifTest() == elseClause->notEmpty() }
	}
	
	behavior LoopPerformance specializes Performance {
		doc
		/*
		 * A LoopPerformance is a Performance where the body occurs repeatedly in sequence (iterates) 
		 * as long as the whileTest evaluation result is true before each iteration (and after the 
		 * previous one, except the first time) and the untilTest evaluation result is not true after 
		 * each iteration and before the next one (except the last one).
		 */
		 
		in whileTest : BooleanEvaluation[1..*];
		in body : Occurrence[0..*];
        in untilTest : BooleanEvaluation[0..*];
		
		step whileDecision : IfThenPerformance[1..*];
		step untilDecision : IfElsePerformance[0..*];
		
		binding [1] whileDecision.ifTest = [1] whileTest;
		binding [1] whileDecision.thenClause = [1] body;
		
		succession body then untilDecision;
		
		binding [1] untilDecision.ifTest = [1] untilTest;
		binding loopBack of [0..1] untilDecision.elseClause = [1] whileDecision;
		
		inv { loopBack->size() == whileDecision->size() - 1 }
	}
}
// ===== END: ControlPerformances.kerml =====

// ===== BEGIN: FeatureReferencingPerformances.kerml =====
standard library package FeatureReferencingPerformances {
	doc
	/*
	 * This package defines Behaviors used to read, write and monitor values of a referenced Feature of an 
	 * Occurrence.
	 */

	private import Base::Anything;
	private import Base::things;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensWhile;
	private import Occurrences::HappensBefore;
	private import Occurrences::HappensJustBefore;
	private import Occurrences::SelfSameLifeLink;
	private import Performances::Performance;
	private import Performances::Evaluation;
	private import ScalarValues::Boolean;
	private import SequenceFunctions::isEmpty;
	private import SequenceFunctions::equals;

	abstract behavior FeatureReferencingPerformance specializes Performance {
		doc
		/*
		 * A FeatureReferencingPerformance is the base Performance for specialized behaviors related 
		 * to values of a referenced Feature of a given Occurrence, as identified in specializations 
		 * of this Behavior.
		 */
		
		in abstract feature onOccurrence : Occurrence [1] {
			doc
			/*
			 * Occurrence with values for the referenced feature in specializations of this behavior.
			 */
		}
		 
		inout feature values : Anything [*] nonunique {
			doc
			/*
			 * Values of the referenced feature, as specified in specializations of this behavior.
			 */
		}	
	}

    abstract behavior FeatureAccessPerformance specializes FeatureReferencingPerformance {
    	doc
		/*
		 * A FeatureAccessPerformance is a FeatureReferencingPerformance where the result values
		 * are all the values of a feature of onOccurrence at the time the Performance ends. The
		 * feature is specified by restricting accessedFeature in specializations or usages.
		 */
     	
		in abstract feature onOccurrence : Occurrence {
			abstract feature startingAt : Occurrence [1] subsets timeSlices {
				abstract feature accessedFeature : Anything [*] nonunique;
			}
		}

	  	 connector :HappensWhile from onOccurrence.startingAt.startShot to endShot {
	  	 	doc
			/*
			 * Requires some time slice of onOccurrence to start when this performance
			 * ends (this connector), with particular feature values (following connector).
			 * The feature is specified by restricting the onOccurrence::accessedFeature 
			 * on usages of this behavior.
			 */
	  	 }
	  	 connector :SelfSameLifeLink from onOccurrence.startingAt.accessedFeature to values;
	}

	abstract function FeatureReadEvaluation specializes FeatureAccessPerformance, Evaluation { 
		doc
		/*
		 * A FeatureReadEvaluation is a FeatureAccessPerformance that is a function providing as
		 * its result the values of a feature on an occurrence at the time its evaluation ends.
		 */

		in onOccurrence: Occurrence [1];
		return resultValues : Anything [*] nonunique redefines result redefines values;
	}

	abstract behavior FeatureWritePerformance specializes FeatureAccessPerformance {
		doc
		/*
		 * A FeatureWritePerformance is a FeatureAccessPerformance that assigns the values of a 
		 * feature on an occurrence to the given replacementValues at time its performance ends.
		 */
		 
		in feature onOccurrence : Occurrence[1] redefines onOccurrence;
		inout feature replacementValues : Anything redefines values [*] nonunique;
	}
	
	abstract behavior FeatureMonitorPerformance specializes FeatureReferencingPerformance {
		doc
		/*
		 * A FeatureMonitorPerformance is a FeatureReferencingPerformance that waits for values
		 * of monitoredFeature to change on onOccurrence from what they were when the performance 
		 * started. The values before and after the change are given by beforeValues and afterValues.
		 */	

		in feature redefines onOccurrence {
	    	feature monitoredOccurrence : Occurrence [1] subsets timeSlices {
	      		abstract feature monitoredFeature : Anything[*] nonunique;
	      		feature beforeTimeSlice : Occurrence [1] subsets timeSlices {
	        		feature redefines monitoredFeature;
	        	}
	      		feature afterSnapshot : Occurrence [1] subsets snapshots {
	        		feature redefines monitoredFeature;
	        	}
	      		connector :HappensJustBefore from beforeTimeSlice to afterSnapshot;
	        }
	  	}
	  	out feature afterValues redefines values;
	  	out feature beforeValues : Anything[*] nonunique;
	  	inv { not beforeValues->equals(afterValues) }
	
	  	private connector : HappensWhile 
	  		from [1] onOccurrence.monitoredOccurrence.beforeTimeSlice.startShot to [1] startShot;
	  	private connector : SelfSameLifeLink 
	  		from [1] onOccurrence.monitoredOccurrence.beforeTimeSlice.monitoredFeature to [1] beforeValues;
	  	private connector : SelfSameLifeLink 
	  		from [1] onOccurrence.monitoredOccurrence.afterSnapshot.monitoredFeature to [1] afterValues;
	  	protected connector endWhen : HappensBefore 
	  		from [1] onOccurrence.monitoredOccurrence.afterSnapshot to [1] endShot;
	}
		
	behavior EvaluationResultMonitorPerformance specializes FeatureMonitorPerformance {
		doc
		/*
		 * An EvaluationResultMonitorPerformance is a FeatureMonitorPerformance that waits for changes 
		 * in the result of an Evaluation identified by onOccurrence. The Predicate being evaluated must 
		 * be able to produce multiple results over time, for example by only using BindingConnectors 
		 * between Steps, rather than Successions or Flows, including in its Step behaviors.
		 */
		
		in feature onOccurrence : Evaluation redefines onOccurrence {
	    	protected expr monitoredOccurrence : Evaluation [1] redefines monitoredOccurrence {
				return result : Anything[*] redefines result, monitoredFeature; 
			} 
		} 
	}
	
	behavior BooleanEvaluationResultMonitorPerformance specializes EvaluationResultMonitorPerformance {
		doc
		/*
		 * A BooleanEvaluationResultMonitorPerformance is a EvaluationResultMonitorPerformance
		 * that waits for changes in the result of a BooleanEvaluation identified by onOccurrence.
		 */	
		
	  	in bool redefines onOccurrence {
	    	protected bool redefines monitoredOccurrence[1] {
	    	    return result : Boolean [1];
	    	}
		}
		out redefines afterValues : Boolean [1]; 
		out redefines beforeValues : Boolean [1];	 
	}
	
	behavior BooleanEvaluationResultToMonitorPerformance specializes FeatureReferencingPerformance {
		doc
		/*
		 * A BooleanEvaluationResultToMonitorPerformance is a FeatureReferencingPerformance that waits 
		 * for the result of a BooleanEvaluation (identified by onOccurrence) to change to either true 
		 * or false, as indicated by isToTrue (defaulting to true). If the result is already true (or false), 
		 * the performance waits for the result to become false (or true) before waiting again for it to 
		 * change back.
		 */	
		 
  		in bool redefines onOccurrence;
  		feature isToTrue : Boolean [1] default true;
  		out afterValues: Boolean[1] redefines values  = isToTrue;
  		private feature monitor1 : BooleanEvaluationResultMonitorPerformance [1] {
    		feature redefines endWhen : HappensJustBefore {
    		    end feature earlierOccurrence;
    		    end feature laterOccurrence;
    		}
  		}
  		private feature monitor2 : BooleanEvaluationResultMonitorPerformance [1] {
    		feature redefines endWhen : HappensJustBefore {
                end feature earlierOccurrence;
                end feature laterOccurrence;
            }
  		}

  		private connector : HappensJustBefore from [1] monitor1 to [0..1] monitor2;
  		inv { isEmpty(monitor2) == (monitor1.afterValues == isToTrue) }

  		private binding [1] monitor1.onOccurrence = [1] onOccurrence;
  		private binding [1] monitor2.onOccurrence = [1] onOccurrence;
	}
}
// ===== END: FeatureReferencingPerformances.kerml =====

// ===== BEGIN: KerML.kerml =====
standard library package KerML {
	doc 
	/*
	 * This package contains a reflective KerML model of the KerML abstract syntax.
	 */
	 
	private import ScalarValues::*;
	public import Kernel::*;
	
	package Root {
		metaclass AnnotatingElement specializes Element {
			derived var feature annotatedElement : Element[1..*] ordered redefines annotatedElement;
			derived composite var feature ownedAnnotatingRelationship : Annotation[0..*] ordered subsets annotation, ownedRelationship;
			derived var feature owningAnnotatingRelationship : Annotation[0..1] subsets owningRelationship, annotation;
			derived var feature annotation : Annotation[0..*] ordered;
		}		
		
		metaclass Annotation specializes Relationship {
			var feature annotatedElement : Element[1..1] redefines target, annotatedElement;
			derived var feature annotatingElement : AnnotatingElement[1..1] redefines source;
			derived var feature owningAnnotatedElement : Element[0..1] subsets annotatedElement, owningRelatedElement;
			derived var feature owningAnnotatingElement : AnnotatingElement[0..1] subsets annotatingElement, owningRelatedElement;
			derived composite var feature ownedAnnotatingElement : AnnotatingElement[0..1] subsets annotatingElement, ownedRelatedElement;
		}		
		
		metaclass Comment specializes AnnotatingElement {
			var feature 'locale' : String[0..1];
			var feature body : String[1..1];
		}		
		
		metaclass Dependency specializes Relationship {
			var feature client : Element[1..*] ordered redefines source;
			var feature supplier : Element[1..*] ordered redefines target;
		}		
		
		metaclass Documentation specializes Comment {
			derived var feature documentedElement : Element[1..1] subsets owner redefines annotatedElement;
		}		
		
		abstract metaclass Element {
			var feature elementId : String[1..1];
			var feature aliasIds : String[0..*] ordered;
			var feature declaredShortName : String[0..1];
			var feature declaredName : String[0..1];
			var feature isImpliedIncluded : Boolean[1..1];
			derived var feature shortName : String[0..1];
			derived var feature name : String[0..1];
			derived var feature qualifiedName : String[0..1];
			derived var feature isLibraryElement : Boolean[1..1];
			
			var feature owningRelationship : Relationship[0..1];
			composite var feature ownedRelationship : Relationship[0..*] ordered;
			derived var feature owningMembership : OwningMembership[0..1] subsets owningRelationship;
			derived var feature owningNamespace : Namespace[0..1];
			derived var feature owner : Element[0..1];
			derived var feature ownedElement : Element[0..*] ordered;
			derived var feature documentation : Documentation[0..*] ordered subsets ownedElement;
			derived composite var feature ownedAnnotation : Annotation[0..*] ordered subsets ownedRelationship;
			derived var feature textualRepresentation : TextualRepresentation[0..*] ordered subsets ownedElement;
		}		
		
		abstract metaclass Import specializes Relationship {
			var feature visibility : VisibilityKind[1..1];
			var feature isRecursive : Boolean[1..1];
			var feature isImportAll : Boolean[1..1];
			
			derived var feature importOwningNamespace : Namespace[1..1] subsets owningRelatedElement redefines source;
			derived var feature importedElement : Element[1..1];
		}		
		
		metaclass Membership specializes Relationship {
			var feature memberShortName : String[0..1];
			var feature memberName : String[0..1];
			var feature visibility : VisibilityKind[1..1];
			derived var feature memberElementId : String[1..1];
			
			var feature memberElement : Element[1..1] redefines target;
			derived var feature membershipOwningNamespace : Namespace[1..1] subsets owningRelatedElement redefines source;
		}		
		
		metaclass MembershipImport specializes Import {
			var feature importedMembership : Membership[1..1] redefines target;
		}		
		
		metaclass Namespace specializes Element {
			derived abstract var feature membership : Membership[0..*] ordered;
			derived composite var feature ownedImport : Import[0..*] ordered subsets ownedRelationship;
			derived var feature 'member' : Element[0..*] ordered;
			derived var feature ownedMember : Element[0..*] ordered subsets 'member';
			derived composite var feature ownedMembership : Membership[0..*] ordered subsets membership, ownedRelationship;
			derived var feature importedMembership : Membership[0..*] ordered subsets membership;
		}		
		
		metaclass NamespaceImport specializes Import {
			var feature importedNamespace : Namespace[1..1] redefines target;
		}		
		
		metaclass OwningMembership specializes Membership {
			derived var feature ownedMemberElementId : String[1..1] redefines memberElementId;
			derived var feature ownedMemberShortName : String[0..1] redefines memberShortName;
			derived var feature ownedMemberName : String[0..1] redefines memberName;
			
			derived composite var feature ownedMemberElement : Element[1..1] subsets ownedRelatedElement redefines memberElement;
		}		
		
		abstract metaclass Relationship specializes Element {
			var feature isImplied : Boolean[1..1];
			
			var feature target : Element[0..*] ordered subsets relatedElement;
			var feature source : Element[0..*] ordered subsets relatedElement;
			var feature owningRelatedElement : Element[0..1] subsets relatedElement;
			composite var feature ownedRelatedElement : Element[0..*] ordered subsets relatedElement;
			derived var feature relatedElement : Element[0..*] ordered nonunique;
		}		
		
		metaclass TextualRepresentation specializes AnnotatingElement {
			var feature 'language' : String[1..1];
			var feature body : String[1..1];
			
			derived var feature representedElement : Element[1..1] subsets owner redefines annotatedElement;
		}		
		
		datatype VisibilityKind {
			member feature 'private' : VisibilityKind[1];
			member feature 'protected' : VisibilityKind[1];
			member feature 'public' : VisibilityKind[1];
		}
		
	}
	
	package Core {
		public import Root::*;
		
		metaclass Classifier specializes Type {
			derived composite var feature ownedSubclassification : Subclassification[0..*] subsets ownedSpecialization;
		}		
		
		metaclass Conjugation specializes Relationship {
			var feature originalType : Type[1..1] redefines target;
			var feature conjugatedType : Type[1..1] redefines source;
			derived var feature owningType : Type[0..1] subsets conjugatedType, owningRelatedElement;
		}		
		
		metaclass CrossSubsetting specializes Subsetting {
			var feature crossedFeature : Feature[1..1] redefines subsettedFeature;
			derived var feature crossingFeature : Feature[1..1] redefines owningFeature, subsettingFeature;
		}		
		
		metaclass Differencing specializes Relationship {
			var feature differencingType : Type[1..1] redefines target;
			derived var feature typeDifferenced : Type[1..1] subsets owningRelatedElement redefines source;
		}		
		
		metaclass Disjoining specializes Relationship {
			var feature typeDisjoined : Type[1..1] redefines source;
			var feature disjoiningType : Type[1..1] redefines target;
			derived var feature owningType : Type[0..1] subsets owningRelatedElement, typeDisjoined;
		}		
		
		metaclass EndFeatureMembership specializes FeatureMembership {
			derived composite var feature ownedMemberFeature : Feature[1..1] redefines ownedMemberFeature;
		}		
		
		metaclass Feature specializes Type {
			var feature isUnique : Boolean[1..1];
			var feature isOrdered : Boolean[1..1];
			var feature isComposite : Boolean[1..1];
			var feature isEnd : Boolean[1..1];
			var feature isDerived : Boolean[1..1];
			var feature isPortion : Boolean[1..1];
			var feature isVariable : Boolean[1..1];
			var feature isConstant : Boolean[1..1];
			var feature direction : FeatureDirectionKind[0..1];
			
			derived var feature owningType : Type[0..1] subsets owningNamespace, featuringType;
			derived var feature 'type' : Type[0..*] ordered;
			derived composite var feature ownedRedefinition : Redefinition[0..*] subsets ownedSubsetting;
			derived composite var feature ownedSubsetting : Subsetting[0..*] subsets ownedSpecialization;
			derived var feature owningFeatureMembership : FeatureMembership[0..1] subsets owningMembership;
			derived var feature endOwningType : Type[0..1] subsets owningType;
			derived composite var feature ownedTyping : FeatureTyping[0..*] ordered subsets ownedSpecialization;
			derived var feature featuringType : Type[0..*] ordered;
			derived composite var feature ownedTypeFeaturing : TypeFeaturing[0..*] ordered subsets ownedRelationship;
			derived var feature chainingFeature : Feature[0..*] ordered nonunique;
			derived composite var feature ownedFeatureInverting : FeatureInverting[0..*] subsets ownedRelationship;
			derived composite var feature ownedFeatureChaining : FeatureChaining[0..*] ordered subsets ownedRelationship;
			derived composite var feature ownedReferenceSubsetting : ReferenceSubsetting[0..1] subsets ownedSubsetting;
			derived var feature featureTarget : Feature[1..1];
			derived var feature crossFeature : Feature[0..1];
			derived composite var feature ownedCrossSubsetting : CrossSubsetting[0..1] subsets ownedSubsetting;
		}		
		
		metaclass FeatureChaining specializes Relationship {
			var feature chainingFeature : Feature[1..1] redefines target;
			derived var feature featureChained : Feature[1..1] subsets owningRelatedElement redefines source;
		}		
		
		datatype FeatureDirectionKind {
			member feature 'in' : FeatureDirectionKind[1];
			member feature 'inout' : FeatureDirectionKind[1];
			member feature 'out' : FeatureDirectionKind[1];
		}
		
		metaclass FeatureInverting specializes Relationship {
			var feature featureInverted : Feature[1..1] redefines source;
			var feature invertingFeature : Feature[1..1] redefines target;
			derived var feature owningFeature : Feature[0..1] subsets featureInverted, owningRelatedElement;
		}		
		
		metaclass FeatureMembership specializes OwningMembership {
			derived var feature owningType : Type[1..1] redefines membershipOwningNamespace;
			derived composite var feature ownedMemberFeature : Feature[1..1] redefines ownedMemberElement;
		}		
		
		metaclass FeatureTyping specializes Specialization {
			var feature typedFeature : Feature[1..1] redefines specific;
			var feature 'type' : Type[1..1] redefines general;
			derived var feature owningFeature : Feature[0..1] subsets typedFeature redefines owningType;
		}		
		
		metaclass Intersecting specializes Relationship {
			var feature intersectingType : Type[1..1] redefines target;
			derived var feature typeIntersected : Type[1..1] subsets owningRelatedElement redefines source;
		}		
		
		metaclass Multiplicity specializes Feature;		
		
		metaclass Redefinition specializes Subsetting {
			var feature redefiningFeature : Feature[1..1] redefines subsettingFeature;
			var feature redefinedFeature : Feature[1..1] redefines subsettedFeature;
		}		
		
		metaclass ReferenceSubsetting specializes Subsetting {
			var feature referencedFeature : Feature[1..1] redefines subsettedFeature;
			derived var feature referencingFeature : Feature[1..1] redefines owningFeature, subsettingFeature;
		}		
		
		metaclass Specialization specializes Relationship {
			var feature general : Type[1..1] redefines target;
			var feature specific : Type[1..1] redefines source;
			derived var feature owningType : Type[0..1] subsets owningRelatedElement, specific;
		}		
		
		metaclass Subclassification specializes Specialization {
			var feature superclassifier : Classifier[1..1] redefines general;
			var feature 'subclassifier' : Classifier[1..1] redefines specific;
			derived var feature owningClassifier : Classifier[0..1] redefines owningType;
		}		
		
		metaclass Subsetting specializes Specialization {
			var feature subsettedFeature : Feature[1..1] redefines general;
			var feature subsettingFeature : Feature[1..1] redefines specific;
			derived var feature owningFeature : Feature[0..1] subsets subsettingFeature redefines owningType;
		}		
		
		metaclass Type specializes Namespace {
			var feature isAbstract : Boolean[1..1];
			var feature isSufficient : Boolean[1..1];
			derived var feature isConjugated : Boolean[1..1];
			
			derived composite var feature ownedSpecialization : Specialization[0..*] ordered subsets ownedRelationship;
			derived composite var feature ownedFeatureMembership : FeatureMembership[0..*] ordered subsets ownedMembership, featureMembership;
			derived var feature 'feature' : Feature[0..*] ordered subsets 'member';
			derived var feature ownedFeature : Feature[0..*] ordered subsets ownedMember;
			derived var feature input : Feature[0..*] ordered subsets directedFeature;
			derived var feature output : Feature[0..*] ordered subsets directedFeature;
			derived var feature inheritedMembership : Membership[0..*] ordered subsets membership;
			derived var feature endFeature : Feature[0..*] ordered subsets 'feature';
			derived var feature ownedEndFeature : Feature[0..*] ordered subsets endFeature, ownedFeature;
			derived composite var feature ownedConjugator : Conjugation[0..1] subsets ownedRelationship;
			derived var feature inheritedFeature : Feature[0..*] ordered subsets 'feature';
			derived var feature 'multiplicity' : Multiplicity[0..1] subsets ownedMember;
			derived var feature unioningType : Type[0..*] ordered;
			derived composite var feature ownedIntersecting : Intersecting[0..*] ordered subsets ownedRelationship;
			derived var feature intersectingType : Type[0..*] ordered;
			derived composite var feature ownedUnioning : Unioning[0..*] ordered subsets ownedRelationship;
			derived composite var feature ownedDisjoining : Disjoining[0..*] subsets ownedRelationship;
			derived var feature featureMembership : FeatureMembership[0..*] ordered;
			derived var feature differencingType : Type[0..*] ordered;
			derived composite var feature ownedDifferencing : Differencing[0..*] ordered subsets ownedRelationship;
			derived var feature directedFeature : Feature[0..*] ordered subsets 'feature';
		}		
		
		metaclass TypeFeaturing specializes Relationship {
			var feature featureOfType : Feature[1..1] redefines source;
			var feature featuringType : Type[1..1] redefines target;
			derived var feature owningFeatureOfType : Feature[0..1] subsets owningRelatedElement, featureOfType;
		}		
		
		metaclass Unioning specializes Relationship {
			var feature unioningType : Type[1..1] redefines target;
			derived var feature typeUnioned : Type[1..1] subsets owningRelatedElement redefines source;
		}		
		
	}
	
	package Kernel {
		public import Core::*;
		
		metaclass Association specializes Classifier, Relationship {
			derived var feature relatedType : Type[0..*] ordered nonunique redefines relatedElement;
			derived var feature sourceType : Type[0..1] subsets relatedType redefines source;
			derived var feature targetType : Type[0..*] subsets relatedType redefines target;
			derived var feature associationEnd : Feature[0..*] redefines endFeature;
		}		
		
		metaclass AssociationStructure specializes Association, Structure;		
		
		metaclass Behavior specializes Class {
			derived var feature 'step' : Step[0..*] subsets 'feature';
			derived var feature parameter : Feature[0..*] ordered redefines directedFeature;
		}		
		
		metaclass BindingConnector specializes Connector;		
		
		metaclass BooleanExpression specializes Expression {
			derived var feature 'predicate' : Predicate[0..1] redefines 'function';
		}		
		
		metaclass Class specializes Classifier;		
		
		metaclass CollectExpression specializes OperatorExpression {
			var feature operator : String[1..1] redefines operator;
		}		
		
		metaclass Connector specializes Feature, Relationship {
			derived var feature relatedFeature : Feature[0..*] ordered nonunique redefines relatedElement;
			derived var feature association : Association[0..*] ordered redefines 'type';
			derived var feature connectorEnd : Feature[0..*] ordered redefines endFeature;
			derived var feature sourceFeature : Feature[0..1] ordered subsets relatedFeature redefines source;
			derived var feature targetFeature : Feature[0..*] ordered subsets relatedFeature redefines target;
			derived var feature defaultFeaturingType : Type[0..1];
		}		
		
		metaclass ConstructorExpression specializes InstantiationExpression;		
		
		metaclass DataType specializes Classifier;		
		
		metaclass ElementFilterMembership specializes OwningMembership {
			derived composite var feature condition : Expression[1..1] redefines ownedMemberElement;
		}		
		
		metaclass Expression specializes Step {
			derived var feature isModelLevelEvaluable : Boolean[1..1];
			
			derived var feature 'function' : Function[0..1] redefines 'behavior';
			derived var feature result : Feature[1..1] subsets output, parameter;
		}		
		
		metaclass FeatureChainExpression specializes OperatorExpression {
			var feature operator : String[1..1] redefines operator;
			
			derived var feature targetFeature : Feature[1..1] subsets 'member';
		}		
		
		metaclass FeatureReferenceExpression specializes Expression {
			derived var feature referent : Feature[1..1] subsets 'member';
		}		
		
		metaclass FeatureValue specializes OwningMembership {
			var feature isInitial : Boolean[1..1];
			var feature isDefault : Boolean[1..1];
			
			derived var feature featureWithValue : Feature[1..1] subsets membershipOwningNamespace;
			derived composite var feature value : Expression[1..1] redefines ownedMemberElement;
		}		
		
		metaclass Flow specializes Connector, Step {
			derived var feature payloadType : Classifier[0..*] ordered nonunique;
			derived var feature targetInputFeature : Feature[0..1] ordered nonunique;
			derived var feature sourceOutputFeature : Feature[0..1] ordered nonunique;
			derived var feature flowEnd : FlowEnd[0..2] ordered subsets connectorEnd;
			derived var feature payloadFeature : PayloadFeature[0..1] subsets ownedFeature;
			derived var feature 'interaction' : Interaction[0..*] ordered redefines association, 'behavior';
		}		
		
		metaclass FlowEnd specializes Feature;		
		
		metaclass Function specializes Behavior {
			derived var feature isModelLevelEvaluable : Boolean[1..1];
			
			derived var feature expression : Expression[0..*] subsets 'step';
			derived var feature result : Feature[1..1] subsets output, parameter;
		}		
		
		metaclass IndexExpression specializes OperatorExpression {
			var feature operator : String[1..1] redefines operator;
		}		
		
		abstract metaclass InstantiationExpression specializes Expression {
			derived var feature argument : Expression[0..*] ordered;
			derived var feature instantiatedType : Type[1..1] subsets 'member';
		}		
		
		metaclass Interaction specializes Association, Behavior;		
		
		metaclass Invariant specializes BooleanExpression {
			var feature isNegated : Boolean[1..1];
		}		
		
		metaclass InvocationExpression specializes InstantiationExpression;		
		
		metaclass LibraryPackage specializes Package {
			var feature isStandard : Boolean[1..1];
		}		
		
		metaclass LiteralBoolean specializes LiteralExpression {
			var feature value : Boolean[1..1];
		}		
		
		metaclass LiteralExpression specializes Expression;		
		
		metaclass LiteralInfinity specializes LiteralExpression;		
		
		metaclass LiteralInteger specializes LiteralExpression {
			var feature value : Integer[1..1];
		}		
		
		metaclass LiteralRational specializes LiteralExpression {
			var feature value : Rational[1..1];
		}		
		
		metaclass LiteralString specializes LiteralExpression {
			var feature value : String[1..1];
		}		
		
		metaclass Metaclass specializes Structure;		
		
		metaclass MetadataAccessExpression specializes Expression {
			derived var feature referencedElement : Element[1..1] subsets 'member';
		}		
		
		metaclass MetadataFeature specializes AnnotatingElement, Feature {
			derived var feature 'metaclass' : Metaclass[0..1] subsets 'type';
		}		
		
		metaclass MultiplicityRange specializes Multiplicity {
			derived var feature lowerBound : Expression[0..1] subsets bound;
			derived var feature upperBound : Expression[1..1] subsets bound;
			derived var feature bound : Expression[1..2] ordered subsets ownedMember;
		}		
		
		metaclass NullExpression specializes Expression;		
		
		metaclass OperatorExpression specializes InvocationExpression {
			var feature operator : String[1..1];
		}		
		
		metaclass Package specializes Namespace {
			derived var feature filterCondition : Expression[0..*] ordered subsets ownedMember;
		}		
		
		metaclass ParameterMembership specializes FeatureMembership {
			derived composite var feature ownedMemberParameter : Feature[1..1] redefines ownedMemberFeature;
		}		
		
		metaclass PayloadFeature specializes Feature;		
		
		metaclass Predicate specializes Function;		
		
		metaclass ResultExpressionMembership specializes FeatureMembership {
			derived composite var feature ownedResultExpression : Expression[1..1] redefines ownedMemberFeature;
		}		
		
		metaclass ReturnParameterMembership specializes ParameterMembership;		
		
		metaclass SelectExpression specializes OperatorExpression {
			var feature operator : String[1..1] redefines operator;
		}		
		
		metaclass Step specializes Feature {
			derived var feature 'behavior' : Behavior[0..*] ordered subsets 'type';
			derived var feature parameter : Feature[0..*] ordered redefines directedFeature;
		}		
		
		metaclass Structure specializes Class;		
		
		metaclass Succession specializes Connector;		
		
		metaclass SuccessionFlow specializes Succession, Flow;		
		
	}
}
// ===== END: KerML.kerml =====

// ===== BEGIN: Links.kerml =====
standard library package Links {
    doc
    /*
     * This package defines associations and features that are related to the typing of links.
     */

    private import Base::Anything;
    private import Base::things;
    
    abstract assoc Link specializes Anything {
        doc
        /*
         * Link is the most general association between two or more things.
         */

        feature participant: Anything[2..*] nonunique ordered;
    }
    
    assoc all BinaryLink specializes Link {
        doc
        /*
         * BinaryLink is the most general binary association between exactly two things, 
         * nominally directed from source to target.
         */
         
        feature participant: Anything[2] nonunique ordered redefines Link::participant;
        
        end feature source: Anything[1] subsets participant;
        end feature target: Anything[1] subsets participant;
    }
    
    assoc all SelfLink specializes BinaryLink {
        doc
        /*
         * SelfLink is a binary association in which the things at the two ends are asserted
         * to be the same.
         */
        
        end feature thisThing: Anything redefines source subsets sameThing crosses sameThing.self;
        end self2 [1] feature sameThing: Anything redefines target subsets thisThing;
    }
        
    abstract feature links: Link[0..*] nonunique subsets things {
        doc
        /*
         * links is the most general feature of links between individuals.
         */
    }
    
    abstract feature binaryLinks: BinaryLink[0..*] nonunique subsets links {
        doc
        /*
         * binaryLinks is a specialization of links restricted to type BinaryLink.
         */
    }
    
    abstract feature selfLinks: SelfLink[0..*] nonunique subsets binaryLinks {
        doc
        /*
         * selfLinks is a specialization of binaryLinks restricted to type SelfLink.
         */

        end feature thisThing: Anything redefines SelfLink::thisThing, binaryLinks::source;
        end feature sameThing: Anything redefines SelfLink::sameThing, binaryLinks::target;
    }

}
// ===== END: Links.kerml =====

// ===== BEGIN: Metaobjects.kerml =====
standard library package Metaobjects {
	doc
	/*
	 * This package defines Metaclasses and Features that are related to the typing of syntactic and semantic metadata.
	 */

	private import Objects::Object;
	private import Objects::objects;
	private import KerML::Element;
	private import KerML::Type;
	
	abstract metaclass Metaobject specializes Object {
		doc
		/*
		 * A Metaobject contains syntactic or semantic information about one or more annotatedElements. 
		 * It is the most general Metaclass. All other Metaclasses must subclassify it directly or indirectly.
		 */

		feature redefines self : Metaobject;
		
		abstract feature annotatedElement : Element[1..*] {
			doc
			/*
			 * The Elements annotated by this Metaobject. This is set automatically when a Metaobject is
			 * instantiated as the value of a MetadataFeature.
			 */
		}
	}
	
	abstract metaclass SemanticMetadata specializes Metaobject {
		doc
		/*
		 * SemanticMetadata is a Metaobject that requires its single annotatedType to directly or indirectly specialize 
		 * a baseType that models the semantics for the annotatedType.
		 */
		
		abstract feature redefines annotatedElement : Type[1] {
			doc
			/*
			 * The single annotatedElement of this SemanticMetadata, which must be a Type.
			 */
		}
		
		feature baseType : Type[1] {
			doc
			/*
			 * The required base Type for the annotatedType.
			 */
		}
	}
	
	feature metaobjects : Metaobject[0..*] :> objects {
		/*
		 * metaobjects is a specialization of objects restricted to type Metadata. It is the most general 
		 * MetadataFeature. All other MetadataFeatures must subset it directly or indirectly.
		 */
	}
}
// ===== END: Metaobjects.kerml =====

// ===== BEGIN: Objects.kerml =====
standard library package Objects {
	doc
	/*
	 * This package defines classifiers and features that are related to the typing of objects, including link objects.
	 */

	private import Base::Anything;
	private import Base::things;
	private import Links::*;
	private import Occurrences::Occurrence;
	private import Occurrences::occurrences;
	private import Occurrences::HappensLink;
	private import Occurrences::SelfSameLifeLink;
	private import Occurrences::WithinBoth;	       
	private import Performances::Performance;
	private import Performances::performances;
	private import SequenceFunctions::isEmpty;
	private import SequenceFunctions::notEmpty;
	private import SequenceFunctions::union;
	private import CollectionFunctions::contains;
	private import ScalarValues::Integer;
	private import ScalarValues::Natural;
	
	abstract struct Object specializes Occurrence {
		doc
		/*
		 * Object is the most general class of structural occurrences that may change over time.
		 */

		feature self: Object redefines Occurrence::self;
		
		composite feature subobjects: Object[0..*] subsets objects, suboccurrences
			intersects objects, suboccurrences {
			doc
			/*
			 * The suboccurrences of this Object that are also Objects.
			 */
		}
		
		feature involvingPerformances: Performance[0..*] subsets performances {
			doc
			/*
			 * Performances in which this object is involved.
			 */
		}
		
		abstract step enactedPerformances: Performance[0..*] subsets involvingPerformances, timeEnclosedOccurrences
			intersects involvingPerformances, timeEnclosedOccurrences {
			doc
			/*
			 * Performances that are enacted by this object.
			 */
		}
		
		composite step ownedPerformances: Performance[0..*] subsets involvingPerformances, timeEnclosedOccurrences, suboccurrences
			intersects involvingPerformances, timeEnclosedOccurrences, suboccurrences {
			doc
			/*
			 * Performances that are owned by this object.
			 */
			 
			feature redefines this default that {
				doc
				/*
				 * The owning object is the default "this" reference for all ownedPerformances.
				 */
			}
		}

		portion structuredSpaceBoundary : StructuredSpaceObject[0..1] subsets spaceBoundary {
			doc
			/*
			 * A space boundary that is a structured space object.
			 */
		}
	}
	
	abstract assoc struct LinkObject specializes Link, Object intersects Link, Object {
		doc
		/*
		 * LinkObject is the most general association structure, being both a Link and an Object.
		 */
	}
	
	assoc struct BinaryLinkObject specializes BinaryLink, LinkObject intersects BinaryLink, LinkObject {
		doc
		/*
		 * BinaryLinkObject is the most general binary association structure, being both a 
		 * BinaryLink and a LinkObject.
		 */
	}
	
	abstract feature objects: Object[0..*] nonunique subsets occurrences {
		doc
		/*
		 * objects is a specialization of occurrences restricted to type Object.
		 */
	}
	
	abstract feature linkObjects: LinkObject[0..*] nonunique subsets links, objects intersects links, objects {
		doc
		/*
		 * linkObjects is a specializations of links and objects restricted to type LinkObjects. 
		 */
	}
	
	abstract feature binaryLinkObjects: BinaryLinkObject[0..*] nonunique subsets binaryLinks, linkObjects
		intersects binaryLinks, linkObjects {
		doc
		/*
		 * binaryLinkObjects is a specialization of binaryLinks and linkObjects restricted to 
		 * type BinaryLinkObjects.
		 */
	}
	

	struct all Body specializes Object {
		doc
		/*
		 * A Body is an Object of inner space dimension 3.
		 */

		feature redefines innerSpaceDimension = 3;
	}

	struct all Surface specializes Object {
		doc
		/*
		 * A Surface is an Object of inner space dimension 2.
		 */
		
		feature redefines innerSpaceDimension = 2;
		  /* The number of  "holes" in this Surface, assuming it isClosed. */
		feature genus : Natural[0..1] default 0;

		inv { notEmpty(genus) implies isClosed }
	}

	struct all Curve specializes Object {
		doc
		/*
		 * A Curve is an Object of inner space dimension 1.
		 */

		feature redefines innerSpaceDimension = 1;
	}

	struct all Point specializes Object {
		doc
		/*
		 * A Point is an Object of inner space dimension 0.
		 */
		 
		feature redefines innerSpaceDimension = 0;
	}

	abstract struct StructuredSpaceObject specializes Object {
		doc
		/*
		 * A StructuredSpaceObject is an Object that is broken up into smaller structured space objects (cells) of
		 * the same or lower inner space dimension: faces that are surfaces, edges that are curves, and vertices
		 * that are points, with edges and vertices on the boundary of faces, and vertices on the boundary of
		 * edges. Cells meet when a structured space object is closed, as required to be a space boundary of
		 * an object (faces meet at their edges and/or vertices, while edges meet at their vertices). The
		 * inner space dimension of structured space object is the highest of their cells.
		 */

        abstract portion feature structuredSpaceObjectCells : StructuredSpaceObject[1..*] subsets Occurrence::spaceSlices { 
            feature cellOrientation : Integer [0..1];
		    inv { notEmpty(cellOrientation) implies (cellOrientation >= -1 & cellOrientation <= 1) }
		}
		
		comment about StructuredSurface, StructuredCurve, StructuredPoint
		/*
		 * The structures StructuredSurface, StructuredCurve and StructuredPoint provide common, necessary redefinitions of
		 * innerSpaceDimension. They also provide single types for the StructuredSpaceObject features faces, edges and
		 * vertices, which avoids problems when these features are related by connectors with ends that have owned
		 * cross features.
		 */
		struct StructuredSurface specializes StructuredSpaceObject, Surface {
            feature redefines StructuredSpaceObject::innerSpaceDimension, Surface::innerSpaceDimension;		    
		}
        struct StructuredCurve specializes StructuredSpaceObject, Curve {
            feature redefines StructuredSpaceObject::innerSpaceDimension, Curve::innerSpaceDimension;         
        }
        struct StructuredPoint specializes StructuredSpaceObject, Point {
            feature redefines StructuredSpaceObject::innerSpaceDimension, Point::innerSpaceDimension;         
        }

		portion feature faces : StructuredSurface[0..*] ordered subsets structuredSpaceObjectCells {
		    feature redefines that : StructuredSpaceObject;
			feature redefines edges subsets that.edges;
			feature redefines vertices subsets that.vertices;
			derived feature redefines spaceBoundary; 
			inv { isEmpty(spaceBoundary) == isEmpty(union(edges, vertices)) }
			inv { notEmpty(spaceBoundary) implies contains(spaceBoundary.unionsOf, union(edges, vertices)) }
		}

		portion feature edges : StructuredCurve[0..*] ordered subsets structuredSpaceObjectCells {
            feature redefines that : StructuredSpaceObject;
			feature redefines vertices subsets that.vertices;
			derived feature redefines spaceBoundary;
			inv { isEmpty(spaceBoundary) == isEmpty(vertices) }
			inv { notEmpty(spaceBoundary) implies contains(spaceBoundary.unionsOf, vertices) }
		}

		portion feature vertices : StructuredPoint[0..*] ordered subsets structuredSpaceObjectCells;
		
		derived feature redefines innerSpaceDimension = 
			if notEmpty(faces) ? 2 else if notEmpty(edges) ? 1 else 0;
	  }
}
// ===== END: Objects.kerml =====

// ===== BEGIN: Observation.kerml =====
standard library package Observation {
	doc
	/*
	 * This package models a framework for monitoring Boolean conditions and notifying
	 * registered observers when they change from false to true.
	 */
	 
	private import ScalarValues::Boolean;
	private import Occurrences::Occurrence;
	private import Occurrences::Life;
	private import SequenceFunctions::including;
	private import SequenceFunctions::excluding;
	private import ControlFunctions::select;
	private import ControlPerformances::DecisionPerformance;
	private import ControlPerformances::IfThenPerformance;
	private import FeatureReferencingPerformances::FeatureWritePerformance;
	private import FeatureReferencingPerformances::BooleanEvaluationResultToMonitorPerformance;
	private import Transfers::TransferBefore;

    private struct DefaultMonitorLife[1] :> ChangeMonitor, Life {
        doc
        /*
         * DefaultMonitorLife is the classifier of the singleton Life of the defaultMonitor.
         */
    }
    
	feature defaultMonitor[1] : DefaultMonitorLife {
		doc
		/*
		 * defaultMonitor is a single ChangeMonitor that can be used as a default.
		 */
	}

	struct ChangeSignal {
		doc
		/*
		 * A ChangeSignal is a signal to be sent when the Boolean result of its
		 * changeCondition Expression changes from false to true.
		 */

		bool signalCondition {
			doc
			/*
			 * A BooleanExpression whose result is being monitored.
			 */
		}
		
		feature signalMonitor : ChangeMonitor {
			doc
			/*
			 * The ChangeMonitor responsible for monitoring the signalCondition.
			 */
		}
	}
	
	private behavior ObserveChange {
		doc
		/*
		 * Each Performance of ObserveChange waits for the result of the Boolean 
		 * condition of a given ChangeSignal to change from false to true, and, when 
		 * it does, sends the ChangeSignal to a given observer Occurrence.
		 */

		in feature changeObserver : Occurrence[1];
		in feature changeSignal : ChangeSignal[1];
		
		composite step wait : IfThenPerformance {
			doc
			/*
			 * If the result of the changeSignal.signalCondition is false, then wait for 
			 * it to become true.
			 */

			in bool redefines ifTest {
				not changeSignal.signalCondition()
			}
			in step redefines thenClause : BooleanEvaluationResultToMonitorPerformance {
				in bool onOccurrence = changeSignal.signalCondition;
			}
		}		
		
		succession wait then transfer;
		
	    step transfer : TransferBefore[1] 
	    	redefines outgoingTransfersFromSelf 
	    	subsets changeObserver.incomingTransfers {
	    	doc
			/*
			 * Then send changeSignal to changeObserver.
			 */
			 
	    	end feature source {
	    		feature redefines sourceOutput = changeSignal;
	    	}
	    	end feature target;
	    }
	}
	
	struct ChangeMonitor {
		doc
		/*
		 * A ChangeMonitor is a collection of ongoing ChangeSignal observations 
		 * for various observer Occurrences. It provides convenient operations for 
		 * starting and canceling the observations it manages.
		 */

		private thisMonitor : ChangeMonitor redefines self;
		private composite feature observations[0..*] : ObserveChange;
		
		private behavior AssignObservations specializes FeatureWritePerformance {
			doc
			/*
			 * Assign a replacement set of observations as those being managed by a
			 * given ChangeMonitor.
			 */

			in feature monitor : ChangeMonitor redefines onOccurrence {
				feature redefines startingAt {
					feature redefines accessedFeature, observations;
				}
			}
			inout feature redefines replacementValues[0..*] : ObserveChange;
		}
		
		step startObservation { 
			doc
			/*
			 * Start an observation of a given ChangeSignal for a given Occurrence.
			 */

			in observer : Occurrence[1]; 
			in signal : ChangeSignal[1];
			private composite step observation : ObserveChange {
				in changeObserver = observer;
				in changeSignal = signal;
			}
			private composite step addObservation : AssignObservations[1] {
				in monitor = thisMonitor; 
				inout replacementValues = observations->including(observation);	
			}
		}
		
		step cancelObservation { 
			doc
			/*
			 * Cancel all observations of a given ChangeSignal for a given Occurrence. 
			 */

			in observer : Occurrence[1]; 
			in signal : ChangeSignal[1];
			private feature observations[0..*] : ObserveChange = 
				observations->select{in observation : ObserveChange; 
					observation.changeObserver == observer and observation.changeSignal == signal
				};
			private composite step removeObservation : AssignObservations[1] {
				in monitor = thisMonitor; 
				inout replacementValues = observations->excluding(observations);
			}
		}
	}	
}
// ===== END: Observation.kerml =====

// ===== BEGIN: Occurrences.kerml =====
standard library package Occurrences {
	doc
	/*
	 * This package defines modeling constructs for anything existing or occurring in time and space, with
	 * associations between them that assert temporal and spatial relationships.
	 */

	private import Base::Anything;
	private import Base::things;
	private import Base::DataValue;
	private import ScalarValues::Natural;
	private import ScalarValues::Boolean;
	private import Links::*;
	private import Clocks::*;
	private import Collections::Set;
	private import Collections::OrderedSet;
	private import CollectionFunctions::contains;
	private import SequenceFunctions::isEmpty;
	private import SequenceFunctions::notEmpty;
	private import SequenceFunctions::includes;
	private import SequenceFunctions::union;

	abstract class Occurrence specializes Anything disjoint from DataValue {
        doc
        /*
         * Occurrence is the most general classifier of entities that have identity and
         * occur over time and space.
         *
         * The features of Occurrence specify the semantics of associations between occurrences that
         * assert complete inclusion and exclusion in time or space, or both, which includes
         * portions of an occurrence (having the same identity).  Portions include slices and shots
         * over time and space.
         */
        
		private import SequenceFunctions::*;

		feature portionOfLife: Life[1] subsets portionOf default self;

		feature self: Occurrence[1] redefines Anything::self subsets timeSlices, spaceSlices, spaceTimeCoincidentOccurrences, sameLifeOccurrences;
		feature sameLifeOccurrences: Occurrence[1..*] subsets things;

		feature this : Occurrence[1] default self {
			doc
			/*
			 * The "context" Occurrence within which this Occurrence takes place. By default, it is this
			 * Occurrence itself. However, this is overridden for ownedPerformances of Objects and
			 * subperformances of Performances.
			 */
		}
		connector :HappensDuring from [1] self to [1] this;
		
		feature localClock : Clock[1] default universalClock  {
			doc
			/*
			 * A local Clock to be used as the corresponding time reference for this Occurrence
			 * and, by default, all ownedOccurrences. By default this is the singleton universalClock.
			 */
		}
		
		composite feature suboccurrences: Occurrence[0..*] subsets occurrences {
			doc
			/*
			 * Composite suboccurrences of this Occurrence.
			 */
			 
			 feature redefines localClock default (that as Occurrence).localClock {
			 	doc
			 	/*
			 	 * The localClock of a suboccurrence defaults to the localClock of its containing
			 	 * Occurrence.
			 	 */
			 }
			 
			 feature redefines incomingTransferSort default (that as Occurrence).incomingTransferSort;
		}
		
		/* Occurrences may be suboccurrences of no more than one other occurrence. */		
		feature superoccurrence: Occurrence[0..1] subsets occurrences inverse of suboccurrences;

		feature withoutOccurrences: Occurrence[0..*] unions successors, predecessors, outsideOfOccurrences
			inverse of withoutOccurrences {
			doc
			/*
			 * Occurrences that are completely separate either in time or space or both.
			 */

			/* withoutOccurrences is irreflexive. */
			inv { (that as Occurrence) != (that.that as Occurrence) }
		}

		feature predecessors: Occurrence[0..*] subsets withoutOccurrences {
			doc
			/*
			 * Occurrences that end before this occurrence starts.
			 */
		}

		feature successors: Occurrence[0..*] subsets withoutOccurrences inverse of predecessors {
			doc
			/*
			 * Occurrences that start after this occurrence ends.
			 */

			/* successors is transitive. */
			feature earlierOccurrence: Occurrence[1] subsets that;
			feature laterOccurrence: Occurrence[1] subsets self;
			subset laterOccurrence.successors subsets earlierOccurrence.successors;
		}

		feature immediatePredecessors: Occurrence[0..*] subsets predecessors {
			doc
			/*
			 * Occurrences that end just before this occurrence starts, with no
			 * possibility of other occurrences happening in the time between them.
			 */
		}

		feature immediateSuccessors: Occurrence[0..*] subsets successors inverse of immediatePredecessors {
			doc
			/*
			 * Occurrences that start just after this occurrence ends, with no
			 * possibility of other occurrences happening in the time between them.
			 */

			disjoint earlierOccurrence.successors from laterOccurrence.predecessors;
		}

		feature timeEnclosedOccurrences: Occurrence[1..*] subsets occurrences {
			doc
			/*
			 * Occurrences that start no earlier than and end no later than
			 * this occurrence, including at least this occurrence.
			 */

			/*
			 * timeEnclosedOccurrences and successors constrain each other. All successors of
			 * (occurrences happening after) time enclosing occurrences (inverse of
			 * timeEnclosedOccurrences) are also successors of their timeEnclosedOccurrences.
			 * And predecessors of (occurrences happening before) time enclosing occurrences
			 * are predecessors of their timeEnclosedOccurrences.
			 */
			feature longerOccurrence: Occurrence[1] subsets that;
			feature shorterOccurrence: Occurrence[1] subsets self;
			subset longerOccurrence.predecessors subsets shorterOccurrence.predecessors;
			subset longerOccurrence.successors subsets shorterOccurrence.successors;

			/* timeEnclosedOccurrences is transitive. */
			subset shorterOccurrence.timeEnclosedOccurrences subsets longerOccurrence.timeEnclosedOccurrences;
		}

		feature all timeCoincidentOccurrences: Occurrence[1..*] subsets timeEnclosedOccurrences inverse of timeCoincidentOccurrences {
			doc
			/*
			 * Occurrences that start at the same time and end at the same time as this occurrence,
			 * including at least this occurrence.
			 */

			feature thatOccurrence: Occurrence[1] subsets longerOccurrence;
			feature thisOccurrence: Occurrence[1] subsets shorterOccurrence;

			/* timeCoincidentOccurrences occurrences happen during each other. */
			connector :HappensDuring
				from [1] shorterOccurrence references thisOccurrence
				to [1] longerOccurrence references thatOccurrence;

			/* timeCoincidentOccurrences is transitive */
			subset thatOccurrence.timeCoincidentOccurrences
				subsets thisOccurrence.timeCoincidentOccurrences;
		}

		feature spaceEnclosedOccurrences: Occurrence[1..*] subsets occurrences {
			doc
			/*
			 * Occurrences that this one completely includes in space (not necessarily in time),
			 * including this one.
			 */

			feature largerSpace: Occurrence[1] subsets that;
			feature smallerSpace: Occurrence[1] subsets self;

			/* spaceEnclosedOccurrences is transitive. */
			subset smallerSpace.spaceEnclosedOccurrences subsets largerSpace.spaceEnclosedOccurrences;

			/* smallerSpace are outside occurrences that are outside their largerSpace */
			subset smallerSpace.outsideOfOccurrences subsets largerSpace.outsideOfOccurrences;
		}

		feature all spaceTimeEnclosedOccurrences: Occurrence[1..*] subsets timeEnclosedOccurrences, spaceEnclosedOccurrences
			intersects timeEnclosedOccurrences, spaceEnclosedOccurrences {
			doc
			/*
			 * Occurrences that this one completely includes in both space and time,
			 * including this one.
			 */

			/* spaceTimeEnclosedOccurrences is transitive */
			subset largerSpace.spaceTimeEnclosedOccurrences subsets smallerSpace.spaceTimeEnclosedOccurrences;
		}

		feature all spaceTimeEnclosedPoints : Occurrence[1..*] subsets spaceTimeEnclosedOccurrences {
			doc
			/*
			 * All space time enclosed occurrences that take up zero time and space.
			 */

			redefines innerSpaceDimension = 0;
			binding [1] startShot = [1] endShot;
		}

		feature spaceTimeCoincidentOccurrences: Occurrence[1..*] 
			subsets timeCoincidentOccurrences, spaceEnclosedOccurrences, spaceTimeEnclosedOccurrences 
			intersects timeCoincidentOccurrences, spaceEnclosedOccurrences inverse of spaceTimeCoincidentOccurrences {
			doc
			/*
			 * Occurrences that this one completely includes in both space and time,
			 * and vice-versa, including this one.
			 */

			feature redefines thatOccurrence subsets largerSpace;
			feature redefines thisOccurrence subsets smallerSpace;

			/* spaceTimeCoincidentOccurrences occurrences are inside of each other. */
			connector :InsideOf
				from [1] largerSpace references thatOccurrence
				to [1] smallerSpace references thisOccurrence;

			/* spaceTimeCoincidentOccurrences is transitive */
			subset thatOccurrence.spaceTimeCoincidentOccurrences
				subsets thisOccurrence.spaceTimeCoincidentOccurrences;
		}

		feature outsideOfOccurrences: Occurrence[0..*] subsets withoutOccurrences inverse of outsideOfOccurrences {
			doc
			/*
			 * Occurrences that do not overlap in space (not necessarily in time, see successors).
			 */
		}

		feature justOutsideOfOccurrences: Occurrence[0..*] subsets outsideOfOccurrences inverse of justOutsideOfOccurrences {
			doc
			/*
			 * Occurrences that have no space between some of their space slices and some space slices of this occurrence.
			 */

			feature separateSpaceToo: Occurrence[1] subsets that;
			feature separateSpace: Occurrence[1] subsets self;

			connector :MatesWith [1..*]
				from [0..*] separateSpaceToo references separateSpaceToo.spaceSlices
				to [0..*] separateSpace references separateSpace.spaceSlices;
		}

		feature matingOccurrences: Occurrence[1..*] subsets justOutsideOfOccurrences inverse of matingOccurrences {
			doc
			/*
			 * Occurrences that have no space between them and this one.
			 */

			feature matingSpaceToo: Occurrence[1] subsets that;
			feature matingSpace: Occurrence[1] subsets self;
			feature matingOccurrence: Occurrence [1] {
				portion feature redefines spaceBoundary [1];
				inv { contains(unionsOf, union(matingSpaceToo, matingSpace)) }
				portion feature redefines spaceInterior [0];
			}
		}

		feature innerSpaceDimension : Natural [1] {
			doc
			/*
			 * The number of variables needed to identify space points in this occurrence, from 0
			 * to 3, without regard to higher dimensional spaces it might be embedded in.
			 */
		}

		inv { innerSpaceDimension <= 3 }

		feature outerSpaceDimension : Natural [0..1] {
			doc
			/*
			 * For occurrences of innerSpaceDimension 1 or 2, the number of variables needed to
			 * identify their space points in higher dimensions they might be embedded in, from
			 * the innerSpaceDimension to 3. An outerSpaceDimension equal to innerSpaceDimension
			 * indicates the occurrence is spatially straight (innerSpaceDimension 1 embedded in
			 * 2 or 3 dimensions) or flat (innerSpaceDimension 2 embedded in 3 dimensions).
			 */
		}
		inv { notEmpty(outerSpaceDimension) implies
			 (outerSpaceDimension >= innerSpaceDimension & outerSpaceDimension <= 3) }

		portion feature all portions: Occurrence[1..*] subsets spaceTimeEnclosedOccurrences {
			doc
			/*
			 * All spaceTimeEnclosedOccurrences that have the same portionOfLife (considered the same
			 * thing occurring).
			 */

            portion redefines portionOfLife = (that as Occurrence).portionOfLife;
		}

		feature portionOf : Occurrence[1..*] inverse of portions {
			doc
			/*
			 * Occurrences of which this occurrence is a portion, including at
			 * least this occurrence.
			 */
		}

		portion feature timeSlices: Occurrence[1..*] subsets portions {
			doc
			/*
			 * Portions of an occurrence taking up all of its space over some period of time,
			 * including at least this occurrence.
			 */
		}

		feature timeSliceOf : Occurrence[1..*] subsets portionOf inverse of timeSlices {
			doc
			/*
			 * Occurrences of which this occurrence is a time slice, including at least this
			 * occurrence.
			 */

			feature timeSliceOccurrence: Occurrence[1] subsets that;
			feature timeSlicedOccurrence: Occurrence[1] subsets self;

			/* timeSliceOf is transitive */
			subset timeSlicedOccurrence.timeSliceOf subsets timeSliceOccurrence.timeSliceOf;
		}

		portion feature all snapshots: Occurrence[1..*] subsets timeSlices {
			doc
			/*
			 * Time slices of an occurrence that happen at a single instant of time
			 * (i.e., have no duration).
			 */
			binding [1] startShot = [1] endShot;
		}
		inv { snapshots == union(startShot, union(middleTimeSlice.snapshots, endShot)) }

		feature snapshotOf : Occurrence[0..*] subsets timeSliceOf inverse of snapshots {
			doc
			/*
			 * Occurrences of which this occurrence is a snapshot.
			 */
		}

		portion feature startShot: Occurrence[1] subsets snapshots {
			doc
			/*
			 * The snapshot representing the start of the occurrence in time.
			 */
		}

		portion feature middleTimeSlice: Occurrence[0..1] subsets timeSlices {
			doc
			/*
			 * A time slice that takes all the time between the start shot and end shot. There
			 * is none when the startShot and endShot are the same.
			 */
		}
		inv { isEmpty((that as Occurrence).middleTimeSlice) == ((that as Occurrence).startShot == (that as Occurrence).endShot) }

		connector :HappensJustBefore
			from [1] earlierOccurrence references startShot
			to [0..1] laterOccurrence references middleTimeSlice {
			doc
			/*
			 * The startShot happens immediately before the middle time slice.
			 */
		}

		portion feature endShot: Occurrence[1] subsets snapshots {
			doc
			/*
			 * The snapshot at the end of the occurrence in time.
			 */

			/* suboccurrences at the end of an Occurrence must also end. */
			feature subendshot : Occurrence [0..*] chains self.suboccurrences.endShot {
				  feature superendshot : Occurrence [1] subsets that;
				  subset superendshot subsets self.timeCoincidentOccurrences; }
		}

		 connector :HappensJustBefore
			from [0..1] earlierOccurrence references middleTimeSlice
			to [1] laterOccurrence references endShot {
			doc
			/*
			 * The endShot happens after the middle time slice.
			 */
		}

		portion feature spaceSlices: Occurrence[1..*] subsets portions {
			doc
			/*
			 * Portions of this occurrence that extend for exactly the same time and some or all
			 * the space, relative to spatial location of this occurrence, including at least
			 * this occurrence.
			 */
		}

		feature spaceSliceOf: Occurrence[1..*] subsets portionOf inverse of spaceSlices {
			doc
			/*
			 * Occurrences of which this occurrence is a space slice, including at least this
			 * occurrence.
			 */

			feature spaceSliceOccurrence: Occurrence[1] subsets that;
			feature spaceSlicedOccurrence: Occurrence[1] subsets self;
			inv { spaceSliceOccurrence.innerSpaceDimension <= spaceSlicedOccurrence.innerSpaceDimension }

			/* spaceSliceOf is transitive */
			subset spaceSlicedOccurrence.spaceSliceOf subsets spaceSliceOccurrence.spaceSliceOf;
		}

		portion feature spaceShots: Occurrence[1..*] subsets spaceSlices {
			doc
			/*
			 * All spaceSlices of this occurrence that are of a lower inner space dimension than it.
			 */
		}

		feature all spaceShotOf: Occurrence[0..*] subsets spaceSliceOf inverse of spaceShots {
			doc
			/*
			 * All occurrences of which this occurrence is a space shot.
			 */

			feature spaceShotOccurrence: Occurrence[1] subsets that;
			feature spaceShottedOccurrence: Occurrence[1] subsets self;
			inv { spaceShotOccurrence.innerSpaceDimension < spaceShottedOccurrence.innerSpaceDimension }

			/* spaceShotOf is transitive */
			subset spaceShottedOccurrence.spaceShotOf subsets spaceShotOccurrence.spaceShotOf;
		}

		feature unionsOf: Set[0..*] {
			doc
			/*
			 * Sets of occurrences, where the time and space taken by all the occurrences in each
			 * set together is the same as taken by this occurrence (all four dimensional points in
			 * the occurrences of each set are at the same time and space as those of this
			 * occurrence).
			 */

			feature redefines elements: Occurrence[0..*];
			feature union: Occurrence[0..1];

			connector :Within
				  from [0..*] smallerOccurrence references elements 
				  to [1] largerOccurrence references union;
			connector :Within
				  from [0..*] smallerOccurrence references union.spaceTimeEnclosedPoints
				  to [1..*] largerOccurrence references elements;
		}
		binding  [0..1] unionsOf.union = [1] self;

		feature intersectionsOf: Set[0..*] {
			doc
			/*
			 * Sets of occurrences, where the time and space taken in common between the occurrences
			 * in each set is at the same as taken by this occurrence (all four dimensional points
			 * common to the occurrences in each set are at the same time and space as those in this
			 * occurrence).
			 */

			feature redefines elements: Occurrence[0..*] {
				feature all notIntersection: Occurrence[0..*] subsets spaceTimeEnclosedPoints;
			}
			feature intersection: Occurrence[0..1];

			connector :Within
				  from [1] smallerOccurrence references intersection
				  to [0..*] largerOccurrence references elements;
			connector :Without
				  from [0..*] separateOccurrenceToo references elements.notIntersection
				  to [1] separateOccurrence references intersection;
			connector :Without
				  from [0..*] separateOccurrenceToo references elements.notIntersection
				  to [1..*] separateOccurrence references elements;
		}
		binding [0..1] intersectionsOf.intersection = [1] self;

		feature differencesOf: OrderedSet[0..*] {
			doc
			/*
			 * Ordered sets of occurrences, where the time and space taken by first occurrence in
			 * each set that is not in the time and space taken by the remaining occurrences is the
			 * same as taken by this occurrence (all four dimensional points in the minuend that are
			 * not in any subtrahend are at the same time and space as those in this occurrence).
			 */
			feature redefines elements: Occurrence[0..*];
			feature difference: Occurrence[0..1];
			feature minuend: Occurrence [0..1] subsets elements, interdiff.elements = head(elements);
			feature subtrahend: Occurrence[*] subsets elements = tail(elements);
			feature interdiff: Set [0..1] {
				feature redefines elements: Occurrence[1..*];
				feature all notSubtrahend: Occurrence [0..*] subsets elements;
			}

			connector :Without
				  from [0..*] separateOccurrenceToo references interdiff.notSubtrahend 
				  to [1..*] separateOccurrence references subtrahend;

			inv { isEmpty(difference) == isEmpty(interdiff) }
			inv { notEmpty(difference) implies (difference.intersectionsOf == interdiff) }
		}
		binding [0..1] differencesOf.difference = [1] self;

		portion feature spaceInterior: Occurrence[0..1] subsets spaceSlices {
			doc
			/*
			 * A space slice of this occurrence that includes all its space shots except the
			 * space boundary, which must exist and be outsideOf it.  The space interior must be
			 * of the same inner space dimension as this occurrence, except if it is zero,
			 * whereupon there is no space interior.
			 */
		}

		feature spaceInteriorOf: Occurrence[0..1] subsets spaceSliceOf inverse of spaceInterior {
			doc
			/*
			 * An Occurrence of which this one is the space interior.
			 */
		}

		inv { notEmpty(spaceInterior) implies spaceInterior.innerSpaceDimension == innerSpaceDimension }

		portion feature spaceBoundary: Occurrence[0..1] subsets spaceShots {
			doc
			/*
			 * The space shot of this Occurrence that is not among those of its space interior,
			 * which must be outside it. It must not have a spaceBoundary.	It can be divided
			 * into space slices that also have no spaceBoundary, where the outer one surrounds
			 * the inner ones.
			 */

			inv { isClosed == true }

			feature spaceBounder: Occurrence [1] subsets self;

			feature outer: Occurrence [0..1] subsets spaceSlices {
				feature redefines isClosed = true;
				feature redefines innerSpaceDimension = spaceBounder.innerSpaceDimension;
			}

			feature inner: Occurrence [0..*] subsets spaceSlices {
				feature redefines isClosed = true;
				feature redefines innerSpaceDimension = spaceBounder.innerSpaceDimension;
			}

			inv { notEmpty(inner) implies notEmpty(outer) }
			inv { notEmpty(outer) implies
				contains(unionsOf, union(outer, inner)) }
		}

		feature spaceBoundaryOf: Occurrence[0..*] subsets spaceShotOf inverse of spaceBoundary {
			doc
			/*
			 * An Occurrence of which this one is the space boundary.
			 */

			feature spaceBounderOf: Occurrence subsets self;
			inv { spaceBounderOf.spaceBoundary == that.that }
		}

		inv { not isClosed implies contains((that as Occurrence).unionsOf, union(spaceBoundary, spaceInterior)) }
		inv { innerSpaceDimension == 0 implies isEmpty(spaceBoundary) }

		connector :SurroundedBy
			from [0..*] surroundedSpace references spaceInterior
			to [1] surroundingSpace references spaceBoundary.outer;

		connector :SurroundedBy
			from [0..*] surroundedSpace references spaceBoundary.inner
			to [1] surroundingSpace references spaceInterior;

		feature innerSpaceOccurrences: Occurrence [0..*] subsets outsideOfOccurrences {
			doc
			/*
			 * Occurrences that completely occupy the space surrounded by an inner space boundary of this occurrence.
			 */

			feature redefines innerSpaceOccurrences [0];

		 	/* innerSpace is the spaceInterior of hOccurrence, which is formed from an inner space boundary of outerSpace. */
			feature outerSpace: Occurrence[1] subsets that;
			feature innerSpace: Occurrence[1] subsets self;
			feature hOccurrence: Occurrence [1];
			connector hbi: WithinBoth [0..1] from [0..1] hOccurrence.spaceBoundary to [0..1] outerSpace.spaceBoundary.inner;
			connector hbo: WithinBoth [0..1] from [0..1] hOccurrence.spaceBoundary to [0..1] outerSpace;
			connector :WithinBoth from [1] hOccurrence.spaceInterior to [1] innerSpace;
			inv { (isEmpty(hbi) == notEmpty(hbo)) & (notEmpty(hbo) == outerSpace.isClosed) }
		}

		feature surroundedByOccurrences: Occurrence [0..*] subsets outsideOfOccurrences {
			doc
			/*
			 * Occurrences that have inner spaces that completely include this occurrence.
			 */

			feature surroundedSpace: Occurrence [1] subsets that;
			feature surroundingSpace: Occurrence [1] subsets self;

			connector :InsideOf
				from [0..1] smallerOccurrence references surroundedSpace
				to [1..*] largerOccurrence references surroundingSpace.innerSpaceOccurrences;
		}

		feature isClosed : Boolean [1] {
			doc
			/*
			 * Tells whether an occurrence has a spaceBoundary, true if it does, false otherwise.
			 */
		}
		inv { isClosed == isEmpty((that as Occurrence).spaceBoundary) }

		var feature incomingTransfers: Transfers::Transfer[0..*] subsets Transfers::transfers {
			doc
			/*
			 * The incoming transfers received by this occurrence.
			 */

			end feature redefines source;
			end feature redefines target;
		}
		
		feature isDispatch : Boolean[1] default false {
			doc
			/*
			 * Determines whether transfers to the dispatch scope might be accepted more than once.
			 */
		}
 		feature dispatchScope: Occurrence [1] default self;
 		connector :HappensDuring from [1] self to [1] dispatchScope;
 		
 		feature isRunToCompletion: Boolean [1] default true {
			doc
			/*
			 * Determines whether transition performances might happen during state entry performances
			 * within the run to completion scope.
			 */
		}
		feature runToCompletionScope: Occurrence [1] default self;
		connector :HappensDuring from [1] self to [1] runToCompletionScope;
 
 		feature incomingTransferSort : IncomingTransferSort [0..*] default earlierFirstIncomingTransferSort {
			doc
			/*
			 * Determines which transfer to accept when multiple are available and which of the unaccepted 
			 * transfers are never to be accepted (dispatched).
			 */
		}

		var feature all incomingTransfersToSelf subsets incomingTransfers {
			doc
			/*
			 * The incoming transfers with this occurrence as the target.
			 */

			end feature redefines source;
			end feature redefines target = that;
		}

		var feature outgoingTransfers: Transfers::Transfer[0..*] subsets Transfers::transfers {
			doc
			/*
			 * The outgoing transfers sent from this occurrence.
			 */

			end feature redefines source;
			end feature redefines target;
		}

		var feature all outgoingTransfersFromSelf subsets outgoingTransfers {
			doc
			/*
			 * The outgoing transfers with this occurrence as the source.
			 */

			end feature redefines source = that;
			end feature redefines target;
		}
	}

	abstract class all Life specializes Occurrence {
		binding portionOf = self {
			doc
			/*
			 * Lives are only portions of themselves.
			 */
			}
	}

	abstract feature occurrences: Occurrence[0..*] nonunique subsets things;
	
	predicate IncomingTransferSort specializes Performances::BooleanEvaluation {    
		in t1: Transfers::Transfer [1];
		in t2: Transfers::Transfer [1];  
		return t1First: Boolean [1]; 
	}

	bool earlierFirstIncomingTransferSort : IncomingTransferSort {
		return t1First = includes(t1.endShot.successors, t2.endShot);
	}

	assoc all SelfSameLifeLink specializes BinaryLink {
		doc
		/*
		 * SelfSameLifeLink is a binary association that is equivalent to SelfLink if the
		 * linked things are DataValues, but asserts that the linked things are portions of
		 * the same Life if they are Occurrences. 
		 */

		end myselfSameLives [1..*] feature myselfSameLife: Anything redefines source;
		end selfSameLives [1..*] feature selfSameLife: Anything redefines target;

		feature all sourceOccurrence : Occurrence [0..1] subsets myselfSameLife;
		feature all targetOccurrence : Occurrence [0..1] subsets selfSameLife, sourceOccurrence.sameLifeOccurrences;
		binding oSelf of sourceOccurrence.portionOfLife = targetOccurrence.portionOfLife;

		feature all sourceDataValue : DataValue [0..1] subsets myselfSameLife;
		feature all targetDataValue : DataValue [0..1] subsets selfSameLife;
		binding dSelf of sourceDataValue = targetDataValue;
	}

	subclassifier SelfLink specializes SelfSameLifeLink;

	assoc HappensLink specializes BinaryLink disjoint from Occurrence {
		doc
		/*
		 * HappensLink is the most general associations that assert temporal relationships between a
		 * sourceOccurrence and a targetOccurrence. Because HappensLinks assert temporal
		 * relationships, they cannot also be Occurrences that happen in time.  Therefore
		 * HappensLink is disjoint with LinkObject, that is, no HappensLink can also be a
		 * LinkObject.
		 */
		
		end feature sourceOccurrence: Occurrence redefines BinaryLink::source;
		end feature targetOccurrence: Occurrence redefines BinaryLink::target;
	}

	assoc all HappensDuring specializes HappensLink {
		doc
		/*
		 * HappensDuring asserts that the shorterOccurrence happens during the longerOccurrence.
		 * That is, the time interval of the shorterOccurrence is completely within that of the
		 * longerOccurrence, or every snapshot of the shorterOccurrence happens while (at the
		 * same time as) some snapshot of the longerOccurrence. Note that this means every
		 * Occurrence HappensDuring itself and that HappensDuring is transitive.
		 */
		
		end feature shorterOccurrence: Occurrence redefines sourceOccurrence crosses longerOccurrence.timeEnclosedOccurrences;
		end happensDuring [1..*] feature longerOccurrence: Occurrence redefines targetOccurrence;
	}

	assoc all HappensWhile specializes HappensDuring {
		doc
		/*
		 * HappensWhile asserts that two occurrences happen during each other, that is, they
		 * each start at the same time and end at the same time.
		 */

		end feature thisOccurrence: Occurrence redefines shorterOccurrence crosses thatOccurrence.timeCoincidentOccurrences;
		end happensWhile [1..*] subsets timeCoincidentOccurrences feature thatOccurrence: Occurrence redefines longerOccurrence;
	}
	
	assoc SpaceLink specializes BinaryLink disjoint from Occurrence {
        doc
        /*
         * SpaceLink is the most general association that asserts spatial relationships between a
         * sourceOccurrence and a targetOccurrence. Because SpaceLinks assert spatial
         * relationships, they cannot also be Occurrences that happen in space.  Therefore
         * SpaceLink is disjoint with LinkObject, that is, no SpaceLink can also be a
         * LinkObject.
         */
      
        end feature sourceOccurrence: Occurrence redefines BinaryLink::source;
        end feature targetOccurrence: Occurrence redefines BinaryLink::target;
    }

	assoc all InsideOf specializes SpaceLink {
		doc
		/*
		 * InsideOf asserts that its largerSpace completely overlaps its smallerSpace in space (not
		 * necessarily in time, see HappensDuring). That is, all four dimensional points of the
		 * smallerSpace are in the spatial extent of the largerSpace. Note that this means every
		 * Occurrence is InsideOf itself and that InsideOf is transitive.
		 */

		end feature smallerSpace: Occurrence redefines source crosses largerSpace.spaceEnclosedOccurrences;
		end insideOf [1..*] feature largerSpace: Occurrence redefines target;
	}

	assoc all Within specializes HappensDuring, InsideOf intersects HappensDuring, InsideOf {
		doc
		/*
		 * Within asserts that its largerOccurrence completely overlaps its smallerOccurrence in
		 * time and space. That is, all four dimensional points of the smallerOccurrence happen
		 * during and are included in the space of the largerOccurrence. This means every occurrence
		 * is Within itself and Within is transitive.
		 */

		end feature smallerOccurrence: Occurrence redefines shorterOccurrence, smallerSpace
		  crosses largerOccurrence.spaceTimeEnclosedOccurrences;
		end within [1..*] feature largerOccurrence: Occurrence redefines longerOccurrence, largerSpace;
	 }

	assoc all WithinBoth specializes Within, HappensWhile {
		doc
		/*
		 * WithinBoth asserts that two occurrences are Within each other, that is, they occupy the
		 * same four dimensional region.  Note that this means every Occurrence is WithinBoth with
		 * itself and transitive.
		 */ 

		end feature thisOccurrence redefines smallerOccurrence, HappensWhile::thisOccurrence
		  crosses thatOccurrence.spaceTimeCoincidentOccurrences;
		end withinBoth subsets spaceTimeCoincidentOccurrences feature thatOccurrence redefines largerOccurrence, HappensWhile::thatOccurrence;
	}

	assoc all PortionOf specializes Within {
		doc
		/*
		 * PortionOf asserts one occurrence is a portion of another, including at least itself.
		 */

		end feature portionOccurrence: Occurrence redefines smallerOccurrence crosses portionedOccurrence.portions;
		end portionWithin subsets portionOf feature portionedOccurrence: Occurrence redefines largerOccurrence;
	}

	assoc all TimeSliceOf specializes PortionOf {
		doc
		/*
		 * TimeSliceOf asserts one occurrence is a time slice of another, including at least itself.
		 */

		end feature timeSliceOccurrence: Occurrence redefines portionOccurrence crosses timeSlicedOccurrence.timeSlices;
		end timeSliceWithin subsets timeSliceOf feature timeSlicedOccurrence: Occurrence redefines portionedOccurrence;
	}

	assoc all SnapshotOf specializes TimeSliceOf {
		doc
		/*
		 * SnapshotsOf asserts one occurrence is a snapshot of another.
		 */

		end feature snapshotOccurrence: Occurrence redefines timeSliceOccurrence crosses snapshottedOccurrence.snapshots;
		end snapshotWithin subsets snapshotOf feature snapshottedOccurrence: Occurrence redefines timeSlicedOccurrence;
	}

	assoc all SpaceSliceOf specializes PortionOf {
		doc
		/*
		 * SpaceSliceOf asserts that its spaceSliceOccurrence extends for exactly the same time and
		 * some or all the space of the spaceSlicedOccurrence and that the spaceSliceOccurrence is
		 * of the same of lower innerSpaceDimension than the spaceSliceOccurrence.  Note that this
		 * means every occurrence is a SpaceSliceOf itself and SpaceSliceOf is transitive.
		 */

		end feature spaceSliceOccurrence: Occurrence redefines portionOccurrence crosses spaceSlicedOccurrence.spaceSlices;
		end spaceSliceWithin subsets spaceSliceOf feature spaceSlicedOccurrence: Occurrence redefines portionedOccurrence;
	}

	assoc all SpaceShotOf specializes SpaceSliceOf {
		doc
		/*
		 * SpaceShotOf asserts that its spaceShotOccurrence is of a lower inner space dimension than
		 * it spaceShottedOccurrence.
		 */

		end feature spaceShotOccurrence: Occurrence redefines spaceSliceOccurrence crosses spaceShottedOccurrence.spaceShots;
		end spaceShotWithin subsets spaceSliceOf feature spaceShottedOccurrence: Occurrence redefines spaceSlicedOccurrence;
	}

	assoc all Without specializes BinaryLink unions HappensBefore, OutsideOf {
		doc
		/*
		 * Without is the most general association that asserts complete separation (no overlap) in
		 * either space or time, or both, between two occurrences.  That is, no four dimensional
		 * points are in both occurrences. Note that this means no Occurrence is Without itself.
		 */

		end feature separateOccurrenceToo: Occurrence redefines BinaryLink::source
		  crosses separateOccurrence.withoutOccurrences;
		end feature separateOccurrence: Occurrence redefines BinaryLink::target
		  crosses separateOccurrenceToo.withoutOccurrences;
	}

	assoc all HappensBefore specializes HappensLink, Without {
		doc
		/*
		 * HappensBefore asserts that the earlierOccurrence is completely separated in time (not
		 * necessarily in space, see OutsideOf), with the earlierOccurrence happening completely
		 * before the laterOccurrence.	That is, no snapshot of the earlierOccurrence happens at the
		 * same time as any snapshot of the laterOccurrence, with all snapshots of earlierOccurrence
		 * happening before those the laterOccurrence, including the endShot of the earlierOccurrence
		 * and startShot of the laterOccurrence. Note that this means no Occurrence HappensBefore
		 * itself.
		 */

		end feature earlierOccurrence: Occurrence redefines sourceOccurrence, separateOccurrenceToo 
			crosses laterOccurrence.predecessors;
		end feature laterOccurrence: Occurrence redefines targetOccurrence, separateOccurrence 
			crosses earlierOccurrence.successors;
	}

	assoc all HappensJustBefore specializes HappensBefore {
		doc
		/*
		 * HappensJustBefore is HappensBefore asserting that there is no possibility of another
		 * occurrences happening in the time between the earlierOccurrence and laterOccurrence.
		 */

		end feature redefines earlierOccurrence: Occurrence crosses laterOccurrence.immediatePredecessors;
		end feature redefines laterOccurrence: Occurrence crosses earlierOccurrence.immediateSuccessors;
	}

	feature all happensBeforeLinks: HappensBefore[0..*] nonunique subsets binaryLinks {
		doc
		/*
		 * happensBeforeLinks is a specialization of binaryLinks restricted to type HappensBefore.
		 * It is the default subsetting for succession connectors.
		 */

		end feature earlierOccurrence: Occurrence redefines HappensBefore::earlierOccurrence, binaryLinks::source;
		end feature laterOccurrence: Occurrence redefines HappensBefore::laterOccurrence, binaryLinks::target;
	 }

	assoc all OutsideOf specializes SpaceLink, Without {
		doc
		/*
		 * OutsideOf asserts that two occurrences do not overlap in space (not necessarily in time,
		 * see HappensBefore).	That is, no four dimensional points of the occurrences are in the
		 * spatial extent of both of them. This means no Occurrence is OutsideOf itself.
		 */

		end feature separateSpaceToo: Occurrence redefines sourceOccurrence, separateOccurrenceToo
			crosses separateSpace.outsideOfOccurrences;
		end feature separateSpace: Occurrence redefines targetOccurrence, separateOccurrence
			crosses separateSpaceToo.outsideOfOccurrences;
	}

	assoc all JustOutsideOf specializes OutsideOf {
		doc
		/*
		 * JustOutsideOf is an OutsideOf asserting that two occurrences have some space slices with
		 * no space between them.
		 */

		end feature redefines separateSpaceToo: Occurrence
			crosses separateSpace.justOutsideOfOccurrences;
		end feature redefines separateSpace: Occurrence
		  crosses separateSpaceToo.justOutsideOfOccurrences;
	}

	assoc all MatesWith specializes JustOutsideOf {
		doc
		/*
		 * MatesWith is an OutsideOf asserting that two occurrences have no space between them.
		 */

		end feature matingSpaceToo: Occurrence redefines separateSpaceToo
		  crosses matingSpace.matingOccurrences;
		end feature matingSpace: Occurrence redefines separateSpace
		  crosses matingSpaceToo.matingOccurrences;
	}

	assoc all InnerSpaceOf specializes OutsideOf {
		doc
		/*
		 * InnerSpaceOf is an OutsideOf asserting that the space surrounded by an inner space boundary
		 * of one occurrence (outer space) is completely occupied by another occurrence (inner space).
		 */

		end feature outerSpace: Occurrence redefines separateSpaceToo;
		end feature innerSpace: Occurrence redefines separateSpace crosses outerSpace.innerSpaceOccurrences;
	}

	assoc all SurroundedBy specializes OutsideOf {
		doc
		/*
		 * SurroundedBy is an OutsideOf asserting that one occurrence (surrounded space) is included
		 * in space by an inner space occurrence of another (surrounding space).
		 */

		end feature surroundedSpace: Occurrence redefines separateSpaceToo;
		end feature surroundingSpace: Occurrence redefines separateSpace crosses surroundedSpace.surroundedByOccurrences;
	}
}
// ===== END: Occurrences.kerml =====

// ===== BEGIN: Performances.kerml =====
standard library package Performances {
	doc
	/*
	 * This package defines classifiers and features that related to the typing of performances and evaluations.
	 */

	private import Base::Anything;
	private import Base::things;
	private import Occurrences::Occurrence;
	private import Occurrences::occurrences;
	private import Occurrences::HappensDuring;
	private import Objects::Object;
	private import Links::BinaryLink;
	private import Metaobjects::Metaobject;
	private import Transfers::Transfer;
	private import Transfers::transfers;
	private import Transfers::TransferBefore;
	private import Transfers::transfersBefore;
	private import ScalarValues::*;
	private import SequenceFunctions::includes;
	
	abstract behavior Performance specializes Occurrence disjoint from Object {
		doc
		/*
		 * Performance is the most general class of behavioral Occurrences that may be performed over time.
		 */

		feature self: Performance redefines Occurrence::self;
		
		feature involvedObjects: Object[0..*] {
			doc
			/*
			 * Objects that are involved in this Performance.
			 */
		}
		
		feature performers: Object[0..*] subsets involvedObjects {
			doc
			/*
			 * Objects that enact this Performance.
			 */
		}
		
		feature redefines isDispatch default true;
  		feature redefines dispatchScope default thisPerformance;
  		
		step enclosedPerformances: Performance[0..*] subsets performances, timeEnclosedOccurrences
			intersects performances, timeEnclosedOccurrences {
			doc
			/*
			 * timeEnclosedOccurrences of this Performance that are also Performances.
			 */
		}
		
		feature thisPerformance: Performance [1] default self {
			doc
			/*
			 * Defaults to the root of the subperformance composition tree.
			 */
		}
		connector :HappensDuring from [1] self to [1] thisPerformance; 
		
		composite step subperformances: Performance[0..*] subsets enclosedPerformances, suboccurrences
			intersects enclosedPerformances, suboccurrences {
			doc
			/*
			 * enclosedPerformances that are composite. 
			 */
		
			feature redefines this default (that as Performance).this {
				doc
				/*
				 * The default "this" context of a subperformance is the same as that of its owning Performance.
				 * This means that the context for any Performance that is in a composition tree rooted
				 * in a Performance that is not itself owned by an Object is the root Performance. If the
				 * root Performance is an ownedPerformance of an Object, then that Object is the context.
				 */
			}
		
			feature redefines thisPerformance default (that as Performance).thisPerformance;
		}		
	}
	
	abstract function Evaluation specializes Performance {
		doc
		/*
		 * Evaluation is the most general class of functions that may be evaluated to compute
		 * a result.
		 */
	 
		return result: Anything[0..*] nonunique;
	}
	
	abstract predicate BooleanEvaluation specializes Evaluation {
		doc
		/*
		 * BooleanEvaluation is a specialization of Evaluation that is the most general class of
		 * Predicates that may be evaluated to produce a Boolean truth value.
		 */
	 
		return : Boolean[1];
	}
	
	abstract function MetadataAccessEvaluation specializes Evaluation {
		doc
		/*
		 * MetadataAccessEvaluation is a specialization of Evaluation for the case of MetadataAccessExpressions.
		 */
		
		return : Metaobject[1..*];
	}
	
	abstract function LiteralEvaluation specializes Evaluation {
		doc
		/*
		 * LiteralEvaluation is a specialization of Evaluation for the case of LiteralExpressions.
		 */
	 
		return : ScalarValue[1];
	}
	
	abstract predicate LiteralBooleanEvaluation specializes LiteralEvaluation, BooleanEvaluation
		intersects LiteralEvaluation, BooleanEvaluation {
		doc
		/*
		 * LiteralBooleanEvaluation is a specialization of LiteralEvaluation for the case of LiteralBooleans.
		 * It is also a predicate and thus a specialization of BooleanEvaluation. 
		 */
	 
		return : Boolean[1];
	}
	abstract function LiteralIntegerEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralIntegerEvaluation is a specialization of LiteralEvaluation for the case of LiteralIntegers.
		 */
	 
		return : Integer[1];
	}

	abstract function LiteralRationalEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralRationalEvaluation is a specialization of LiteralEvaluation for the case of LiteralRationals.
		 * (Note: Return type is Real to allow easy type conformance of LiteralRationals when a Real result is expected.)
		 */
	 
		return : Real[1];
	}
	
	abstract function LiteralStringEvaluation specializes LiteralEvaluation {
		doc
		/*
		 * LiteralStringEvaluation is a specialization of LiteralEvaluation for the case of LiteralStrings.
		 */
	 
		return : String[1];
	}
	
	function NullEvaluation specializes Evaluation {
		doc
		/*
		 * NullEvaluation is a specialization of Evaluation for the case of NullExpressions.
		 */
	 
		return : Anything[0..0];
	}

	assoc all InvolvedIn specializes BinaryLink { 
		doc
		/*
		 * InvolvedIn asserts that the involvedObject is involved in the Behavior carried out by the 
		 * involvingPerformance.
		 */
		 
		end feature involvedObject: Object redefines source crosses involvingPerformance.involvedObjects;
		end feature involvingPerformance: Performance redefines target crosses involvedObject.involvingPerformances;
	}
	
	assoc all Performs specializes InvolvedIn {
		doc
		/*
		 * Performs asserts that the performer enacts the Behavior carried out by the performance.
		 */
	
	 	end feature performerObject: Object redefines involvedObject crosses performance.performers;
	 	end feature performance: Performance redefines involvingPerformance crosses performerObject.enactedPerformances;
	 }

	abstract step performances: Performance[0..*] nonunique subsets occurrences {
		doc
		/*
		 * performances is the most general feature for performances of Behaviors.
		 */
	}
	
	abstract expr evaluations: Evaluation[0..*] nonunique subsets performances {
		doc
		/*
		 * evaluations is a specialization of performances for evaluations of Functions.
		 */
	}
	
	abstract expr constructorEvaluations [0..*] nonunique subsets evaluations  {
	    doc
	    /*
	     * constructorEvaluations is a specialization of evaluations that restricts the multiplicity 
	     * of its result parameter to 1..1, requiring a constructorEvaluation to result in a single value.
	     */
	     
	     return result [1..1];
	}
	
	abstract expr booleanEvaluations: BooleanEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * booleanEvaluations is a specialization of evaluations restricted to type BooleanEvaluation.
		 */
	}
	
	abstract expr trueEvaluations subsets booleanEvaluations {
		doc
		/*
		 * trueEvaluations is a subset of booleanEvaluations that result in true. It is the most general
		 * feature of invariants that are not negated. 
		 */
	
		private feature trueValue = true;
		binding result = trueValue;
	}
	
	abstract expr falseEvaluations subsets booleanEvaluations {
		doc
		/*
		 * falseEvaluations is a subset of booleanEvaluations that result in false. It is the most general
		 * feature of invariants that are negated.
		 */
	
        private feature falseValue = false;
        binding result = falseValue;
	}
	
	abstract expr metadataAccessEvaluations: MetadataAccessEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * metadataAccessEvaluations is a specialization of evaluations restricted to type MetadataAccessEvaluation. 
		 */
	}
	
	abstract expr literalEvaluations: LiteralEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * literalEvaluations is a specialization of evaluations restricted to type LiteralEvaluation.
		 */
	}
	
	abstract expr literalBooleanEvaluations: LiteralBooleanEvaluation[0..*] nonunique subsets literalEvaluations, booleanEvaluations
		intersects literalEvaluations, booleanEvaluations {
		doc
		/*
		 * literaBooleanlEvaluations is a specialization of literalEvaluations and booleanEvaluations restricted 
		 * to type LiteralBooleanEvaluation.
		 */
	}
	
	abstract expr literalIntegerEvaluations: LiteralIntegerEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalEvaluations is a specialization of evaluations restricted to type LiteralEvaluation.
		 */
	}
	
	abstract expr literalRationalEvaluations: LiteralRationalEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalRationalEvaluations is a specialization of literalEvaluations restricted to type LiteralRationalEvaluation.
		 */
	}
	
	abstract expr literalStringEvaluations: LiteralStringEvaluation[0..*] nonunique subsets literalEvaluations {
		doc
		/*
		 * literalStringEvaluations is a specialization of literalEvaluations restricted to type LiteralStringEvaluation.
		 */
	}
	
	abstract expr nullEvaluations: NullEvaluation[0..*] nonunique subsets evaluations {
		doc
		/*
		 * nullEvaluations is a specialization of evaluations restricted to type NullEvaluation.
		 */
	}
}
// ===== END: Performances.kerml =====

// ===== BEGIN: SpatialFrames.kerml =====
standard library package SpatialFrames {
    doc
    /*
     * This package models spatial frames of reference for quantifying the position of points 
     * in a three-dimensional space. 
     */

    private import Clocks::*;
    private import ScalarValues::NumericalValue;
    private import VectorValues::ThreeVectorValue;
    private import VectorValues::CartesianThreeVectorValue;
    private import VectorFunctions::isZeroVector;
    private import Occurrences::Life;
    private import Objects::Body;
    private import Objects::Point;
    private import ControlFunctions::forAll;
    private import SequenceFunctions::includes;
    
    private struct DefaultFrameLife[1] :> SpatialFrame, Life {
        doc
        /*
         * DefaultFrameLife is the classifier of the singleton Life of the defaultFrame.
         */
    }
    
    feature defaultFrame : DefaultFrameLife[1] {
        doc
        /*
         * defaultFrame is a fixed SpatialFrame used as a universal default.
         */
    }
    
    abstract struct SpatialFrame specializes Body {
        doc
        /*
         * A SpatialFrame is a three-dimensional Body that provides a spatial extent that 
         * acts as a frame of reference for defining the physical position and displacement 
         * vectors of Points over time.
         */
    }
    
    abstract function PositionOf {
        doc
        /*
         * The PositionOf a Point relative to a SpatialFrame, at a specific time relative to a given
         * Clock, as a positionVector that is a ThreeVectorValue.
         */
    
        in point : Point[1];
        in time : NumericalValue[1];
        in frame : SpatialFrame[1] default defaultFrame;
        in clock : Clock[1] default frame.localClock;
        return positionVector : ThreeVectorValue[1];
        
        inv positionTimePrecondition {
            doc
            /*
             * The given point must exist at the given time.
             */
        
            TimeOf(point.startShot) <= time and
            time <= TimeOf(point.endShot)
        }
        
        inv spacePositionConstraint {
            doc
            /*
             * The result positionVector is equal to the PositionOf the Point spaceShot of the
             * frame that encloses the given point, at the given time.
             */
        
            (frame.spaceShots as Point)->forAll{in p : Point;
                p.spaceTimeEnclosedOccurrences->includes(point) implies
                    positionVector == PositionOf(p, time, frame)
            }
        }
    }
    
    abstract function CurrentPositionOf {
        doc
        /*
         * The CurrentPositionOf a Point relative to a SpatialFrame and a Clock is the PositionOf
         * the Point relative to the SpatialFrame at the currentTime of the Clock.
         */
    
        in point : Point[1];
        in frame : SpatialFrame[1] default defaultFrame;
        in clock : Clock[1] default frame.localClock;
        return positionVector : ThreeVectorValue[1] =
            PositionOf(point, clock.currentTime, frame, clock);
    }
        
    function DisplacementOf {
        doc
        /*
         * The DisplacementOf two Points relative to a SpatialFrame, at a specific time relative to a
         * given Clock, is the displacementVector computed as the difference between the PositionOf the 
         * first Point and PositionOf the second Point, relative to that SpatialFrame, at that time.
         */
    
        in point1 : Point[1];
        in point2 : Point[1];
        in time : NumericalValue;
        in frame : SpatialFrame[1] default defaultFrame;
        in clock : Clock[1] default frame.localClock;
        return displacementVector : ThreeVectorValue[1] =
            PositionOf(point2, time, frame, clock) - PositionOf(point1, time, frame, clock);
            
        inv zeroDisplacementConstraint {
        doc
        /*
         * If either point1 or point2 occurs within the other, then the displacementVector is
         * the zero vector.
         */
        
            (point1.spaceTimeEnclosedOccurrences->includes(point2) or
            point2.spaceTimeEnclosedOccurrences->includes(point1)) implies
                isZeroVector(displacementVector)
        }
    }
    
    function CurrentDisplacementOf {
        doc
        /*
         * The CurrentDisplacementOf two Points relative to a SpatialFrame and Clock is the DisplacementOf
         * the Points relative to the SpatialFrame at the currentTime of the Clock.
         */
    
        in point1 : Point[1];
        in point2 : Point[1];
        in frame : SpatialFrame[1] default defaultFrame;
        in clock : Clock[1] default frame.localClock;
        return displacementVector : ThreeVectorValue[1] =
            DisplacementOf(point1, point2, clock.currentTime, frame, clock);
    }
    
    abstract struct CartesianSpatialFrame :> SpatialFrame {
        doc
        /*
         * A CartesianSpatialFrame is a SpatialFrame relative to which all position and displacement
         * vectors can be represented as CartesianThreeVectorValues.
         */
    }
    
    abstract function CartesianPositionOf :> PositionOf {
        doc
        /*
         * The PositionOf a Point relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
         */
    
        in point : Point[1];
        in time : NumericalValue[1];
        in frame : CartesianSpatialFrame[1];
        in clock : Clock[1] default frame.localClock;
        return positionVector : CartesianThreeVectorValue[1];
    }
    
    abstract function CartesianCurrentPositionOf :> CurrentPositionOf {
        doc
        /*
         * The CurrentPositionOf a Point relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
         */
    
        in point : Point[1];
        in frame : CartesianSpatialFrame[1];
        in clock : Clock[1] default frame.localClock;
        return positionVector : CartesianThreeVectorValue[1];
    }
    
    function CartesianDisplacementOf :> DisplacementOf {
        doc
        /*
         * The DisplacementOf two Points relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
         */
    
        in point1 : Point[1];
        in point2 : Point[1];
        in time : NumericalValue[1];
        in frame : CartesianSpatialFrame[1];
        in clock : Clock[1] default frame.localClock;
        return displacementVector : CartesianThreeVectorValue[1];
    }
        
    function CartesianCurrentDisplacementOf :> CurrentDisplacementOf {
        doc
        /*
         * The CurrentDisplacementOf two Points relative to a CartesianSpatialFrame is a CartesianThreeVectorValue.
         */
    
        in point1 : Point[1];
        in point2 : Point[1];
        in frame : CartesianSpatialFrame[1];
        in clock : Clock[1] default frame.localClock;
        return displacementVector : CartesianThreeVectorValue[1];
    }

}
// ===== END: SpatialFrames.kerml =====

// ===== BEGIN: StatePerformances.kerml =====
standard library package StatePerformances {
	doc
	/*
	 * This package contains a library model of the semantics of state-based behavior,
	 * including the performance of (behavioral) states and the transitions between them.
	 */

	private import ScalarValues::Boolean;
	private import ScalarValues::Natural;
	private import TransitionPerformances::TransitionPerformance;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensDuring;
	private import Transfers::Transfer;
	private import Transfers::MessageTransfer;
	private import Performances::Performance;
	private import ControlPerformances::DecisionPerformance;
	private import ControlFunctions::forAll;
	private import ControlFunctions::select;
	private import ControlFunctions::collect;
	private import SequenceFunctions::*;
	
	behavior StatePerformance specializes DecisionPerformance {
		feature isTriggerDuring: Boolean default true;

		abstract step middle[1..*] {
			doc
			/*
			 * All modeler-defined steps must subset this.
			 */
		}
		
		/* 
		 * Note: All steps are implicitly considered to be enclosedPerformances,
		 * and hence happening during the state performance.
		 */
		
		step entry[1];
		step do[1] subsets middle;
		step exit[1];
		
		step nonDoMiddle[*] subsets middle = middle->excluding(do);

		private succession [1] entry then [*] middle;
		private succession [1] do.startShot then [*] nonDoMiddle.startShot;
		private succession [*] middle then [1] exit;


		feature incomingTransitionTrigger : MessageTransfer [0..1] default null {
			doc
			/*
			 * Transfer that triggered a transition into this state performance. 
			 */
		}

		private inv { isEmpty(accepted) == isEmpty(acceptable) }
		feature accepted: Transfer[0..1] subsets acceptable {
			doc
			/* A transfer to the trigger target of an outgoing transition performance
			 * for an outgoing successon that is taken for this state occurrence.
			 */
		}
		feature deferrable: Transfer[0..*] subsets acceptable {
			doc
			/* Transfers to trigger targets of outgoing transition performances can be
			 * considered for acceptance more than once.
			 */
		}
		abstract feature acceptable: Transfer[*] {
			doc
			/*
			 * Transfers that might be accepted. 
			 */
			feature thatSP : StatePerformance [1] = that as StatePerformance;
			feature accableT : Transfer redefines self;
			feature accT : Transfer = thatSP.accepted;
			inv { accableT == accT | incomingTransferSort(accT, accableT) }  
			inv { isDispatch implies
				     allSubstatePerformances(dispatchScope)->forAll{in oSP : StatePerformance;						
						  oSP == thatSP | isEmpty(oSP.accepted) |
	   					  includes(thatSP.exit.startShot.successors, oSP.exit.startShot) |
						  ( oSP.accepted != accableT & 
							( incomingTransferSort(oSP.accepted, accableT) |
							  includes(oSP.deferrable, accableT) ) ) } }
		}
		
		function allSubstatePerformances {
			in p : Performance [1];
			feature substatePerformances: StatePerformance [*] =
				p.subperformances->select{in subp:Performance; subp istype StatePerformance};
			return  : StatePerformance [*] =
				union(substatePerformances,  
					  substatePerformances->collect{in sp:StatePerformance; allSubstatePerformances(sp) } );
		}
		
		private succession [*] acceptable then [1] exit;
		
		feature redefines isRunToCompletion default this.isRunToCompletion;
		feature redefines runToCompletionScope default this.runToCompletionScope; 
		inv { isRunToCompletion implies
			     allSubtransitionPerformances(runToCompletionScope)->forAll{in tp : TransitionPerformance;
				    includes(tp.successors, entry) | includes(tp.predecessors, entry) }
		}
		
		function allSubtransitionPerformances {
			in p : Performance [1];
			feature subtransitionPerformances: TransitionPerformance [*] =
	 			 p.subperformances->select{in subp:Performance;
		 			   subp istype StateTransitionPerformance };
			return  : TransitionPerformance [*] =
				union(subtransitionPerformances,  
		      		subtransitionPerformances->collect{in sp:TransitionPerformance; 
							 		allSubtransitionPerformances(sp) } ); 
 		}
	}
	
	behavior StateTransitionPerformance specializes TransitionPerformance {
		feature isTriggerDuring: Boolean[1];
		inv { not transitionLinkSource.isTriggerDuring | isTriggerDuring  }

		in feature transitionLinkSource: StatePerformance redefines TransitionPerformance::transitionLinkSource {
			feature redefines accepted;
			feature redefines StatePerformance::acceptable;
		}
		private succession [*] transitionLinkSource.nonDoMiddle then [1] Performance::self;

		private feature transitionLinkTarget [0..1] : Occurrence = transitionLink.laterOccurrence {
			inv { (that istype StatePerformance) implies
			      (that as StatePerformance).incomingTransitionTrigger == trigger }
		}
		
		feature acceptable: Transfer [*] subsets transitionLinkSource.acceptable, triggerTarget.incomingTransfersToSelf;

		feature trigger redefines TransitionPerformance::trigger subsets acceptable, transitionLinkSource.accepted {
			feature redefines endShot;
		}
		
		private feature tdNum: Natural [1] = if not isTriggerDuring ? 0 else size(trigger);
		private connector linkTriggerDuring: HappensDuring[tdNum] from [*] trigger.endShot to [0..1] transitionLinkSource;
		
		private succession all [*] acceptable then [*] guard;
		private succession [*] guard then [1] transitionLinkSource.exit;

		private succession [accNum] accept then [1] transitionLinkSource.exit;
	}
}
// ===== END: StatePerformances.kerml =====

// ===== BEGIN: Transfers.kerml =====
standard library package Transfers {
    doc
    /*
     * This package defines the transfer interactions used to type flows.
     */

    private import Base::Anything;
    private import Occurrences::*;
    private import Links::*;
    private import Objects::BinaryLinkObject;
    private import Performances::Performance;
    private import Performances::performances;
    private import ScalarValues::Boolean;
    private import ScalarValues::Natural;
    private import SequenceFunctions::*;
    
    interaction Transfer specializes Performance, BinaryLink {
        doc
        /*
         * A Transfer represents the transfer of a payload from the source of the interaction 
         * to the target of the interaction.
         */
    
        end feature source: Occurrence redefines BinaryLink::source {
            doc
            /*
             * The entity whose output is the source of the payload to be transferred.
             */
        
            feature sourceOutput: Anything[0..*];
        }
        
        end feature target: Occurrence redefines BinaryLink::target {
            doc
            /*
             * The entity whose input is the target of the payload to be transferred.
             */
        
            feature targetInput: Anything[0..*];
        }
        
        feature isInstant: Boolean[1] {
            doc
            /*
             * If isInstance is true, then the transfer is instantaneous.
             */
        }
        
        feature payload: Anything[1..*] {
            doc
            /*
             * The things that are to be transferred.
             */
        }
        
        feature payloadNum: Natural [1] = size(payload);
        
        private instantNum: Natural[1] = if isInstant? 1 else 0;
        private binding instant[instantNum] of [0..1] startShot = [0..1] endShot {
            doc
            /*
             * If isInstant is true, then the start and end of the transfer happen at the same time.
             */
        }
    }
    
    interaction MessageTransfer specializes Transfer {
        doc
        /*
         * A MessageTransfer is a Transfer that does not specify where the payload is picked
         * up and dropped off (see FlowTransfer). They are sent by SendPerformances and
         * accepted by AcceptPerformances.
         */
    }
     
    interaction FlowTransfer specializes Transfer disjoint from MessageTransfer {
        doc
        /*
         * A FlowTransfer is a Transfer identifying an output feature of the source from which
         * to pick up a payload and an input feature of the target to which to drop it off. They can
         * start when the payload is available at the source and move or copy it to the target.
         */
         
        feature isMove: Boolean[1] default true {
            doc
            /*
             * If isMove is true, then the entire payload leaves the source at the start
             * of the transfer.
             */
        }
        
        feature isPush: Boolean[1] default true {
            doc
            /*
             * If isPush is true, then the transfer begins when the payload is available
             * at the source.
             */
        }
        
        connector sourceOutputLink: BinaryLinkObject[payloadNum] {
            doc
            /*
             * The output of the payloads from the sourceOutput.
             */
        
            end [1] feature transferSource references source;
            end [payloadNum] feature transferPayload references payload subsets transferSource.sourceOutput;
        }
        
        connector targetInputLink: BinaryLinkObject[payloadNum] {
            doc
            /*
             * The input of the payload to the targetInput.
             */
        
            end [1] feature transferTarget references target;
            end [payloadNum] feature transferPayload references payload subsets transferTarget.targetInput;
        }
        
        private connector sending: HappensDuring[payloadNum] from [1] startShot to [payloadNum] sourceOutputLink {
          doc
            /*
             * The start of the transfer happens during the output of each of the payloads from the
             * source. 
             */
        }
        
        private connector moving: HappensWhile[0..*] from [0..*] sourceOutputLink.endShot to [0..1] startShot {
            doc
            /*
             * If isMove is true, then all payloads leave the source at the start
             * of the transfer.
             */
        }
        private inv { isMove implies size(moving) == size(sourceOutputLink) }
        
        private connector pushing: HappensWhile[0..*] from [0..*] sourceOutputLink.startShot to [0..1] startShot {
            doc
            /*
             * If isPush is true, then the transfer begins when the payloads are available
             * at the source.
             */
        }
        private inv { isPush implies size(pushing) == size(sourceOutputLink) }
        
        private connector delivering: HappensWhile[payloadNum] from [payloadNum] targetInputLink.startShot to [1] endShot {
            doc
            /*
             * The input of each of the payloads to the target starts at the end of the transfer.
             */
        }
    }
    
    interaction TransferBefore specializes Transfer, HappensBefore intersects Transfer, HappensBefore {
        doc
        /*
         * TransferBefore is a specialization of Transfer in which the source happens before
         * the transfer, which happens before the target.
         */
    
        end feature source: Occurrence redefines Transfer::source, HappensBefore::earlierOccurrence;
        end feature target: Occurrence redefines Transfer::target, HappensBefore::laterOccurrence;
        
        feature self: TransferBefore redefines Performance::self;
        
        private succession source then self;
        private succession self then target;
    }
    
    interaction FlowTransferBefore specializes TransferBefore, FlowTransfer intersects FlowTransfer, TransferBefore {
        doc
        /*
         * FlowTransferBefore is a FlowTransfer that is also a TransferBefore. 
         */
         
        end feature source: Occurrence redefines Transfer::source, TransferBefore::source;
        end feature target: Occurrence redefines Transfer::target, TransferBefore::target;         
    }
    
    abstract step transfers: Transfer[0..*] nonunique subsets performances, binaryLinks {
        doc
        /*
         * transfers is a specialization of performances and binaryLinks restricted to type 
         * Transfer.
         */
    
        end feature source: Occurrence redefines Transfer::source, binaryLinks::source;
        end feature target: Occurrence redefines Transfer::target, binaryLinks::target;
    }
    
    abstract step messageTransfers: MessageTransfer[0..*] nonunique subsets transfers {
        doc
        /*
         * messageTransfers is a specialization of transfers restricted to type MessageTransfers.
         */
        
        end feature source: Occurrence redefines MessageTransfer::source, transfers::source;
        end feature target: Occurrence redefines MessageTransfer::target, transfers::target;      
    }
    
    abstract flow flowTransfers: FlowTransfer[0..*] nonunique subsets transfers {
        doc
        /*
         * flowTransfers is a specialization of transfers restricted to type FlowTransfers.
         * It is the default subsetting for non-succession flows.
         */
         
        end feature source: Occurrence redefines FlowTransfer::source, transfers::source;
        end feature target: Occurrence redefines FlowTransfer::target, transfers::target;
    }
      
    abstract flow transfersBefore: TransferBefore[0..*] nonunique subsets transfers, happensBeforeLinks
        intersects transfers, happensBeforeLinks {
        doc
        /*
         * transfersBefore is a specialization of transfers and happensBeforeLinks restricted to
         * type TransferBefore.
         */
    
        end feature source: Occurrence redefines TransferBefore::source, transfers::source, happensBeforeLinks::earlierOccurrence;
        end feature target: Occurrence redefines TransferBefore::target, transfers::target, happensBeforeLinks::laterOccurrence;
    }
    
    abstract flow flowTransfersBefore: FlowTransferBefore[0..*] nonunique subsets flowTransfers, transfersBefore
        intersects flowTransfers, transfersBefore {
        doc
        /*
         * flowTransfersBefore is a specialization of flowTransfers and transfersBefore that is restricted
         * to type FlowTransferBefore. IT is the default subsetting for succession flows.
         */
    
        end feature source: Occurrence redefines FlowTransferBefore::source, flowTransfers::source, transfersBefore::source;
        end feature target: Occurrence redefines FlowTransferBefore::target, flowTransfers::target, transfersBefore::target;
    }

    behavior SendPerformance specializes Performance  {
        doc
        /*
         * SendPerformances are Performance that require an outgoingTransferFromSelf 
         * from a designated sender Occurrence carrying a given payload, optionally to a designated receiver.
         */
    
        in feature payload [0..*];
        in feature sender: Occurrence[1] default this;
        in feature receiver: Occurrence[0..1];
        feature sentTransfer: MessageTransfer [1] subsets sender.outgoingTransfersFromSelf {
            feature redefines payload = SendPerformance::payload;
        }
        binding [0..1] receiver.incomingTransfersToSelf = [1] sentTransfer;

        succession self then sentTransfer;
    }
    
    behavior AcceptPerformance specializes Performance {
        doc
        /*
         * AcceptPerformance is a performance that requires an incomingTransferToSelf
         * of a desigated receiver Occurrence, providing its payload as output.
         */
        inout feature payload[0..*];
        in feature receiver: Occurrence[1] default this;
        feature acceptedTransfer: MessageTransfer[1] subsets receiver.incomingTransfersToSelf;
        succession acceptedTransfer then self.endShot;
        
        binding payload = acceptedTransfer.payload;
    }

    abstract step sendPerformances: SendPerformance[0..*] nonunique subsets performances {
        doc
        /*
         * sendPerformances is a specialization of performances for SendPerformances.
         */
    }
        
    abstract step acceptPerformances: AcceptPerformance[0..*] nonunique subsets performances {
        doc
        /*
         * acceptPerformances is a specialization of performances for AcceptPerformances.
         */
    }
}
// ===== END: Transfers.kerml =====

// ===== BEGIN: TransitionPerformances.kerml =====
standard library package TransitionPerformances {
	doc
	/*
	 * This package contains a library model of the semantics of conditional transitions between occurrences, 
	 * including the performance of specified Behaviors when the transition occurs.
	 */

	private import ScalarValues::Boolean;
	private import ScalarValues::Natural;
	private import SequenceFunctions::isEmpty;
	private import Occurrences::Occurrence;
	private import Occurrences::HappensBefore;
	private import Performances::Performance;
	private import Performances::Evaluation;
	private import Transfers::MessageTransfer;
	private import Transfers::AcceptPerformance;
	private import Transfers::acceptPerformances;
	private import ControlFunctions::allTrue;
	private import SequenceFunctions::size;
	
	abstract behavior TransitionPerformance {
		in feature transitionLinkSource: Performance[1];
		
		feature trigger: MessageTransfer[*];
		bool guard[*] subsets enclosedPerformances;
		step effect[*] subsets enclosedPerformances;

		feature triggerTarget : Occurrence [1] default this;
		feature transitionLink: HappensBefore[0..1];
		
		private binding [0..1] transitionLink.earlierOccurrence = [1] transitionLinkSource;
		private succession [1] transitionLinkSource then [*] effect;
		private succession [*] effect then [1] transitionLink.laterOccurrence;
		
		private connector [0..1] transitionLink to [1..*] trigger;
		private connector all guardConstraint: TPCGuardConstraint[*] 
			from [0..1] transitionLink to [*] guard;
			
		private succession all [*] trigger then [*] guard;
		private succession all [*] guard then [*] effect;

		feature accNum: Natural [1] = if isEmpty(trigger) ? 0 else 1;
		step accept: AcceptPerformance[accNum] subsets timeEnclosedOccurrences, acceptPerformances {
			feature redefines acceptedTransfer = trigger;
		}
        binding accept.receiver = triggerTarget;

		private succession [*] guard then [accNum] accept;
	}
	
	behavior NonStateTransitionPerformance specializes TransitionPerformance {
		feature isTriggerAfter: Boolean default true;
		private succession [1] transitionLinkSource then [1] Performance::self;
		private feature taNum: Natural [1] = if isTriggerAfter ? size(trigger) else 0;
		private succession triggerAfter [taNum] first [0..1] transitionLinkSource then [*] trigger.endShot;
				
		private succession all [*] guard then [0..1] transitionLink.laterOccurrence;
	}
	
	assoc struct TPCGuardConstraint {
		end guardedLink [0..1] feature constrainedHBLink: HappensBefore;
		end bool constrainedGuard;
		
		private inv { allTrue(constrainedGuard()) }
	}	
}
// ===== END: TransitionPerformances.kerml =====

// ===== BEGIN: Triggers.kerml =====
standard library package Triggers {
	doc
	/*
	 * This package contains functions that return ChangeSignals for triggering
	 * when a Boolean condition changes from false to true, at a specific time
	 * or after a specific time delay.
	 */

	private import ScalarValues::Boolean;
	private import ScalarValues::NumericalValue;
	private import Occurrences::Occurrence;
	
	public import Clocks::*;
	public import Observation::*;
	
	struct TimeSignal :> ChangeSignal {
		doc
		/*
		 * A TimeSignal is a ChangeSignal whose condition is the currentTime
		 * of a given Clock reaching a specific signalTime.
		 */
	
		feature signalTime : NumericalValue[1] {
			doc
			/*
			 * The time at which the TimeSignal should be sent.
			 */
		}
		
		feature signalClock : Clock[1] {
			doc
			/*
			 * The Clock whose currentTime is being monitored.
			 */
		}
		
		private bool :>> signalCondition {
			doc
			/*
			 * The Boolean condition of the currentTime of the signalClock being
			 * equal to the signalTime.
			 */
		
			signalClock.currentTime == signalTime
		}
	}
	
	function TriggerWhen {
		doc
		/*
		 * TriggerWhen returns a monitored ChangeSignal for a given condition,
		 * to be sent to a given receiver when the condition occurs.
		 */
	
		in bool condition[1] {
			doc
			/*
			 * The BooleanExpression to be monitored for changing from 
			 * false to true.
		 */
		}
		
		in feature receiver : Occurrence [1] {
			doc
			/*
			 * The Occurrence to which the ChangeSignal is to be sent.
			 */
		}
		
		in feature monitor : ChangeMonitor[1] default defaultMonitor {
			doc
			/*
			 * The ChangeMonitor to be used to monitor the ChangeSignal condition.
			 * The default is the Observation::defaultMonitor.
			 */
		}
		
		return feature changeSignal : ChangeSignal[1] = new ChangeSignal(condition, monitor) {
			doc
			/*
			 * The ChangeSignal for the condition, as monitored by the monitor.
			 */
		}
		
		step :> monitor.startObservation {
			in observer = receiver;
			in signal = changeSignal;
		}		
	}
	
	function TriggerAt {
		doc
		/*
		 * TriggerAt returns a monitored TimeSignal to be sent to a receiver when
		 * the currentTime of a given Clock reaches a specific timeInstant. 
		 */
	
		in feature timeInstant : NumericalValue[1] {
			doc
			/*
			 * The time instant, relative to the clock, at which the TimeSignal should be sent. 
			 */
		}
		
		in feature receiver : Occurrence[1] {
			doc
			/*
			 * The Occurrence to which the TimeSignal is to be sent.
			 */
		}
		
		in feature clock : Clock[1] default localClock {
			doc
			/*
			 * The Clock to be used as the reference for the timeInstant. The default is
			 * the localClock, which will be bound when the function is invoked. 
			 */
		}
		
		in feature monitor : ChangeMonitor[1] default defaultMonitor {
			doc
			/*
			 * The ChangeMonitor to be used to monitor the TimeSignal condition.
			 * The default is the Observation::defaultMonitor.
			 */
		}
		
		return feature timeSignal : TimeSignal[1] = new TimeSignal(timeInstant, clock, monitor) {
			doc
			/*
			 * The TimeSignal for the given timeInstant, as monitored by the monitor.
			 */
		}
		
		step :> monitor.startObservation {
			in observer = receiver;
			in signal = timeSignal;
		}
	}
	
	function TriggerAfter {
		doc
		/*
		 * TriggerAfter returns a monitored TimeSignal to be sent to a receiver after
		 * a certain time delay relative to a given Clock.
		 */
	
		in feature delay : NumericalValue[1] {
			doc
			/*
			 * The time duration, relative to the clock, after which the TimeSignal is sent.
			 */
		}
		
		in feature receiver : Occurrence[1] {
			doc
			/*
			 * The Occurrence to which the TimeSignal is to be sent.
			 */
		}
		
		in feature clock : Clock[1] default localClock {
			doc
			/*
			 * The Clock to be used as the reference for the time delay. The default is
			 * the localClock, which will be bound when the function is invoked. 
			 */
		}
		
		in feature monitor : ChangeMonitor[1] default defaultMonitor {
			doc
			/*
			 * The ChangeMonitor to be used to monitor the TimeSignal condition.
			 * The default is the Observation::defaultMonitor.
			 */
		}
		
		return signal : TimeSignal[1] = 
			TriggerAt(clock.currentTime + delay, receiver, clock, monitor) {
			doc
			/*
			 * The TimeSignal for the currentTime of the clock when the function is invoked
			 * plus the given time delay, as monitored by the monitor.
			 */
		}
	}	
	
}
// ===== END: Triggers.kerml =====

// ===== END: Kernel Semantic Library.kerml =====

