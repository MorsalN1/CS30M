package smartphidget;

import com.phidget22.HumiditySensor;
import com.phidget22.HumiditySensorHumidityChangeEvent;
import com.phidget22.HumiditySensorHumidityChangeListener;
import com.phidget22.TemperatureSensor;
import com.phidget22.TemperatureSensorTemperatureChangeEvent;
import com.phidget22.TemperatureSensorTemperatureChangeListener;

public class gettingstarted {
public static void main(String[] args) throws Exception {
        
        //Create
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Humidity Event 
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });
        
        //Temperature Event 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Open
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(150);
        }
    }
}
