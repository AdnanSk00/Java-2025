package tka_may16_List_Set;

import java.util.List;
import java.util.ArrayList;

public class C09_StudentListDemo {
	public static void main(String[] args) {
		
		C08_Student s1 = new C08_Student(45, "Rohit", 264.8f);
		C08_Student s2 = new C08_Student(18, "Virat", 183.2f);
		C08_Student s3 = new C08_Student(56, "Babar", 198.6f);
		C08_Student s4 = null;
	
//		System.out.println(s1);
		
		List<C08_Student> studArrayList = new ArrayList<>();
				
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
