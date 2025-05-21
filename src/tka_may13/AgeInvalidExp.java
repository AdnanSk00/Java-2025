package tka_may13;

public class AgeInvalidExp extends Exception {
	
	static String msg = "Age should be > 0";
	
	public AgeInvalidExp() {
		super(msg);
	}
	
	public AgeInvalidExp(String s){
		super(s);
	}
}
