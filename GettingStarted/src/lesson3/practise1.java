package lesson3;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class practise1 {
	public static void main(String[] args) throws Exception{

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(false);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(false);
     

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        //Use your Phidgets 
        while(true){

            if( redButton.getState()){
                redLED.setState(false);
            } else {
                redLED.setState(true);
            }

            if(greenButton.getState()){
                greenLED.setState(false);
            } else {
                greenLED.setState(true);
            }

            Thread.sleep(150);
        }
    }
}
