package 'Flow Usage Example'{
	private import 'Port Example' :: *;
	part def Vehicle;
	part vehicle : Vehicle{
		part tankAssy : FuelTankAssembly;
		part eng : Engine;
		flow of Fuel tankAssy.fuelTankPort.fuelSupply to eng.engineFuelPort.fuelSupply;
		flow of Fuel eng.engineFuelPort.fuelReturn to tankAssy.fuelTankPort.fuelReturn;
	}
}
