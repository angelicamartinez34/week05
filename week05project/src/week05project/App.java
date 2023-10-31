package week05project;

import week05project.Interface.Logger;

public class App {

	// created a class called App with an main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instantiated logger classes 
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		
		// this will test the error methods on the classes
		asteriskLogger.log("AsteriskLogger log method!!!");
		
		asteriskLogger.error("asteriskLogger error!!");
		
		
		spacedLogger.log("SpacedLogger log method!!!!!!!!");
		
		spacedLogger.error("spacedLogger error!!");
	}

}
