package Packets{
	private import ScalarValues :: *;
	private import Time::DateTime;
	attribute 'packet header';
	attribute 'packet data field'{
		attribute 'packet secondary header' :>> 'packet header';
		attribute 'user data field';
	}
	part def 'Data Packet'{
		attribute 'packet primary header' :>> 'packet header'{
			attribute 'packet version number' : Integer;
			attribute 'packet identification' : String;
			attribute 'packet data length' : Integer;
		}
		attribute :>> 'packet data field';
	}
	part def 'Thermal Data Packet' : 'Data Packet'{
		attribute 'packet data field' :>> Packets::'packet data field'{
			attribute 'packet secondary header' :>> 'packet header'{
				attribute 'packet timestamp' : DateTime;
				attribute 'telemetry packet type' : String;
			}
			attribute 'user data field' :>> Packets::'packet data field'::'user data field'{
				attribute timestamp : DateTime;
				attribute temperature : Real;
			}
		}
	}
}
