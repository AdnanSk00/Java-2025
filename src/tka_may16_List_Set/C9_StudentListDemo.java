package tka_may16_List_Set;

import java.util.List;
import java.util.ArrayList;

public class C9_StudentListDemo {
	public static void main(String[] args) {
		
		C8_Student s1 = new C8_Student(45, "Rohit", 264.8f);
		C8_Student s2 = new C8_Student(18, "Virat", 183.2f);
		C8_Student s3 = new C8_Student(56, "Babar", 198.6f);
		C8_Student s4 = null;
	
//		System.out.println(s1);
		
		List<C8_Student> studArrayList = new ArrayList<>();
				
		studArrayList.add(s1);
		studArrayList.add(s3);
		studArrayList.add(s2);
		studArrayList.add(s1);
		studArrayList.add(s4);		
		for(Object s : studArrayList) {
			System.out.println(s);
		}
		
	}
}
