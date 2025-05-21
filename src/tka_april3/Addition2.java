package tka_april3;

public class Addition2 {
	public static void main(String[] args) {
		System.out.println("Welcome to My Application....");
		
		System.out.println("\n> Kid...3, 4 sum & avg");
		int link = sum(3, 4);
		calAvg(link);
		
		System.out.println("\n> AMZ-Lady ... 1000, 200 sum only");
		sum(1000, 200);
	}
	
	static int sum(int a, int b) {
		int c = a + b;
		System.out.println("Sum is : " + c);
		return c;
	}
	
	static void calAvg(int total) {
		double avg = total / 2.0;
		System.out.println("Avg is : " + avg);		
	}
}
