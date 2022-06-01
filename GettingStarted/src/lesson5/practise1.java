package lesson5;

import com.phidget22.HumiditySensor;
import com.phidget22.TemperatureSensor;

public class practise1 {
	
	public static void main(String[] args) throws Exception{

        //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Use your Phidgets 
        while(true){
        	if(humiditySensor.getHumidity()>30) {
        		System.out.println("Humidity: " + humiditySensor.getHumidity() +" %RH" );
                Thread.sleep(150);
        	}
        	else {
            System.out.println("Humidity is low ");
            Thread.sleep(150);
        	}
        	}
    }

}
