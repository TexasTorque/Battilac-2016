package org.texastorque.input;

public class HumanInput extends Input{

	private static HumanInput instance;
	
	public HumanInput() {}
	
	@Override
	public void update() {}
	
	public static HumanInput getInstance() {
		return instance == null ? instance = new HumanInput() : instance;
	}
	
}
