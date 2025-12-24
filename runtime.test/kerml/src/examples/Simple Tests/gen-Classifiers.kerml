package Classifiers{
	classifier A;
	classifier B;
	specialization Super subclassifier A :> B;
	specialization subclassifier B :> A;
	subclassifier C :> A;
	subclassifier C :> B;
	classifier C :> A , B;
	classifier D disjoint from C differences A differences B;
	classifier E :> C intersects A intersects B;
	classifier F unions A unions B;
}
