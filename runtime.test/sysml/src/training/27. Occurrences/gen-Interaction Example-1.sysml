package 'Interaction Example-1'{
	public import 'Event Occurrence Example' :: *;
	item def SetSpeed;
	item def SensedSpeed;
	item def FuelCommand;
	occurrence def CruiseControlInteraction{
		ref part :>> driver;
		ref part :>> vehicle;
		message setSpeedMessage of SetSpeed driver.setSpeedSent to vehicle.cruiseController.setSpeedReceived;
		message sensedSpeedMessage of SensedSpeed vehicle.speedometer.sensedSpeedSent to vehicle.cruiseController.sensedSpeedReceived;
		message fuelCommandMessage of FuelCommand vehicle.cruiseController.fuelCommandSent to vehicle.engine.fuelCommandReceived;
		first setSpeedMessage then sensedSpeedMessage;
	}
}
