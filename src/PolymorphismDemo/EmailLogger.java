package PolymorphismDemo;

public class EmailLogger extends BaseLoggger {
	   public void Log(String message) {
	    	System.out.println("Logged to Email"+message);
	    }
}
