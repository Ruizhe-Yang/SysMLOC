model BouncingBall
  parameter Real g = 9.81 "Gravity acceleration (m/s^2)";
  parameter Real e = 0.8  "Coefficient of restitution";

  Real h(start = 1.0, fixed=true) annotation(Evaluate=true, HideResult=true, choices(checkBox=true),
  	 Icon(coordinateSystem(preserveAspectRatio=true, extent={{-100.0,-100.0},{100.0,100.0}},
  	 	 extent2={{-100.0,-100.0},{100.0,100.0}}
  	 	 ,extent3={aa}//Line(points={{-80.0,78.0},{-80.0,-90.0}}, color={192,192,192}), aa={100.0,100.0}
  	 )));
  Real v(start = 0.0, fixed=true) "Velocity (m/s)";
equation
  der(h) = v;
  der(v) = -g;

  when h <= 0 then
    reinit(v, -e * v);
  end when;
end BouncingBall;
