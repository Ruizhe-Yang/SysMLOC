package 'Flow Definition Example'{
	private import 'Port Example' :: *;
	part def Vehicle;
	flow def FuelFlow{
		ref : Fuel :>> payload;
		end port supplierPort : FuelOutPort;
		end port consumerPort : FuelInPort;
	}
	part vehicle : Vehicle{
		part tankAssy : FuelTankAssembly;
		part eng : Engine;
		flow : FuelFlow of Fuel tankAssy.fuelTankPort.fuelSupply to eng.engineFuelPort.fuelSupply;
	}
}
