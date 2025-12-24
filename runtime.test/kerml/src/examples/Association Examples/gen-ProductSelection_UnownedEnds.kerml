package ProductSelection_UnownedEnds{
	class SelectionInfo;
	class ShoppingCart{
		feature selectedProducts [ 0 .. * ] : Product{
		}
	}
	class Product{
		feature inCart [ 0 .. 1 ] : ShoppingCart{
		}
	}
	assoc ProductSelection{
		feature info [ 1 ] : SelectionInfo{
		}
		end feature cart [ 1 ] : ShoppingCart => selectedProduct.inCart{
		}
		end feature selectedProduct [ 1 ] : Product => cart.selectedProducts{
		}
	}
	assoc SingleProductSelection :> ProductSelection{
		end feature cart [ 1 ] : ShoppingCart{
		}
		end [ 0 .. 1 ] feature selectedProduct [ 1 ] : Product{
		}
	}
	// Equivalent association showing implied relationships explicitly.
	assoc SingleProductSelection1 :> ProductSelection{
		end feature cart [ 1 ] : ShoppingCart :>> cart{
			public import selectedProduct::selectedProduct1;
		}
		end feature selectedProduct [ 1 ] : Product => cart.selectedProduct1 :>> selectedProduct{
			member feature selectedProduct1 [ 0 .. 1 ] :> ShoppingCart::selectedProducts featured by ShoppingCart{
			}
		}
	}
	class OnlineCustomer{
		feature info1 : SelectionInfo{
		}
		feature myCart [ 1 ] : ShoppingCart{
		}
		feature products [ 0 .. * ] : Product{
		}
		connector ps1 : ProductSelection from myCart to products{
			:>> info = info1{
			}
		}
		connector ps2 : ProductSelection from [ 1 ] myCart to [ 1 ] products{
			:>> info = info1{
			}
		}
	}
}
