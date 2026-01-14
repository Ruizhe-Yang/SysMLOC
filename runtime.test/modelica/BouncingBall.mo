model BouncingBall
  parameter Real g = 9.81 "Gravity acceleration (m/s^2)";
  parameter Real e = 0.8  "Coefficient of restitution";

  Real h(start = 1.0, fixed=true) "Height (m)";
  Real v(start = 0.0, fixed=true) "Velocity (m/s)";
  
  block Integrator "Output the integral of the input signal with optional reset"
    import Modelica.Blocks.Types.Init;
   end Integrator;
   extends Interfaces.SISO(y(start=y_start));
equation
  der(h) = v;
  der(v) = -g;

  when h <= 0 then
    reinit(v, -e * v);
  end when;
  
  der(x_scaled[2:nx]) = zeros(nx-1);
  der(x_scaled[1])    = (-a[2:na]*x_scaled + a_end*u)/a[1];
  annotation (
       Icon(
          graphics={
            Line(
              points={{-80.0,78.0},{-80.0,-90.0}},
              color={192,192,192}),
            Line2(
              points={{-80.0,78.0},{-80.0,-90.0}},
              color={line(a),192,192}),
            Line3(
              points={{-80.0,78.0},{-80.0,-90.0}},
              color={line(a),192,192}),
            Polygon(
              lineColor={192,192,192},
              fillColor={192,192,192},
              fillPattern=FillPattern.Solid,
              points={{-80.0,90.0},{-88.0,68.0},{-72.0,68.0},{-80.0,90.0}}
              )
          }
       )
    );
  encapsulated function bandPassAlpha "Return alpha for band pass"
    extends Modelica.Icons.Function;
	import Modelica;
	input Real a "Coefficient of s^1";
	input Real b "Coefficient of s^0";
	input Modelica.Units.SI.AngularVelocity w "Bandwidth angular frequency";
	output Real alpha "Alpha factor to build up band pass";
	end bandPassAlpha;
end BouncingBall;