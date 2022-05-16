import com.phidget22.*;

public class gettingstarted {

	
	    public static void main(String[] args) throws Exception{

	        DigitalOutput greenLED = new DigitalOutput();

	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        greenLED.open(5000);

	      
	            greenLED.setState(true);
	            Thread.sleep(5000);
	            greenLED.setState(false);
	       
	        }
	    
	}
	  
