package tka_may12_ExceptionHandling;

public class A {
	
	public static void main(String[] args) {
		
		MyWebsite ww = new MyWebsite();
		
		ww.login();
		ww.homepage();
		ww.delete();
		ww.veiwDetails();
		ww.update();
		ww.veiwDetails();
		ww.logout();
	}
}
