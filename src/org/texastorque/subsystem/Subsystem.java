package org.texastorque.subsystem;

public abstract class Subsystem {
	
	public Subsystem() {}
	
	public final void init() {}
	
	protected abstract void initSystem();
	
	public final void run() {}
	
	protected abstract void runSystem();
	
	protected abstract void output();
	
	public abstract void pushDashboard();
	

}
