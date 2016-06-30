package org.texastorque.output;

public class RobotOutput {

	private static RobotOutput instance;
	
	public RobotOutput() {}
	
	public static RobotOutput getInstance() {
		return instance == null ? instance = new RobotOutput() : instance;
	}
	
}
