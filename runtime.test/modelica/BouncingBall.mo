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
  annotation (
       Icon(
          graphics={
            Line(
              points={{-80.0,78.0},{-80.0,-90.0}},
              color={192,192,192}),
            Polygon(
              lineColor={192,192,192},
              fillColor={192,192,192},
              fillPattern=FillPattern.Solid,
              points={{-80.0,90.0},{-88.0,68.0},{-72.0,68.0},{-80.0,90.0}}
              )
          }
       )
    );
end BouncingBall;