package lesson1;

import com.phidget22.DigitalOutput;

public class twoseconds {
	public static void main(String[] args) throws Exception{

        DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        redLED.open(2000);

        while(true){
            redLED.setState(true);
            Thread.sleep(2000);
            redLED.setState(false);
            Thread.sleep(2000);
        }
    }

}
