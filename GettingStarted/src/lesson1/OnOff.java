package lesson1;

import com.phidget22.DigitalOutput;

public class OnOff {
	public static void main(String[] args) throws Exception{

        DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        redLED.open(1000);

        while(true){
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
            redLED.setState(true);
            Thread.sleep(1000);
            redLED.setState(false);
            Thread.sleep(1000);
        }
    }

}
