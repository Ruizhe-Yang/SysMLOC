package 'Message Payload Example'{
	private import 'Event Occurrence Example' :: *;
	item def SetSpeed;
	item def SensedSpeed;
	item def FuelCommand{
		attribute fuelFlow : ScalarValues::Real;
	}
	part def EngineController;
	part vehicle1 :> vehicle{
		part engineController : EngineController{
			event occurrence fuelCommandReceived;
			then event occurrence fuelCommandForwarded;
		}
	}
	occurrence def CruiseControlInteraction{
		ref part :>> driver;
		ref part vehicle :>> vehicle1;
		message setSpeedMessage of SetSpeed driver.setSpeedSent to vehicle.cruiseController.setSpeedReceived;
		then message sensedSpeedMessage of SensedSpeed vehicle.speedometer.sensedSpeedSent to vehicle.cruiseController.sensedSpeedReceived;
		then message fuelCommandMessage of fuelCommand : FuelCommand vehicle.cruiseController.fuelCommandSent to vehicle.engineController.fuelCommandReceived;
		then message fuelCommandForwardingMessage of fuelCommand : FuelCommand = fuelCommandMessage.fuelCommand vehicle.engineController.fuelCommandForwarded to vehicle.engine.fuelCommandReceived;
	}
}
