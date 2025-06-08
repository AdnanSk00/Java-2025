package tka_may13_Throw_Throws;

public class AgeInvalidExp extends Exception {
	
	static String msg = "Age should be > 0";
	
	public AgeInvalidExp() {
		super(msg);
	}
	
	public AgeInvalidExp(String s){
		super(s);
	}
}
