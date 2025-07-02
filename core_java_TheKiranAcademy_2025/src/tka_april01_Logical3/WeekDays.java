package tka_april01_Logical3;

public class WeekDays {
	public static void main(String[] args) {
		
		int day = 5;
		
		switch(day) {
		
			case 1 :		
				System.out.println(day + " : MON");
				break;
			case 2 :
				System.out.println(day + " : TUE");
				break;
			case 3 :
				System.out.println(day + " : WED");
				break;
			case 4 :
				System.out.println(day + " : THU");			
				break;
			case 5 :
				System.out.println(day + " : FRI");
				break;
			case 6 :
				System.out.println(day + " : SAT");
				break;
			case 7 :
				System.out.println(day + " : SUN");
				break;
			default :
				System.out.println(day + " Out of Week Days...");				
				break;
		}
	}
}
