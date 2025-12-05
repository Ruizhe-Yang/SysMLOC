package 'Enumeration Definitions-1'{
	private import ScalarValues::Real;
	enum def TrafficLightColor{
		green;
		yellow;
		red;
	}
	part def TrafficLight{
		attribute currentColor : TrafficLightColor;
	}
	part def TrafficLightGo : TrafficLight{
		attribute :>> currentColor = TrafficLightColor::green;
	}
}
