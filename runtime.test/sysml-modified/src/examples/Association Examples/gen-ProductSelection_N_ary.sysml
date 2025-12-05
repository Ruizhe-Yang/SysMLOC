package ProductSelection_N_ary_SysML{
	item def ShoppingCart;
	item def Product;
	item def Account;
	// User-specified connection defiation definition
	connection def ProductSelection{
		end [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end [ 0 .. * ] item selectedProduct [ 1 ] : Product;
		end [ 1 .. 1 ] item account [ 1 ] : Account;
	}
	// Equivalent connection defiation definition with named end items.
	connection def ProductSelection1{
		end inCart [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end selectedProducts [ 0 .. * ] item selectedProduct [ 1 ] : Product;
		end withAccount [ 1 .. 1 ] item account [ 1 ] : Account;
	}
}
