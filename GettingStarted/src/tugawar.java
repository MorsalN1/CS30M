import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class tugawar {
	public static void main(String[] args) throws Exception {
		
		DigitalInput redButton = new DigitalInput();
		DigitalOutput redLED = new DigitalOutput();
		DigitalInput greenButton = new DigitalInput();
		DigitalOutput greenLED = new DigitalOutput();

		// Address
		redButton.setHubPort(0);
		redButton.setIsHubPortDevice(true);
		redLED.setHubPort(1);
		redLED.setIsHubPortDevice(true);
		greenButton.setHubPort(5);
		greenButton.setIsHubPortDevice(true);
		greenLED.setHubPort(4);
		greenLED.setIsHubPortDevice(true);

		// Open
		redButton.open(1000);
		redLED.open(1000);
		greenButton.open(1000);
		greenLED.open(1000);

		while (true) {

			for(int i = 1; i<=10; i++) {
				redButton.getState() == true;
		            System.out.println(i);
			}
			
			/*
			while(redButton.getState() == true) {
				while(i<=10) {
					if( redButton.getState()){
		               
					System.out.println(i);
					i++;
					}
				}
				}
			*/
/*
			if (greenButton.getState() == true) {
				i++;
				System.out.println(i);
			}

			Thread.sleep(150);
		}
*/
}
}
}