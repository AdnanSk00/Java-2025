package tka_may30_State_prepStatement;

import java.util.ArrayList;
import java.util.List;

public class C7_TestListStudent {
	public static void main(String[] args) {
		
		List<C6_Student> studList = new ArrayList<>();
		studList.add(new C6_Student(10, "Shami", 87.34f));
		studList.add(new C6_Student(20, "Rahul", 74.0f));
		studList.add(new C6_Student(30, "Head",  68.29f));
		studList.add(new C6_Student(40, "Lyon",  49.03f));
		
//		studList.forEach(t -> System.out.println(t));
		studList.forEach(System.out::println);		// print on console
		
		// insert into DB
		
	}
}
