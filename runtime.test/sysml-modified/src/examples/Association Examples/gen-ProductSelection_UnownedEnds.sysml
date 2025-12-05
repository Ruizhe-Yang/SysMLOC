package ProductSelection_UnownedEnds_SysML{
	item def SelectionInfo;
	item def ShoppingCart{
		item selectedProducts [ 0 .. * ] : Product;
	}
	item def Product{
		item inCart [ 0 .. 1 ] : ShoppingCart;
	}
	connection def ProductSelection{
		item info [ 1 ] : SelectionInfo;
		end item cart [ 1 ] : ShoppingCart => selectedProduct.inCart;
		end item selectedProduct [ 1 ] : Product => cart.selectedProducts;
	}
	connection def SingleProductSelection : ProductSelection{
		end item cart [ 1 ] : ShoppingCart;
		end [ 0 .. 1 ] item selectedProduct [ 1 ] : Product;
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
