package '11a-View-Viewpoint'{
	package SystemModel{
		private import SI :: *;
		part def Vehicle;
		part def AxleAssembly;
		part def Axle;
		part def Wheel;
		part vehicle : Vehicle{
			attribute mass :> ISQ::mass = 2500[SI::kg];
			part frontAxleAssembly [ 1 ] : AxleAssembly{
				attribute mass :> ISQ::mass = 150[kg];
				part frontWheel [ 2 ] : Wheel;
				part frontAxle [ 1 ] : Axle{
					attribute mass;
					attribute steeringAngle;
				}
			}
			part rearAxleAssembly [ 1 ] : AxleAssembly{
				attribute mass :> ISQ::mass = 250[kg];
				part rearWheel [ 2 ] : Wheel;
				part rearAxle [ 1 ] : Axle{
					attribute mass;
				}
			}
		}
	}
	package ViewModel{
		private import Views :: *;
		part 'systems engineer';
		concern 'system breakdown'{
			subject;
			stakeholder :>> 'systems engineer';
		}
		viewpoint 'system structure perspective'{
			frame 'system breakdown';
		}
		view 'system structure generation'{
			satisfy 'system structure perspective';
			expose SystemModel::vehicle :: ** [ @SysML::PartUsage ];
			render asElementTable{
				view [ 1 ] :>> columnView{
					render asTextualNotation;
				}
			}
		}
	}
}
