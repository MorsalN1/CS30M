package closingphidget;

import com.phidget22.TemperatureSensor;

public class practise1 {
	public static void main(String[] args) throws Exception{

	 TemperatureSensor temperatureSensor = new TemperatureSensor();

     //Open
     temperatureSensor.open(1000);

    
     //Close your Phidgets
    temperatureSensor.close();
    
  //Use your Phidgets
    System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
    
}
}