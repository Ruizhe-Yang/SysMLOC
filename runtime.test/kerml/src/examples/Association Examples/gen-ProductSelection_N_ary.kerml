package ProductSelection_N_ary{
	class ShoppingCart;
	class Product;
	class Account;
	// User-specified association definition
	assoc ProductSelection{
		end [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end [ 0 .. * ] feature selectedProduct [ 1 ] : Product{
		}
		end [ 1 .. 1 ] feature account [ 1 ] : Account{
		}
	}
	// Equivalent association definition with named end features.
	assoc ProductSelection1{
		end inCart [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end selectedProducts [ 0 .. * ] feature selectedProduct [ 1 ] : Product{
		}
		end withAccount [ 1 .. 1 ] feature account [ 1 ] : Account{
		}
	}
	// Equivalent association definition with nested cross features.
	assoc ProductSelection2{
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
		end feature account [ 1 ] : Account{
			member feature withAccount [ 1 .. 1 ]{
			}
			// owned cross feature
		}
	}
	// Equivalent association definition showing library model specialization 
	// implied cross subsetting, and "Cartesian product" features.
	assoc ProductSelection3 :> Links::Link{
		end cart [ 1 ] : ShoppingCart => cart::product_account.inCart{
			member feature inCart [ 0 .. 1 ] : ShoppingCart featured by Product_Account{
				// Represents the "Cartesian product" of Product X Account.
				member feature Product_Account : Account featured by Product{
				}
			}
			member feature product_account : inCart::Product_Account featured by ProductSelection3{
				public import inCart;
			}
		}
		end selectedProduct [ 1 ] : Product => selectedProduct::cart_account.selectedProducts{
			member feature selectedProducts [ 0 .. * ] : Product featured by Cart_Account{
				// Represents the "Cartesian product" of ShoppingCart X Account.
				member feature Cart_Account : Account featured by ShoppingCart{
				}
			}
			member feature cart_account : selectedProducts::Cart_Account featured by ProductSelection3{
				public import selectedProducts;
			}
		}
		end feature account [ 1 ] : Account => account::cart_product.withAccount{
			member feature withAccount [ 1 .. 1 ] : Account featured by Cart_Product{
				// Represents the "Cartesian product" of ShoppingCart X Product.
				member feature Cart_Product : Product featured by ShoppingCart{
				}
			}
			member feature cart_product : withAccount::Cart_Product featured by ProductSelection3{
				public import withAccount;
			}
		}
	}
	assoc SingleProductSelection :> ProductSelection{
		end [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end [ 0 .. 1 ] feature selectedProduct [ 1 ] : Product{
		}
		end [ 1 .. 1 ] feature account [ 1 ] : Account{
		}
	}
	assoc SingleProductSelection1 :> ProductSelection1{
		end inCart1 [ 0 .. 1 ] feature cart [ 1 ] : ShoppingCart{
		}
		end selectedProduct1 [ 0 .. 1 ] feature selectedProduct [ 1 ] : Product{
		}
		end withAccount1 [ 1 .. 1 ] feature account [ 1 ] : Account{
		}
	}
	assoc SingleProductSelection2 :> ProductSelection2{
		end feature cart [ 1 ] : ShoppingCart{
			member feature inCart1 [ 0 .. 1 ]{
			}
			// owned crossing feature
		}
		end feature selectedProduct [ 1 ] : Product{
			member feature selectedProducts1 [ 0 .. * ]{
			}
			// owned crossing feature
		}
		end feature account [ 1 ] : Account{
			member feature withAccount1 [ 0 .. * ]{
			}
			// owned crossing feature
		}
	}
	assoc SingleProductSelection3 :> ProductSelection3{
		end cart [ 1 ] : ShoppingCart => cart::product_account1.inCart1 :>> cart{
			member feature inCart1 [ 0 .. 1 ] : ShoppingCart featured by Product_Account1{
				member feature Product_Account1 : Account :> Product_Account featured by Product{
				}
			}
			member feature product_account1 : inCart1::Product_Account1 featured by ProductSelection3{
				public import inCart1;
			}
		}
		end selectedProduct [ 1 ] : Product => selectedProduct::cart_account1.selectedProduct1 :>> selectedProduct{
			member feature selectedProduct1 [ 1 .. 1 ] : Product featured by Cart_Account1{
				member feature Cart_Account1 : Account :> Cart_Account featured by ShoppingCart{
				}
			}
			member feature cart_account1 : selectedProduct1::Cart_Account1 featured by ProductSelection3{
				public import selectedProduct1;
			}
		}
		end feature account [ 1 ] : Account => account::cart_product1.withAccount1{
			member feature withAccount1 [ 1 .. 1 ] : Account featured by cart_product1{
				member feature Cart_Product1 : Product :> Cart_Product featured by ShoppingCart{
				}
			}
			member feature cart_product1 : withAccount1::Cart_Product1 featured by ProductSelection3{
				public import withAccount1;
			}
		}
	}
	class OnlineCustomer{
		feature myCart [ 1 ] : ShoppingCart{
		}
		feature products [ 0 .. * ] : Product{
		}
		feature myAccount [ 1 ] : Account{
		}
		connector ps1 : ProductSelection ( myCart , products , myAccount );
		connector ps2 : ProductSelection ( [ 1 ] myCart , [ 0 .. 1 ] products , [ 1 ] myAccount );
	}
}
