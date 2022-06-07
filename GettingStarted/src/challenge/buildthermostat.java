package challenge;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class buildthermostat {

	public static void main(String[] args) throws Exception {

		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		redButton.open(1000);
		redLED.open(1000);
		
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);
		greenButton.open(1000);
		greenLED.open(1000);
		
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);
        double m = temperatureSensor.getTemperature();
        //Use your Phidgets 
        while (true) {
     	if (greenButton.getState() == true) {
       // 		greenLED.setState(true);
        		Thread.sleep(1000);
	     //       greenLED.setState(false);
	    //        Thread.sleep(1000);
        		m++;
				System.out.println("Temperature: " + m + " °C" );
				} else {
				greenLED.setState(false);
			}
     	
     	if (redButton.getState() == true) {
    		//redLED.setState(true);
    		Thread.sleep(1000);
         //   redLED.setState(false);
        //    Thread.sleep(1000);
    		m--;
			System.out.println("Temperature: " + m + " °C" );
			} else {
			redLED.setState(false);
		}
        	
     	if(21<m && m<23){
     		greenLED.setState(true);
     	}
     	else {
     		redLED.setState(true);
     	}
        
		
		
		
        }
	}
}


