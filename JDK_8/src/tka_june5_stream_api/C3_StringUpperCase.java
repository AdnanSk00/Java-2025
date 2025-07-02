package tka_june5_stream_api;

import java.util.ArrayList;
import java.util.List;

//	4. Print all Strings into UpperCase from List
// 	5. Print Count of Strings whose start from 'R' from List
//  6. Sort String List

public class C3_StringUpperCase {
	public static void main(String[] args) {
		
		int count = 0;
		List<String> UpperString = new ArrayList<>();
		UpperString.add("Adnan_Sk");
		UpperString.add("Consistency");
		UpperString.add("Rohit");
		UpperString.add("Rohit");
		UpperString.add("abd");
		UpperString.add("JavaScript");
		UpperString.add("Rishabh");
		UpperString.add("Roy");
		UpperString.add("MahaRASHTRra");
		for(String str : UpperString){
				System.out.println(str.toUpperCase());
		}
		System.out.println();
		for(String str : UpperString){
			if(str.startsWith("R")) {
				System.out.println(str + " ");
				count++;
			}
		}
		System.out.println("Count = " + count);
		
		System.out.println("-------------");
		
		UpperString.stream().map(t-> t.toUpperCase()).forEach(System.out::println);
		System.out.println();
//		UpperString.stream().map(t-> t.startsWith("R")).forEach(System.out::println);	// Boolean
		UpperString.stream().filter(t-> t.charAt(0)=='R').forEach(System.out::println);
		
		System.out.println("Count = " + UpperString.stream().filter(t-> t.charAt(0)=='R').count());
		
		System.out.println("-------------");
		
		UpperString.stream().sorted().forEach(System.out::println);
	}
}
