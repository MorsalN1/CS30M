package twoormorevinthub;
import com.phidget22.*;
public class gettingstarted {

	//Add Phidgets Library

	
	    //Handle Exceptions 
	    public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalOutput redLED0 = new DigitalOutput();
	        DigitalOutput redLED1 = new DigitalOutput();

	        //Set VINT Hub | In addition to addressing your Phidgets, you will have to tell your program which VINT Hub the Phidget is connected to by setting the serial number located on the back of the VINT Hub.
	        redLED0.setDeviceSerialNumber(606191);
	        redLED1.setDeviceSerialNumber(605490);

	        //Address 
	        redLED0.setHubPort(1);
	        redLED0.setIsHubPortDevice(true);
	        redLED1.setHubPort(1);
	        redLED1.setIsHubPortDevice(true);

	        //Open 
	        redLED0.open(1000);
	        redLED1.open(1000);

	        //Use your Phidgets 
	        redLED0.setState(true);
	        redLED1.setState(true);
	        Thread.sleep(1000);
	        redLED0.setState(false);
	        redLED1.setState(false);
	    }
	}
	 

