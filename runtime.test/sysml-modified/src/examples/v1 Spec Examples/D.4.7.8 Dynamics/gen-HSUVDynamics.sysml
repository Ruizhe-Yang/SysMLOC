package HSUVDynamics{
	private import ScalarValues :: *;
	private import SequenceFunctions::size;
	private import ControlFunctions :: *;
	attribute def Horsepwr : Real;
	attribute def Weight : Real;
	attribute def Accel : Real;
	attribute def Vel : Real;
	attribute def Dist : Real;
	attribute def Time : Real;
	constraint def PowerEquation{
		attribute whlpwr : Horsepwr;
		attribute Cd : Real;
		attribute Cf : Real;
		attribute tw : Weight;
		attribute tp : Horsepwr;
		attribute v : Vel;
		tp == whlpwr - Cd * v - Cf * tw * v
	}
	constraint def PositionEquation{
		attribute dt : Time;
		attribute v [ 0 .. * ] ordered : Vel;
		attribute x [ 0 .. * ] ordered : Dist;
		(1..size(x)-1)->forAll{
			in n : Natural;
			x#(n + 1) == x#(n) + v#(n) * (5280/3600) * dt
		}
	}
	constraint def VelocityEquation{
		attribute dt : Time;
		attribute v [ 0 .. * ] ordered : Vel;
		attribute a : Accel;
		(1..size(v)-1)->forAll{
			in n: Natural;
			v#(n + 1) == v#(n) + a * 32 * (3600/5280) * dt
		}
	}
	constraint def AccelerationEquation{
		attribute tw : Weight;
		attribute dt : Time;
		attribute tp : Horsepwr;
		attribute a : Accel;
		a == (550/32) * tp * dt * tw
	}
	constraint def StraightLineVehicleDynamics{
		attribute dt : Time;
		attribute whlpwr : Horsepwr;
		attribute Cd : Real;
		attribute Cf : Real;
		attribute tw : Weight;
		attribute a : Accel;
		attribute v [ 0 .. * ] ordered : Vel;
		attribute x [ 0 .. * ] ordered : Dist;
		constraint pwr : PowerEquation{
			attribute :>> whlpwr = StraightLineVehicleDynamics::whlpwr;
			attribute :>> Cd = StraightLineVehicleDynamics::Cd;
			attribute :>> Cf = StraightLineVehicleDynamics::Cf;
			attribute :>> tw = StraightLineVehicleDynamics::tw;
			attribute :>> v = vel.v;
			attribute :>> tp;
		}
		constraint acc : AccelerationEquation{
			attribute :>> tp = pwr.tp;
			attribute :>> tw = StraightLineVehicleDynamics::tw;
			attribute :>> dt = StraightLineVehicleDynamics::dt;
			attribute :>> a = StraightLineVehicleDynamics::a;
		}
		constraint vel : VelocityEquation{
			attribute :>> a = acc.a;
			attribute :>> v = StraightLineVehicleDynamics::v;
			attribute :>> dt = StraightLineVehicleDynamics::dt;
		}
		constraint pos : PositionEquation{
			attribute :>> v = vel.v;
			attribute :>> x = StraightLineVehicleDynamics::x;
			attribute :>> dt = StraightLineVehicleDynamics::dt;
		}
	}
}
