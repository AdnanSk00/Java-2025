package tka_april04_Class;

public class C4_TestCustomerData {
	public static void main(String[] args) {
		// int a = 10;
		// System.out.println("I dont know what happend to me");
		// System.out.println("a : " + a);

		String s;
		s = "Java";
		s.toUpperCase();

		C3_Customer c1 = new C3_Customer();
		c1.name = "Adnan";
		c1.age = 22;
		c1.mob = 989586226;
		c1.email = "adnanshaikh31001@gmail.com";
		c1.gender = 'M';
		c1.adhaarId = "942098851800";
		c1.panCard = "OVJPS0056";
		c1.amount = 5000.00;

		System.out.println("*** Customer Details ***");
		System.out.println("Name : " + c1.name);
		System.out.println("Age : " + c1.age);
		System.out.println("Mobile : " + c1.mob);
		System.out.println("Email : " + c1.email);
		System.out.println("Gender : " + c1.gender);
		System.out.println("Adhaar Id : " + c1.adhaarId);
		System.out.println("Pan Card : " + c1.panCard);
		System.out.println("Balance : " + c1.amount);

		c1.deposite();
		c1.withDraw();
		c1.checkBal();
		c1.ApplyLoan();
		c1.deposite();
		c1.checkBal();
	}
}
