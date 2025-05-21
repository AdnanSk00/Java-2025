package tka_april4;

public class TestMobile {
	public static void main(String[] args) {
		
		Mobile user = new Mobile();
		
		user.name = "S22 Ultra";
		user.company = "Samsung";
		user.price = 140000;
		user.battery = 5000;
		user.warranty = "2 yrs" ;
		
		System.out.println("\n*** Mobile Details ***");
		System.out.println("Mobile Name : " + user.name);
		System.out.println("Company : " + user.company);
		System.out.println("Mobile Price : " + user.price);
		System.out.println("Battery backup : " + user.battery);
		System.out.println("Mobile warranty : " + user.warranty);
		
		user.update();
		user.game();
		user.battery();
	}
}
