package org.texastorque;

import java.util.ArrayList;

import org.texastorque.subsystem.Drivebase;
import org.texastorque.subsystem.Subsystem;
import org.texastorque.torquelib.base.TorqueIterative;

public class Robot extends TorqueIterative{

	ArrayList<Subsystem> subsystems; 
	
	@Override
	public void robotInit() {
		subsystems = new ArrayList<>();
		subsystems.add(Drivebase.getInstance());
	}
	
	@Override
	public void autonomousInit() {
		
	}
	
	@Override
	public void autonomousPeriodic() {
		
	}
	
	@Override
	public void teleopInit() {
		
	}
	
	@Override
	public void teleopPeriodic() {
		
	}
	
}
