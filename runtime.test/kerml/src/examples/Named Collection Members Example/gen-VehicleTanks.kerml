package VehicleTanks{
	private import ScalarValues :: *;
	private import RealFunctions :: *;
	class V6Engine;
	class Tank{
		feature capacity : Real{
		}
	}
	class Vehicle{
		composite tanks [ 1 .. * ] : Tank ordered feature fuelCapacity : Real = sum(tanks.capacity){
		}
	}
	class Vehicle1 :> Vehicle{
		composite tanks [ 4 ] : Tank :>> Vehicle::tanks ordered feature main1 [ 1 ] :> tanks = tanks#(1){
		}
		feature main2 [ 1 ] :> tanks = tanks#(2){
		}
		feature aux1 [ 1 ] :> tanks = tanks#(3){
		}
		feature aux2 [ 1 ] :> tanks = tanks#(4){
		}
	}
	composite eng : V6Engine{
	}
	connector eng to tanks.main1;
	connector tanks.main1 to tanks.aux1;
	connector eng to tanks.main2;
	connector tanks.main2 to tanks.aux2;
}
}
