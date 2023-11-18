package com.upskill.java_5;

public interface Interface {
	
	//interface can have only abstract methods
	
	// abstract method doesn't have any implementation
	
	//abstraction is oops concept of hiding implementation
	
	public abstract void iDoor();
	
	public abstract String iEngine();
	
	public abstract void icolor();
	
	public abstract int iwheel();
	
}
/*
 (Parent)			(keyword)	(child)			(keyword)	(Grandchild)	
 Class				extends		class
 Abstract Class(+2)	extends		class(-2=0)		extends		 extends
 Interface(+2)		implements	class(-2=0)
 Interface(+2)		extends		interface(2+2=+4)
*/