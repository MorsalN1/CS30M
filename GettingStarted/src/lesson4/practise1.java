package lesson4;

import com.phidget22.TemperatureSensor;

public class practise1 {

	public static void main(String[] args) throws Exception{

		
        //Create 
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while (true) {
        	double m = (temperatureSensor.getTemperature())*1.8 + 32;
        	
            System.out.println("Temperature: " + m + " °C" );
            Thread.sleep(150);
        }
    }
	
}
