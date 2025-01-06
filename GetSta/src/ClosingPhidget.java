
//Add Phidgets Library
import com.phidget22.*;

public class ClosingPhidget {
    public static void main(String[] args) throws Exception{

        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + "°C" );
        
        //Close your Phidgets
        temperatureSensor.close();
        System.out.println("The temperature sensor is closed.");
        
        System.out.println("");
       
        
        temperatureSensor.open(1000);
        System.out.println("The Temperature is: " + temperatureSensor.getTemperature() + "°C");
    }
}
  