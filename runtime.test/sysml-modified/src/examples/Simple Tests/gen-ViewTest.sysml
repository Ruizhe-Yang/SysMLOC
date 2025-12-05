package ViewTest{
	package P{
		public part p1;
		private part p2;
	}
	part def S;
	concern def C{
		subject;
		stakeholder s : S;
	}
	concern c : C{
		subject;
		stakeholder s1;
	}
	viewpoint def VP{
		frame c;
	}
	rendering def R;
	rendering r : R;
	view def V{
		viewpoint vp : VP{
			frame concern c1;
			concern c2;
		}
		render rendering r1 [ 0 .. 1 ] : R;
		view v [ 0 .. * ] : V{
			expose P :: *;
			render r;
			rendering r2;
			alias vp1 for p1;
			// Note: "expose" imports all.
			alias vp2 for p2;
		}
	}
}
