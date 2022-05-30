package lesson3;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class practise3 {
	 public static void main(String[] args) throws Exception{

	        //Create 
		 	int i=0;
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(1000);
	        redLED.open(1000);
	        greenButton.open(1000);
	        greenLED.open(1000);

	        //Use your Phidgets 
	        while(true){
	        	
	        		
	            if( redButton.getState()==true)
	            { 
	           i++;
	        	  System.out.println(i);
	        	 
	            
	            } 
	     
	            if(greenButton.getState()==true){
	            	 i++;
	            	 System.out.println(i);
	            } 

	            Thread.sleep(150);
	        }
	 }
}
