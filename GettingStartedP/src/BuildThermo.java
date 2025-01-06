import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class BuildThermo {
	
	public static void main(String[] args) throws Exception{
		  
		
	      DigitalInput redButtons = new DigitalInput();
	      DigitalOutput redLEDs = new DigitalOutput();
	      DigitalInput greenButtons = new DigitalInput();
	      DigitalOutput greenLEDs = new DigitalOutput();
	      TemperatureSensor tempSensor = new TemperatureSensor();
	        
	       
	      redButtons.setHubPort(0);
	      redButtons.setIsHubPortDevice(true);
	      redLEDs.setHubPort(1);
	      redLEDs.setIsHubPortDevice(true);
	      greenButtons.setHubPort(5);
	      greenButtons.setIsHubPortDevice(true);
	      greenLEDs.setHubPort(4);
	      greenLEDs.setIsHubPortDevice(true);
	        
	       
	      redButtons.open(1000);
	      redLEDs.open(1000);
	      greenButtons.open(1000);
	      greenLEDs.open(1000);
	      tempSensor.open(1000);
	        
	     
	      int Temp = 21; //set temp variable
	        
	      double CurrentTemp = tempSensor.getTemperature(); //current temp variable
	  
	        while (true) {
	        	
	        	for (int i = 0; i <100; i++) {
	        	
	        	
	        if (greenButtons.getState()) {
        		Temp++;
        		 System.out.println("The temperature has been increased to: "+ Temp + "°C");
        		 while (greenButtons.getState()) {
	                    Thread.sleep(10);
	                } 
        	}
	       
	        if (redButtons.getState()) {
        		Temp--;
        		System.out.println("The temperature has been decreased to: "+ Temp + "°C");
        		while (redButtons.getState()) {
                    Thread.sleep(10);
                }
        	}

	      
	       
	        if (Math.abs(CurrentTemp - Temp) <= 2) {
		         greenLEDs.setState(true);
		         redLEDs.setState(false);
	        }
	        else {
	        	greenLEDs.setState(false);
		         redLEDs.setState(true);
	        }  
                Thread.sleep(100); 
	        	}
	        
        	System.out.println("The current temperature is: " + CurrentTemp + "°C");
        	System.out.println("The temperature that has been set is: "+ Temp + "°C");
        	
	        }  
	}
}