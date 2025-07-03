package tka_may12_ExceptionHandling;

public class C2_TestMyWebsite {
	
	public static void main(String[] args) {
		
		C1_MyWebsite ww = new C1_MyWebsite();
		
		ww.login();
		ww.homepage();
		ww.delete();
		ww.veiwDetails();
		ww.update();
		ww.veiwDetails();
		ww.logout();
	}
}
