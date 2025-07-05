package tka_june3_stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//	2. Generate List only Even nums from another List
//	3. Print Count Even nums from List

public class C2_EvenNumsfromAnotherList {
	public static void main(String[] args) {
		
		List<Integer> EvenNums = new ArrayList<>();
		EvenNums.add(12);
		EvenNums.add(1);
		EvenNums.add(2);
		EvenNums.add(5);
		EvenNums.add(8);
		EvenNums.add(6);
		EvenNums.add(22);
		
		List<Integer> EvenNumsFromAnother = new ArrayList<>(EvenNums);
		int count = 0;
		for(Integer Even : EvenNumsFromAnother){
			if(Even%2 == 0) {
				System.out.print(Even + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count = " + count);
		
		System.out.println("-----------");
		
//		List<Integer> EvenAnother = EvenNums.stream().filter(t-> t % 2 == 0).toList();
		List<Integer> EvenAnother = EvenNums.stream().filter(t-> t % 2 == 0).collect(Collectors.toList());
		EvenAnother.forEach(System.out::println);
		
//		long count2 = EvenNums.stream().filter(t-> t%2==0).count();
//		System.out.println("Count = " + count2);
		System.out.println("Count = " + EvenNums.stream().filter(t-> t%2==0).count());
		
	}
}
