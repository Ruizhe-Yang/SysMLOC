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

