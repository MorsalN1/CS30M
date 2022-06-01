package hotorcold;

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class hotcold {
	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        if(true){
        	
        	if(24 > temperatureSensor.getTemperature() && temperatureSensor.getTemperature() > 20 ) {
        		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        		  greenLED.setState(true);
					Thread.sleep(50);
                
        	}
        	else { 
            System.out.println("the room is to cold" );
            Thread.sleep(150);
        }
        	}
    }
}
