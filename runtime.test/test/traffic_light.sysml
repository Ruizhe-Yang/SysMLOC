package Traffic_light {
    
    public import ISQ::*;
    public import ISQBase::*;
    public import Time::*;
    public import ScalarValues::*;
    public import StringFunctions::*;
    public import NumericalFunctions::*;
    public import ScalarValues::*;
    public import SI::*;
    
    port def Can_bus;
    port def Clock;
    port def Vehicle_sensor_port;
    port def Comm;
    
    enum def Light_state {
                lit;
                off;
                blinking;
                }
                      
    calc def Light_power { in light_state : Light_state;
           return : PowerValue = 
                     if light_state == Light_state::off ? 0 [W]
                        else if light_state == Light_state::lit ? 12 [W]
                        else if light_state == Light_state::blinking ? 8 [W]
                        else 0 [W];
           }
           
    calc def Radio_power { in radio_on : Boolean;
           return : PowerValue = 
                     if radio_on ? 4 [W]
                     else 0 [W];
           }
    calc light_power : Light_power;
    calc radio_power : Radio_power;
    
    
    constraint def MassConstraint {
        in partMasses : MassValue[0..*];
        in massLimit : MassValue;
            sum(partMasses) <= massLimit
            }
    assert constraint massConstraint : MassConstraint {
            in partMasses = (light_housing.mass, traffic_light_controller.mass, traffic_light_counter.mass, traffic_light_radio.mass);
            in massLimit = 25.0 [kg];
        }  
            
    constraint def PowerConstraint {
        in partPowers : PowerValue[0..*];
        in powerLimit : PowerValue;
            sum(partPowers) <= powerLimit
            }

    assert constraint powerConstraint : PowerConstraint {
            in partPower = (light_housing.light_inserts.green_light.power_usage,
                            light_housing.light_inserts.yellow_light.power_usage,
                            light_housing.light_inserts.red_light.power_usage,
                            light_housing.light_electronic_housing.power_usage,
                            traffic_light_controller.power_usage,
                            traffic_light_counter.power_usage,
                            traffic_light_radio.power_usage);                                       
            in powerLimit = 19.0 [W];
        }

    interface def vehicle_sensor_signal {
            end vehicle_sensor_out : Vehicle_sensor_port;
            end vehicile_sensor_in : ~Vehicle_sensor_port;
            }
    
    interface def clock_bus {
            end clock_out : Clock;
            end clock_in : ~Clock;
            }
    interface def comm_bus {
            end communications_out : Comm;
            end communications_in : ~Comm;
            }
    interface def light_control_bus {
            end light_control_out : Can_bus;
            end light_control_in : ~Can_bus;
            }  
            
    item def Power;
    item def state_message_item {
        attribute state_message : String;
    }
    port power_on;
    
    part def Light_housing {
        attribute mass : MassValue;
        part light_inserts [3]{
            attribute mass : MassValue;
        }
    }
    part def Light_electronics_housing {
        attribute mass : MassValue;
        attribute power_usage : PowerValue;
    }
    part def light {
        attribute color;
        attribute light_state : Light_state;
        attribute location : Integer;
        attribute mass : MassValue;
        attribute power_usage : PowerValue;
        port light_control_in : Can_bus;
        } 
    part light_housing {   
        attribute mass :>> mass = 3.0 [kg];
        part light_electronic_housing : Light_electronics_housing {
            attribute mass :>> mass = 3.0 [kg];
            attribute power_usage :>> power_usage = 0.2 [W];
        }
        
    part def light_insert {
        attribute mass : MassValue;
        part red_light : light;
        part yellow_light : light;
        part green_light : light;
    }
        part light_inserts [3] : light_insert {
            attribute mass :>> mass = 3.0 [kg];
            part red_light :>> red_light {
                attribute red :>> color;
                attribute location :>> location =  0;
                attribute :>> light_state = Light_state::off;
                attribute mass :>> mass = 4.0 [kg];
                attribute power_usage :>> power_usage = light_power(light_housing.light_inserts.red_light.light_state);


            }
            part yellow_light :>> yellow_light {
                attribute yellow :> color;
                attribute location :>> location =  1;
                attribute :>> light_state = Light_state::off;
                attribute mass :>> mass = 4.0 [kg];
                attribute power_usage :>> power_usage = light_power(light_housing.light_inserts.yellow_light.light_state);

            }
            part green_light :>> green_light {
                attribute green :> color;
                attribute location :>> location =  2;
                attribute :>> light_state = Light_state::off;
                attribute mass :>> mass = 4.0 [kg];
                attribute power_usage :>> power_usage = light_power(light_housing.light_inserts.green_light.light_state);

            }

        }
    }
    part def Controller {
        attribute power : Boolean;
        attribute error : Boolean;
        attribute error_code : Integer;
        attribute message_queue : String;
        attribute counter : Integer;
        attribute current_time : TimeInstantValue;
        attribute state_duration : DurationValue;
        attribute wait_duration : Natural;
        attribute yellow_on_time : Natural;
        attribute green_on_time : Natural;
        attribute red_on_time : Natural;
        attribute yellow_light_state : Light_state;
        attribute red_light_state : Light_state;
        attribute green_light_state : Light_state;
        port light_control_out : Can_bus;
        port communications_in : Comm;
        attribute mass : MassValue;
        attribute power_usage : PowerValue;
        
    }
    part def Vehicle_sensor{
        attribute vehicle_at_light : Boolean;
    }
    part def Counter {
        attribute register : Integer;
        attribute mass : MassValue;
        attribute power_usage : PowerValue;
    }
    part def Radio {
        attribute register : Integer;
        port communications_out : Comm;
        attribute trans : Boolean;
        attribute mass : MassValue;
        attribute power_usage : PowerValue;
    }
    part vehicle_sensor : Vehicle_sensor {
        port vehicle_sensor_out : Vehicle_sensor_port;
    }
    part traffic_light_controller : Controller{
            attribute yellow_on_time :>> yellow_on_time =  2 [s];
            attribute green_on_time :>> green_on_time =  30 [s];
            attribute red_on_time :>> red_on_time =  90 [s];
            attribute mass :>> mass = 0.8 [kg];
            attribute power :>> power = 2.0 [W];

            action power_up_test;
            action reset_wait_clk{
                      assign wait_duration := 0 [s];
                      }
            
            
            action turn_lights_off {
                      assign traffic_light_controller.green_light_state := Light_state::off;
                      assign light_housing.light_inserts.green_light.light_state := Light_state::off;
                      assign traffic_light_controller.yellow_light_state := Light_state::off;
                      assign light_housing.light_inserts.yellow_light.light_state := Light_state::off;
                      assign traffic_light_controller.red_light_state := Light_state::off;
                      assign light_housing.light_inserts.red_light.light_state := Light_state::off;
                      assign traffic_light_radio.trans := false;
            }            

            action turn_yellow_on {
                      perform action turn_lights_off;
                      perform action reset_wait_clock;
                      assign traffic_light_controller.yellow_light_state := Light_state::lit;
                      assign light_housing.light_inserts.yellow_light.light_state := Light_state::lit;
                      }
            action turn_green_on {
                      perform action turn_lights_off;
                      perform action reset_wait_clock;
                      assign traffic_light_controller.green_light_state := Light_state::lit;
                      assign light_housing.light_inserts.green_light.light_state := Light_state::lit;
                      }
            action turn_red_on {
                      perform action turn_lights_off;
                      perform action reset_wait_clock;
                      assign traffic_light_controller.red_light_state := Light_state::lit;
                      assign light_housing.light_inserts.red_light.light_state := Light_state::lit;
                      }

            action reset_error;
            action reset_wait_clock;

            action run_diagnostic{
                action update_error_code;
                action update_error;
                action send_error_sms {
                        assign traffic_light_radio.trans := true;
                        }
                }
            action check_status{
                action check_error;
                action read_message_queue{
                    attribute message_from_queue : String;
                }
                }
            action blink_red_light {
                      perform action turn_lights_off;
                      assign traffic_light_controller.red_light_state := Light_state::blinking;
                      assign light_housing.light_inserts.red_light.light_state := Light_state::blinking;
                      }
            action blink_yellow_light {
                      assign traffic_light_controller.yellow_light_state := Light_state::blinking;
                      assign light_housing.light_inserts.yellow_light.light_state := Light_state::blinking;
                      }
        
            port clock_in : Clock;
            port vehicle_sensor_in :Vehicle_sensor_port;
            }
       part traffic_light_counter : Counter{
            port clock_out : Clock;
            attribute mass :>> mass = 0.4 [kg];
            attribute power_usage :>> power_usage = 0.4 [W];
         }
       part traffic_light_radio : Radio{
            attribute mass :>> mass = 0.6 [kg];
            attribute trans :>> trans = false;
            attribute power_usage :>> power_usage = radio_power(traffic_light_radio.trans); 
         }
   
state traffic_light{
            entry;
            succession begin first start
                then off;    
                
            transition off_to_init
                first off 
                accept Power via power_on
                then init; 
                
            transition init_to_diagnostic
                first init
                accept when (traffic_light_controller.error == true)
                then diagnostic;
                
            transition diagnostic_to_red_blinking
                first diagnostic
                then red_blinking;

            transition operation_selection_to_init
                first operation_selection
                accept when (traffic_light_controller.error == true)
                then init;

            transition init_to_operation_selection
                first init
                accept when (traffic_light_controller.error == false)
                then operation_selection;
            
            transition operation_selection_to_stop_sign
                first operation_selection
                accept when ((traffic_light_controller.message_queue == "operating_mode.stop_sign")
                        and (traffic_light_controller.error == false))
                then stop_sign;  

            transition operation_selection_to_caution
                first operation_selection
                accept when ((traffic_light_controller.message_queue == "operating_mode.caution") 
                        and (traffic_light_controller.error == false))
                then caution;
                
            transition operation_selection_to_traffic_flow
                first operation_selection
                accept when ((traffic_light_controller.message_queue == "operating_mode.traffic_flow") 
                        and (traffic_light_controller.error == false))
                then traffic_flow;
            
            transition caution_to_yellow_blinking
                first caution
                then yellow_blinking;
                
            transition stop_sign_to_red_blinking
                first stop_sign
                then red_blinking;
                
            transition traffic_flow_to_red_on
                first traffic_flow
                accept when (traffic_light_controller.error == false)
                then red_on;

            transition red_on_to_green_on
                first red_on
                accept when (traffic_light_controller.wait_duration > traffic_light_controller.red_on_time) 
                        and (vehicle_sensor.vehicle_at_light == true)
                        and (traffic_light_controller.message_queue == "Safe_all_red")
                        and (traffic_light_controller.error == false)
                then green_on;
                
            transition red_on_to_traffic_flow
                first red_on
                accept when ((((traffic_light_controller.message_queue != "")
                        and (traffic_light_controller.message_queue != "Safe_all_red"))
                        or (traffic_light_controller.error == true)))
                then traffic_flow; 

            transition green_on_to_yellow_on
                first green_on
                accept when  (traffic_light_controller.wait_duration > traffic_light_controller.green_on_time
                        or (traffic_light_controller.error == true))
                then yellow_on;

            transition yellow_on_to_red_on
                first yellow_on
                accept when (traffic_light_controller.wait_duration > traffic_light_controller.yellow_on_time)
                then red_on;

            transition traffic_flow_to_operation_selection
                first traffic_flow
                accept when ((traffic_light_controller.message_queue != "")
                        or (traffic_light_controller.error == true))
                then operation_selection;    
                
            transition red_blinking_to_operation_selection
                first red_blinking
                accept when ((traffic_light_controller.message_queue != "")
                        or (traffic_light_controller.error == true))
                then operation_selection;
                
            transition yellow_blinking_to_operation_selection
                first yellow_blinking
                accept when ((traffic_light_controller.message_queue != "")
                        or (traffic_light_controller.error == true))
                then operation_selection;

    }      
             state off;
                
             state init{
                    entry traffic_light_controller.power_up_test;
                    do traffic_light_controller.check_status.check_error;
                    exit;
                    }
                    
             state diagnostic {
                    entry traffic_light_controller.run_diagnostic;
                    exit traffic_light_controller.reset_error;
                    }
                
             state operation_selection{
                    entry traffic_light_controller.check_status.check_error;
                    do traffic_light_controller.check_status;
                    exit;
                    }
             state stop_sign;
             
             state red_blinking {
                    entry traffic_light_controller.blink_red_light;
                    do traffic_light_controller.check_status.check_error;
                    exit;
                    }
                
                
             state caution;
             
             state yellow_blinking {
                    entry traffic_light_controller.blink_yellow_light;
                    do traffic_light_controller.check_status; 
                    exit;
                    }
                
             state traffic_flow {
                    entry traffic_light_controller.check_status;
                    exit;
                }
             
             state green_on {
                    entry traffic_light_controller.turn_green_on; 
                    do traffic_light_controller.check_status;
                    exit;
                }
                
             state yellow_on {
                     entry traffic_light_controller.turn_yellow_on;
                     do traffic_light_controller.check_status.check_error;
                     exit;
                }
             
             state red_on {
                     entry traffic_light_controller.turn_red_on;
                     do traffic_light_controller.check_status;
                     exit;
                }
            
    interface : clock_bus connect
            traffic_light_counter.clock_out to
            traffic_light_controller.clock_in;
    interface : vehicle_sensor_signal connect
            vehicle_sensor.vehicle_sensor_out to
            traffic_light_controller.vehicle_sensor_in;     
    interface : light_control_bus connect
            traffic_light_controller.light_control_out to
            light_housing.light_inserts.red_light.light_control_in;
    interface : light_control_bus connect
            traffic_light_controller.light_control_out to
            light_housing.light_inserts.yellow_light.light_control_in;
    interface : light_control_bus connect
            traffic_light_controller.light_control_out to
            light_housing.light_inserts.green_light.light_control_in;

}