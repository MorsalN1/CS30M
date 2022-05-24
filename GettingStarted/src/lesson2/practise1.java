package lesson2;

import com.phidget22.DigitalInput;

public class practise1 {
	 public static void main(String[] args) throws Exception{
	        
	        //Create 
	        DigitalInput redButton = new DigitalInput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(5000);

	        //Use your Phidgets 
	        while(true){
	            System.out.println("Button State: " + redButton.getState());
	            Thread.sleep(150);
	        }
	    }
}
