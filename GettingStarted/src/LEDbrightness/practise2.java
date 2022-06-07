package LEDbrightness;

import com.phidget22.DigitalOutput;

public class practise2 {
	public static void main(String[] args) throws Exception{

		double x=0;
        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        while(true) {
        redLED.setDutyCycle(x);
        x++;
        Thread.sleep(1000);
        redLED.setDutyCycle(0.0);
        }
    }
}
