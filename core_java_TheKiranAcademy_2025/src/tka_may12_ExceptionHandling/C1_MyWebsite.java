package tka_may12_ExceptionHandling;

public class C1_MyWebsite {

	public void login() {
		System.out.println("1. Login...");
	}

	public void homepage() {
		System.out.println("2. Homepage...");
	}

	public void delete() {
		System.out.println("> in delete api");			
//		try {
			int a = 1 / 0;		// orderId = 0
			System.out.println("2.2. deleted success...");			
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}
	public void veiwDetails() {
		System.out.println("3. View Details...");
	}

	public void update() {
		System.out.println("4. Update...");
	}

	public void logout() {
		System.out.println("5. Logout...");
	}

}
