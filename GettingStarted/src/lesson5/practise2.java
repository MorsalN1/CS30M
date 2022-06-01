package lesson5;

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class practise2 {

	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
        	
        	if(temperatureSensor.getTemperature() > 21) {
        		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
                  Thread.sleep(150);	
        	}
        	else { 
            System.out.println("the room is to cold" );
            Thread.sleep(150);
        }
        	}
    }
	
}
