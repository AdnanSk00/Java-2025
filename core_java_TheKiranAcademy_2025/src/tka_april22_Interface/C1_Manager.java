package tka_april22_Interface;

//Interfacte - 3rd party API
 
public interface C1_Manager{		// outer interface - def, pub
	// Blueprint of class
	// only abstract methods
	// only public scope
	// Can not have Constructor 
	// Data members only - public static final
	
	int a = 0;		// byDefault - public static final int a = 0;				
	int b = 0;
	int c = 0;
	int d = 0;
	
//	abstract void login();
	void login();			// byDefault public abstract - interface
	
	void assignTask();
	
	void coding();
	
	void submitTask();
	
//	void tasting() {
//		Manager has to write code...
//	}
//	void testing();

}
