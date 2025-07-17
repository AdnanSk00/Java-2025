package tka_may16_List_Set;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class C10_StudentListHW {
	public static void main(String[] args) {
		
		C08_Student s1 = new C08_Student(45, "Rohit", 264.8f);
		C08_Student s2 = new C08_Student(18, "Virat", 183.2f);
		C08_Student s3 = new C08_Student(56, "BaFILOFILObar", 198.6f);
		C08_Student s4 = null;
	
		List<C08_Student> studArrayList = new ArrayList<>();
				
		studArrayList.add(s1);
		studArrayList.add(s3);
		studArrayList.add(s2);
		studArrayList.add(s1);
		studArrayList.add(s4);		
		for(Object s : studArrayList) {
			System.out.println(s);
		}
		
		List<C08_Student> studLinkedList = new LinkedList<>();
		
		studLinkedList.add(s1);
		studLinkedList.add(s3);
		studLinkedList.add(s2);
		studLinkedList.add(s1);
		studLinkedList.add(s4);		
		for(Object s : studLinkedList) {
			System.out.println(s);
		}
		
		List<C08_Student> studVec= new Vector<>();
		
		studVec.add(s1);
		studVec.add(s3);
		studVec.add(s2);
		studVec.add(s1);
		studVec.add(s4);		
		for(Object s : studVec) {
			System.out.println(s);
		}
	}
}
