// State Space Representation EV example
package EVSample{
	private import SI :: *;
	private import StateSpaceRepresentation :: *;
	attribute < 'A⋅h' > 'ampere hour' : ElectricChargeUnit = A*h;
	part def Vehicle{
		attribute mass :> ISQ::mass;
		attribute def VehicleInput : Input{
			attribute force :> ISQ::force;
		}
		attribute def VehicleOutput : Output{
			attribute accel :> ISQ::acceleration;
			attribute velocity :> ISQ::speed;
			attribute distance :> ISQ::distance;
		}
		attribute def VehicleState : StateSpace{
			attribute velocity :> ISQ::speed;
			attribute distance :> ISQ::distance;
		}
	}
	part def Battery{
		attribute baseVoltage :> ISQ::electricPotential;
		attribute socInit : ScalarValues::Real;
		attribute capacity :> ISQ::electricCharge;
		attribute internalResistance :> ISQ::resistance;
		attribute def BatteryInput : Input{
			attribute current :> ISQ::electricCurrent;
		}
		attribute def BatteryOutput : Output{
			attribute voltage :> ISQ::electricPotential;
		}
		attribute def BatteryState : StateSpace{
			attribute soc : ScalarValues::Real;
		}
	}
	part def Motor{
		torquePerCurrent :> Quantities::scalarQuantities = ISQ::torque / ISQ::electricCurrent;
		attribute motR :> ISQ::resistance;
		attribute motL :> ISQ::inductance;
		attribute def MotorInput : Input{
			attribute voltage :> ISQ::electricPotential;
			attribute friction :> ISQ::torque;
		}
		attribute def MotorOutput : Output{
			attribute current :> ISQ::electricCurrent;
			attribute torque :> ISQ::torque;
		}
		attribute def MotorState : StateSpace{
			attribute current :> ISQ::electricCurrent;
		}
	}
	part def Tire{
		attribute radius :> ISQ::length;
		attribute moment :> ISQ::momentOfInertia;
		attribute def TireInput : Input{
			attribute torque :> ISQ::torque;
			attribute accel :> ISQ::acceleration;
		}
		attribute def TireOutput : Output{
			attribute force :> ISQ::force;
			attribute outTorque :> ISQ::torque;
		}
	}
	requirement def VehicleRequirement{
		subject vehicle : Vehicle;
	}
	analysis def VehicleAnalysis{
		subject vehicle : Vehicle;
		requirement vehicleRequirement : VehicleRequirement;
	}
	requirement def RangeRequirement : VehicleRequirement{
		doc /* The range of EV must be longer than the required spec under the flat road. */
		attribute actualRange : LengthValue;
		attribute requiredRange : LengthValue;
		require constraint{
			actualRange >= requiredRange
		}
	}
	analysis def RangeAnalysis : VehicleAnalysis{
		return simulatedRange : LengthValue;
		requirement rangeRequirement : RangeRequirement :>> vehicleRequirement;
		objective rangeAnalysisObjective{
			doc /* This analysis is to estimate the range of
                 * the EV by simulating the vehicle driving under the compact vehicle regulation.
                 */
			require rangeRequirement{
				:>> actualRange = simulatedRange;
			}
		}
	}
	requirement def EfficiencyRequirement : VehicleRequirement{
		doc /* The efficiency of EV must be better than the required spec. */
		attribute actualEfficiency;
		attribute requiredEfficiency;
		require constraint{
			actualEfficiency >= requiredEfficiency
		}
	}
	analysis def EfficiencyAnalysis : VehicleAnalysis{
		return simulatedEfficiency;
		requirement efficiencyRequirement : EfficiencyRequirement :>> vehicleRequirement;
		objective efficiencyAnalysisObjective{
			require efficiencyRequirement{
				attribute :>> actualEfficiency = simulatedEfficiency;
			}
		}
	}
	requirement def MaxSpeedRequirement : VehicleRequirement{
		doc /* The maximum speed of EV must be larger than the required spec. */
		attribute actualMaxSpeed :> ISQ::speed;
		attribute requiredMaxSpeed :> ISQ::speed;
	}
	analysis def MaxSpeedAnalysis : VehicleAnalysis{
		return simulatedMaxSpeed;
		requirement maxSpeedRequirement : MaxSpeedRequirement :>> vehicleRequirement;
		objective maxSpeedAnalysisObjective{
			require maxSpeedRequirement{
				attribute :>> actualMaxSpeed = simulatedMaxSpeed;
			}
		}
	}
	part vehicle : Vehicle{
		attribute :>> mass default 1000[kg];
		/* airFrictionCoefficient [kg / m] = 1/2 * rho[kg/m^3] * Cd * S[m^2],
         * where rho is air density, S is front projected area. */
		attribute airFrictionCoefficient = 0.2;
		attribute efficiency;
		action vehicleBehavior : ContinuousStateSpaceDynamics{
			in input : VehicleInput;
			out output : VehicleOutput;
			: VehicleState :>> stateSpace;
		}
		part battery : Battery{
			:>> baseVoltage = 300[V];
			:>> capacity = 50['A⋅h'];
			:>> socInit = 0.8;
			:>> internalResistance = 1.8['Ω'];
			action batteryBehavior : ContinuousStateSpaceDynamics{
				in input : BatteryInput;
				out output : BatteryOutput;
				: BatteryState :>> stateSpace;
			}
		}
		flow battery.batteryBehavior.output to motor.motorBehavior.input;
		part motor : Motor{
			:>> motR = 4['Ω'];
			:>> motL = 0.2[H];
			action motorBehavior : ContinuousStateSpaceDynamics{
				in input : MotorInput;
				out output : MotorOutput;
				: MotorState :>> stateSpace;
			}
		}
		flow motor.motorBehavior.output to tire.tireBehavior.input;
		part tire : Tire{
			:>> moment default 300['kg⋅m²'];
			:>> radius default 0.7[m];
			action tireBehavior : ContinuousStateSpaceDynamics{
				in input : TireInput;
				out output : TireOutput;
			}
		}
		flow tire.tireBehavior.output to motor.motorBehavior.input;
		flow tire.tireBehavior.output to vehicleBehavior.input;
	}
	part vehicle_compact :> vehicle{
		attribute :>> mass = 800[kg];
		part :>> tire{
			:>> moment = 200['kg⋅m²'];
			:>> radius = 0.5[m];
		}
	}
	part smallEVRangeContext{
		requirement smallEVRequirement : VehicleRequirement{
			doc /* The small EVs must be ligher than 900[kg] */
			subject :>> vehicle = vehicle_compact;
			/*  To comform with the regulation and the battery mass will impact it. */
			assume constraint{
				vehicle.mass < 900[kg]
			}
		}
		analysis smallEVAnalysis : VehicleAnalysis{
			subject :> vehicle_compact :>> vehicle;
			requirement :>> vehicleRequirement = smallEVRequirement;
		}
		requirement < C1 > rangeRequirementSmall : RangeRequirement :> smallEVRequirement{
			doc /* The small EVs must run longer than 130km */
			attribute :>> requiredRange = 130[km];
		}
		analysis rangeAnalysisSmall : RangeAnalysis :> smallEVAnalysis{
			requirement :>> rangeRequirement = rangeRequirementSmall;
			return simulatedRange = vehicle.vehicleBehavior.output.distance;
		}
		requirement < C2 > efficiencyRequirementSmall : EfficiencyRequirement :> smallEVRequirement{
			doc /* The target efficiency of small EVs is 0.9. */
			attribute :>> requiredEfficiency = 0.9;
		}
		analysis efficiencyAnalysisSmall : EfficiencyAnalysis :> smallEVAnalysis{
			requirement :>> efficiencyRequirement = efficiencyRequirementSmall;
			return simulatedEfficiency = vehicle.efficiency;
		}
		requirement < C3 > maxSpeedRequirementSmall : MaxSpeedRequirement :> smallEVRequirement{
			doc /* The target maximum speed of small EVs is 130 [km/h]. */
			attribute :>> requiredMaxSpeed = 130 [km/h];
		}
		analysis maxSpeedAnalysisSmall : MaxSpeedAnalysis :> smallEVAnalysis{
			subject;
			requirement :>> maxSpeedRequirement = maxSpeedRequirementSmall;
			out voltage :> ISQ::electricPotential = vehicle.battery.batteryBehavior.output.voltage;
			return simulatedMaxSpeed = vehicle.vehicleBehavior.output.velocity;
		}
	}
	part vehicle_large :> vehicle{
		attribute :>> mass = 1100[kg];
		part :>> tire{
			:>> moment = 300['kg⋅m²'];
			:>> radius = 0.7[m];
		}
	}
	part largeEVRangeContext{
		requirement largeEVRequirement : VehicleRequirement{
			doc /* The large EVs must be ligher than 900[kg] */
			subject :>> vehicle = vehicle_large;
			/*  To comform with the regulation and the battery mass will impact it. */
			assume constraint{
				vehicle.mass < 1200[kg]
			}
		}
		analysis largeEVAnalysis : VehicleAnalysis{
			subject :> vehicle_large :>> vehicle;
			requirement :>> vehicleRequirement = largeEVRequirement;
		}
		requirement < L1 > rangeRequirementLarge : RangeRequirement :> largeEVRequirement{
			doc /* The large EVs must run longer than 200km */
			attribute :>> requiredRange = 200[km];
		}
		analysis rangeAnalysisLarge : RangeAnalysis :> largeEVAnalysis{
			requirement :>> rangeRequirement = rangeRequirementLarge;
			return simulatedRange = vehicle.vehicleBehavior.output.distance;
		}
		requirement < L2 > efficiencyRequirementLarge : EfficiencyRequirement :> largeEVRequirement{
			doc /* The target efficiency of large EVs is 0.8. */
			attribute :>> requiredEfficiency = 0.8;
		}
		analysis efficiencyAnalysisLarge : EfficiencyAnalysis :> largeEVAnalysis{
			requirement :>> efficiencyRequirement = efficiencyRequirementLarge;
			return simulatedEfficiency = vehicle.efficiency;
		}
		requirement < L3 > maxSpeedRequirementLarge : MaxSpeedRequirement :> largeEVRequirement{
			doc /* The target maximum speed of large EVs is 140 [km/h]. */
			attribute :>> requiredMaxSpeed = 140 [km/h];
		}
		analysis maxSpeedAnalysisLarge : MaxSpeedAnalysis :> largeEVAnalysis{
			subject;
			requirement :>> maxSpeedRequirement = maxSpeedRequirementLarge;
			out voltage = vehicle.battery.batteryBehavior.output.voltage;
			return simulatedMaxSpeed = vehicle.vehicleBehavior.output.velocity;
		}
	}
}
