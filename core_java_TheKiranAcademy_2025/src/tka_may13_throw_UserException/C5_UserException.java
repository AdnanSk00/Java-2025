package tka_may13_throw_UserException;

public class C5_UserException {
	public static void main(String[] args) throws C6_AgeInvalidExp{
		
		
		try {
			
			int age = -7;
			System.out.println("Exception made by user >>");
			
			if(age > 0) {
				int useDb = age;
				System.out.println(useDb);			
				throw new C7_NameInvalidExp("Durust naam tahreer kijiye");
			}
			else {
//				throw new C6_AgeInvalidExp("Achcha banaya");	// [Developer]
				throw new C6_AgeInvalidExp();
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("thanks...");
	}
}
