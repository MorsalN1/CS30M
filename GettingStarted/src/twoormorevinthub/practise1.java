package twoormorevinthub;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class practise1 {

	// Handle Exceptions
	public static void main(String[] args) throws Exception {

		// Create
		DigitalOutput redLED0 = new DigitalOutput();
		DigitalOutput redLED1 = new DigitalOutput();
		DigitalInput redButton0 = new DigitalInput();
		DigitalInput redButton1 = new DigitalInput();

		// Set VINT Hub | In addition to addressing your Phidgets, you will have to tell
		// your program which VINT Hub the Phidget is connected to by setting the serial
		// number located on the back of the VINT Hub.
		redLED0.setDeviceSerialNumber(606191);
		redLED1.setDeviceSerialNumber(605490);
		redButton0.setDeviceSerialNumber(606191);
		redButton1.setDeviceSerialNumber(605490);

		// Address
		redLED0.setHubPort(1);
		redLED0.setIsHubPortDevice(true);
		redLED1.setHubPort(1);
		redLED1.setIsHubPortDevice(true);
		redButton0.setHubPort(0);
		redButton0.setIsHubPortDevice(true);
		redButton1.setHubPort(0);
		redButton1.setIsHubPortDevice(true);

		// Open
		redLED0.open(1000);
		redLED1.open(1000);
		redButton0.open(1000);
		redButton1.open(1000);
		
		while (true) {
			if (redButton0.getState() == true) {

				redLED1.setState(true);
				redLED1.setState(false);
				Thread.sleep(150);

			}else if (redButton1.getState() == true) {

				redLED0.setState(true);
				redLED0.setState(false);
				Thread.sleep(150);

			}
		}
	}
}
