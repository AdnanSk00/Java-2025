package tka_april22_Interface;

//Abstract methods() - Utility classes - don't have child but static method()

public abstract class C2_TL implements C1_Manager{		// outer abstract class - def, pub
	
	// Both abstract & concrete mehtod
	// All scope - private, ... public
	// Constructor is present
	// All -- instance, final, static, static final (pure constant)
	
	int a;		// instance - global declaration
	final int b = 0;
	static int c;
	static final int d = 0;
	
	public C2_TL() {			// Constructor
	}
	
	@Override
	public void login() {
		System.out.println("TL - login");
	}

	@Override
	public void assignTask() {
		System.out.println("TL - assigns task");
	}
	
	@Override
	public abstract void coding();
	
	@Override
	public abstract void submitTask();
	
	abstract void trail();				// allowed - default abstract m();

//	private abstract void good();		// not allowed - private abstract method();
	private void good() {				// allowed -     private concrete method(){}
		
	}
	protected void bad() {				// allowed - 	 protected with concrete m(){}
		
	}
//	public void checkAbstractOrNot();	// not allowed - must indicate 'abstract'

}

// Manager class is interface having all methods as abstract and due to interface we can not add any concrete method in Manager class.
// Due to absence of concrete method in Manager, TL can't extends Manager but implements that interface Manager.	
// There is no rule to right abstract method compulsory if class is abstract but in opposite if class having abstract method so we will have to make class as abstract.



