import com.phidget22.*;

public class HotOrCold {
	
	 public static void main(String[] args) throws Exception{
		 
	    TemperatureSensor tempSensor = new TemperatureSensor();
	        
	    DigitalOutput redLED = new DigitalOutput();
	    DigitalOutput greenLED = new DigitalOutput();
	        
	    redLED.setHubPort(1);
	    redLED.setIsHubPortDevice(true);
	    greenLED.setHubPort(4);
	    greenLED.setIsHubPortDevice(true);
	     
	    tempSensor.open(1000);
	    redLED.open(1000);
	    greenLED.open(1000);
	        
while (true) {
	
			System.out.println("The temperature is: " + tempSensor.getTemperature() + "°C");
			Thread.sleep(350);
			
	        
	        if (24 < tempSensor.getTemperature()|| 20 > tempSensor.getTemperature()  ) {
	        	  greenLED.setState(true);
	        	  redLED.setState(false);
	        }
	        
	        else {
	        	redLED.setState(true);
	        	greenLED.setState(false);
	        	
	        }
	        
}
	 }
}
