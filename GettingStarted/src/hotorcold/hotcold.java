package hotorcold;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.HumiditySensor;
import com.phidget22.PhidgetBase;
import com.phidget22.TemperatureSensor;

public class hotcold {
	public static void main(String[] args) throws Exception {

	        
		// Create
		HumiditySensor humiditySensor = new HumiditySensor();
		TemperatureSensor temperatureSensor = new TemperatureSensor();

		// Open
		humiditySensor.open(1000);
		temperatureSensor.open(1000);
		

		DigitalOutput greenLED = new DigitalOutput();
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		greenLED.open(1000);
		DigitalOutput redLED = new DigitalOutput();
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);
        

  
		
		// Use your Phidgets
		if(true) {
			if (24 > temperatureSensor.getTemperature() && temperatureSensor.getTemperature() > 20) {
				System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C");
				 while(true){
					 greenLED.setState(true);
			         
			           
				 }
				
			} else {
				System.out.println("the room is to cold");
				Thread.sleep(150);
				while(true){
					 redLED.setState(true);
			}
		}
	}
	}
}
