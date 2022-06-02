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
		
		//Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
        	
        	if (redButton.getState() == true) {
        		double m = temperatureSensor.getTemperature();
				redLED.setState(true);
				System.out.println("Temperature: " + m + " °C" );
				m++;
			} else {
				redLED.setState(false);
			}
        	/*while (redButton.getState() == true) {
        		
				//redLED.setState(true);
				double x =m+1;
				System.out.println("Temperature: " + x + " °C" );
			*/} 
        	/*else {
				redLED.setState(false);
			}
			*/
            //System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
           // Thread.sleep(150);
        }
		
		
		
	}

