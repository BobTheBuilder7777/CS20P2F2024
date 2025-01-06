import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;

public class TugOfWar {
	  public static void main(String[] args) throws Exception{
		  

	        DigitalInput redButtons = new DigitalInput();
	        DigitalOutput redLEDs = new DigitalOutput();
	        DigitalInput greenButtons = new DigitalInput();
	        DigitalOutput greenLEDs = new DigitalOutput();
	        
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
	        
	        int redCounted = 0, greenCounted = 0;
	        
	        while (greenCounted < 10 && redCounted <10) {
	        	if (redButtons.getState()) {
	        		redCounted++;  
	        		Thread.sleep(150);
	        	}
	        	if (greenButtons.getState()) {
	        		greenCounted++;
	        		Thread.sleep(150);
	        	}
	        	
	        }
	        	
	        
	        if (greenCounted >= 10 || redCounted >=10) {
	        	redLEDs.setState(true);
	            greenLEDs.setState(true);
	            Thread.sleep(400);
	            redLEDs.setState(false);
	            greenLEDs.setState(false);
	            Thread.sleep(400);
	        }
	        	
	        if (redCounted >= 10) {
	            for (int i = 0; i < 5; i++) {
	                redLEDs.setState(true);
	                Thread.sleep(300);
	                redLEDs.setState(false);
	                Thread.sleep(300);
	            }
	        } 
	        if (greenCounted >= 10) {
	     
	            for (int i = 0; i < 5; i++) {
	                greenLEDs.setState(true);
	                Thread.sleep(300);
	                greenLEDs.setState(false);
	                Thread.sleep(300);
	            }
	        }

	  }
}