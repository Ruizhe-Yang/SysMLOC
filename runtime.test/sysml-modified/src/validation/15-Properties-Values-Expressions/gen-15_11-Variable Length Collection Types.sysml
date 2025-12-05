package '15_11-Variable Length Collection Types'{
	private import ScalarValues :: *;
	private import Collections :: *;
	part def SparePart;
	part def Person;
	/* Examples of declaring syntactic sugar-like names for instantiating collection types. */
	attribute def 'Bag<SparePart>' : Bag{
		ref part : SparePart :>> elements;
	}
	attribute def 'List<Integer>' : List{
		value : Integer :>> elements;
	}
	attribute def 'Set<String>' : Set{
		attribute : String :>> elements;
	}
	attribute def 'OrderedSet<Person>' : OrderedSet{
		ref part : Person :>> elements;
	}
	attribute def 'List<Set<Person>>' : List{
		attribute : Set :>> elements{
			ref part : Person :>> elements;
		}
	}
	attribute def 'Array<Real>[4]' : Array{
		attribute : Real :>> elements;
		attribute :>> dimensions = 4;
	}
}
