package org.texastorque.subsystem;

public class Drivebase extends Subsystem{

	private static Drivebase instance = null;
	
	@Override
	protected void initSystem() {
	}
	
	@Override
	public void runSystem() {
	}
	
	@Override
	public void output() {
	}

	@Override
	public void pushDashboard() {
	}

	public static Drivebase getInstance() {
		return instance == null ? instance = new Drivebase() : instance;
	}

}
