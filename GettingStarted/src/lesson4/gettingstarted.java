package lesson4;

import com.phidget22.TemperatureSensor;

public class gettingstarted {
	
	public static void main(String[] args) throws Exception{

        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
            System.out.println("Temperature: " + temperatureSensor.getTemperature() + " �C" );
            Thread.sleep(150);
        }
    }

}
