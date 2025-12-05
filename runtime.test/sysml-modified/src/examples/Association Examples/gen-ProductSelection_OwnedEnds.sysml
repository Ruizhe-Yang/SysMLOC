package ProductSelection_OwnedEnds_SysML{
	item def SelectionInfo;
	item def ShoppingCart;
	item def Product;
	// User-specified connection defiation definition
	connection def ProductSelection{
		item info : SelectionInfo;
		end [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end [ 0 .. * ] nonunique item selectedProduct [ 1 ] : Product;
	}
	// Equivalent connection defiation definition with named end items.
	connection def ProductSelection1{
		item info : SelectionInfo;
		end inCart [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end selectedProducts [ 0 .. * ] item selectedProduct [ 1 ] : Product;
	}
	connection def SingleProductSelection : ProductSelection{
		end [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end [ 0 .. 1 ] item selectedProduct [ 1 ] : Product;
	}
	connection def SingleProductSelection1 : ProductSelection1{
		end inCart1 [ 0 .. 1 ] item cart [ 1 ] : ShoppingCart;
		end selectedProduct1 [ 0 .. 1 ] item selectedProduct [ 1 ] : Product;
	}
	item def OnlineCustomer{
		item info1 : SelectionInfo;
		item myCart [ 1 ] : ShoppingCart;
		item products [ 0 .. * ] : Product;
		connection ps1 : ProductSelection connect myCart to products{
			:>> info = info1;
		}
		connection ps2 : ProductSelection connect [ 1 ] myCart to [ 1 ] products{
			:>> info = info1;
		}
	}
}
