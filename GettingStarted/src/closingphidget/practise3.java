package closingphidget;

import com.phidget22.TemperatureSensor;

public class practise3 {
	public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        temperatureSensor.open();
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
    }
}
