package week05project;

import week05project.Interface.Logger;

public class SpacedLogger implements Logger {

	// made the spaced logger class to implement the logger interface 
	public void log(String message) {
		
		String spacedMessage = String.join(" " , message.split(" "));
		System.out.println(spacedMessage);
	}
	// added another message but this takes the 'message' string and splits each character with a space 
	public void errorMessage(String errorMessage) {
		
		String spacedErrorMessage = String.join(" ", "ERROR:" + errorMessage.split(" "));
		System.out.println(spacedErrorMessage);
	}
// added a message that prints out the string but has "ERROR at the beginning
	
	@Override
	public void error(String errorMessage) {
		// TODO Auto-generated method stub
		
	}
}
