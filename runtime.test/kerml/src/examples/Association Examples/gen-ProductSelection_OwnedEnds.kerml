package ProductSelection_OwnedEnds{
	class SelectionInfo;
	class ShoppingCart;
	class Product;
	// User-specified association definition
	assoc ProductSelection{
		feature info : SelectionInfo{
		}
		end [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end [ 0 .. * ] nonunique feature selectedProduct [ 1 ] : Product{
		}
	}
	// Equivalent association definition with named end features.
	assoc ProductSelection1{
		feature info : SelectionInfo{
		}
		end inCart [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end selectedProducts [ 0 .. * ] feature selectedProduct [ 1 ] : Product{
		}
	}
	// Equivalent association definition with nested cross features.
	assoc ProductSelection2{
		feature info : SelectionInfo{
		}
		end feature cart [ 1 ] : ShoppingCart{
			member feature inCart [ 0 .. 1 ]{
			}
			// owned cross feature
		}
		end feature selectedProduct [ 1 ] : Product{
			member feature selectedProducts [ 0 .. * ]{
			}
			// owned cross feature
		}
	}
	// Equivalent association definition showing library model specialization 
	// and implied cross subsetting.
	assoc ProductSelection3 :> Links::BinaryLink{
		feature info : SelectionInfo{
		}
		end cart [ 1 ] : ShoppingCart => selectedProduct.inCart :>> source{
			member feature inCart [ 0 .. 1 ] : ShoppingCart featured by Product{
			}
			public import selectedProduct::selectedProducts;
		}
		end selectedProduct [ 1 ] : Product => cart.selectedProducts :>> target{
			member feature selectedProducts [ 0 .. * ] : Product featured by ShoppingCart{
			}
			public import cart::inCart;
		}
	}
	assoc SingleProductSelection :> ProductSelection{
		end [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end [ 0 .. 1 ] feature selectedProduct [ 1 ] : Product{
		}
	}
	assoc SingleProductSelection1 :> ProductSelection1{
		end inCart1 [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end selectedProduct1 [ 0 .. 1 ] feature selectedProduct [ 1 ] : Product{
		}
	}
	assoc SingleProductSelection2 :> ProductSelection2{
		end feature cart [ 1 ] : ShoppingCart{
			member feature inCart1 [ 0 .. 1 ]{
			}
			// owned crossing feature
		}
		end feature selectedProduct [ 1 ] : Product{
			member feature selectedProduct1 [ 0 .. 1 ]{
			}
			// owned crossing feature
		}
	}
	assoc SingleProductSelection3 :> ProductSelection3{
		end cart [ 1 ] : ShoppingCart => selectedProduct.inCart1 :>> cart{
			member feature inCart1 [ 0 .. 1 ] :> inCart featured by Product{
			}
			public import selectedProduct::selectedProduct1;
		}
		end selectedProduct [ 1 ] : Product => cart.selectedProduct1 :>> selectedProduct{
			member feature selectedProduct1 [ 0 .. 1 ] :> selectedProducts featured by ShoppingCart{
			}
			public import cart::inCart1;
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
