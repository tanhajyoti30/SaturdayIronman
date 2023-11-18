package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 doors");
		
	}

	@Override
	public String iEgine() {
		System.out.println("My car dual motor engines");
		return "Dual motor";
	}

	@Override
	public void icolor() {
		System.out.println("My car is Red");
		
	}

	@Override
	public int iwheel() {
		System.out.println("My car has 4 wheels");
		return 4;
	}

}
