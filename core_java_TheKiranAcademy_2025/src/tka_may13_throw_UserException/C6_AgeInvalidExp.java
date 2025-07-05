package tka_may13_throw_UserException;

public class C6_AgeInvalidExp extends Exception {
	
	static String msg = "Age should be > 0";
	
	public C6_AgeInvalidExp() {
		super(msg);
	}
	
	public C6_AgeInvalidExp(String s){
		super(s);
	}
}
