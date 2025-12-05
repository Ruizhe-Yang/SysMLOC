package VehicleVariabilityModel{
	package DesignModel{
		public import PartDefinitions :: *;
		public import PartsTree :: *;
		public import ActionDefinitions :: *;
		public import ActionTree :: *;
		package PartDefinitions{
			part def Vehicle;
			attribute def Diameter;
			part def Cylinder{
				attribute diameter [ 1 ] : Diameter;
			}
			part def Engine;
			part def Transmission;
			part def Sunroof;
			port def AutoPort;
		}
		package PartsTree{
			part vehicle : Vehicle{
				part engine [ 1 ] : Engine;
				part transmission [ 1 ] : Transmission;
				part sunroof [ 0 .. 1 ] : Sunroof;
			}
			part engine : Engine{
				port autoPort : AutoPort;
				part cylinder [ 2 .. * ] : Cylinder;
			}
			part '4cylEngine' :> engine{
				part [ 4 ] :>> cylinder;
			}
			part '6cylEngine' :> engine{
				part [ 6 ] :>> cylinder;
			}
			part transmission : Transmission;
			part manualTransmission :> transmission;
			part automaticTransmission :> transmission;
		}
		package ActionDefinitions{
			action def GenerateTorque;
			action def AmplifyTorque;
			action def ProvidePower;
		}
		package ActionTree{
			action generateTorque4Cyl : GenerateTorque;
			action generateTorque6Cyl : GenerateTorque;
			action amplifyTorqueManual : AmplifyTorque;
			action amplifyTorqueAutomatic : AmplifyTorque;
		}
	}
	package '150% Model'{
		private import DesignModel :: *;
		package PartsTree{
			// Variation point definitions
			variation attribute def DiameterChoices : Diameter{
				variant attribute diameterSmall;
				variant attribute diameterLarge;
			}
			variation part def EngineChoices : Engine{
				variant '4cylEngine';
				variant '6cylEngine'{
					variation port :>> autoPort{
						variant port autoPort1;
						variant port autoPort2;
					}
					part :>> cylinder{
						attribute : DiameterChoices :>> diameter;
					}
					assert constraint{
						(autoPort == autoPort::autoPort1 and cylinder.diameter == cylinder::diameter::diameterSmall) xor (autoPort == autoPort::autoPort2 and cylinder.diameter == cylinder::diameter::diameterLarge)
					}
				}
			}
			// Part superset model
			abstract part vehicleFamily :> vehicle{
				// Variation point usage
				part [ 1 ] : EngineChoices :>> engine;
				// Variation point with embedded variant definitions
				variation part [ 1 ] : Transmission :>> transmission{
					variant manualTransmission;
					variant automaticTransmission;
				}
				assert constraint{
					(engine == engine::'4cylEngine' and transmission == transmission::manualTransmission) xor (engine == engine::'6cylEngine' and transmission == transmission::automaticTransmission)
				}
				// Variation point on variant multiplicity (inherited multiplicity is [0..1]) 
				variation part :>> sunroof{
					variant part withSunroof [ 1 ];
					variant part withoutSunroof [ 0 ];
				}
				perform ActionTree::providePowerFamily;
			}
		}
		package ActionTree{
			// Action superset Model
			action providePowerFamily : ProvidePower{
				variation action generateTorque : GenerateTorque{
					variant generateTorque4Cyl;
					variant generateTorque6Cyl;
				}
				variation action amplifyTorque : AmplifyTorque{
					variant amplifyTorqueManual;
					variant amplifyTorqueAutomatic;
				}
				assert constraint{
					(generateTorque == generateTorque::generateTorque4Cyl and amplifyTorque == amplifyTorque::amplifyTorqueManual ) xor (generateTorque == generateTorque::generateTorque6Cyl and amplifyTorque == amplifyTorque::amplifyTorqueAutomatic )
				}
			}
		}
	}
	package '100% Model'{
		private import '150% Model' :: *;
		// Vehicle instance model
		part vehicle4Cyl :> PartsTree::vehicleFamily{
			part :>> engine = engine::'4cylEngine';
			part :>> transmission = transmission::manualTransmission;
			part :>> sunroof = sunroof::withoutSunroof;
			perform action :>> providePowerFamily{
				action :>> generateTorque = generateTorque::generateTorque4Cyl;
				action :>> amplifyTorque = amplifyTorque::amplifyTorqueManual;
			}
		}
	}
}
