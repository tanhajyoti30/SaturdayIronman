package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My car has Dual engine");
		return "Dual engine";
	}

	@Override
	public void icolor() {
		System.out.println("My car is red ");
		
	}

	@Override
	public int iwheel() {
		System.out.println("My car has 4 wheels");
		return 4;
	}

}
