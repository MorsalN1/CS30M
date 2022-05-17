package lesson1;

import com.phidget22.DigitalOutput;

public class green {
	
	public static void main(String[] args) throws Exception{

        DigitalOutput greenLED = new DigitalOutput();

        greenLED.setHubPort(5);
        greenLED.setIsHubPortDevice(true);

        greenLED.open(1000);

        while(true){
            greenLED.setState(true);
            Thread.sleep(1000);
            greenLED.setState(false);
            Thread.sleep(1000);
        }
    }

}
