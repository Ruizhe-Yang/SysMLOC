model BouncingBall
  parameter Real g = 9.81 "Gravity acceleration (m/s^2)";
  parameter Real e = 0.8  "Coefficient of restitution";

  Real h(start = 1.0, fixed=true) "Height (m)";
  Real v(start = 0.0, fixed=true) "Velocity (m/s)";
equation
  der(h) = v;
  der(v) = -g;

  when h <= 0 then
    reinit(v, -e * v);
  end when;
end BouncingBall;
