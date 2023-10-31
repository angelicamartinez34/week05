package week05project;

import week05project.Interface.Logger;

// made the asterisk logger class to implement the logger interface
public class AsteriskLogger implements Logger {

	
	public void log(String message) {
		
		String stringMessage = "***" + message + "***";
		System.out.println(stringMessage);
	}
	// added a message that will print out the string with asterisks
	
	
	public void error(String errorMessage) {
		
		System.out.println("****************");
        System.out.println("***Error: " + errorMessage + "***");
        System.out.println("****************");
	
        // added an error message print out 
	}
	}
