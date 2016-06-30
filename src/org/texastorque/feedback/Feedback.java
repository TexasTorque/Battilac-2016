package org.texastorque.feedback;

public class Feedback {

	private static Feedback instance;

	public Feedback() {
		
	}
	
	public void update() {
		
	}
	
	public static Feedback getInstance() {
		return instance == null ? instance = new Feedback() : instance;
	}
	
}
