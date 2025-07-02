package tka_june5_stream_api;

import java.util.ArrayList;
import java.util.List;

//	1. Print Even nums from list

public class C1_EvenNumsfromList {
	public static void main(String[] args) {
		
		List<Integer> EvenNums = new ArrayList<>();
		EvenNums.add(12);
		EvenNums.add(1);
		EvenNums.add(2);
		EvenNums.add(5);
		EvenNums.add(8);
		EvenNums.add(6);
		for(Integer Even : EvenNums){		// 1. Iterate a List
			if(Even%2 == 0) {				// 2. apply condition - if()
				System.out.print(Even + " ");	// 3. action - print()
			}
		}
		System.out.println("-----------");
		
		// 		iterate	-->[6]		 if -->		[4] -- print
//		EvenNums.stream().filter(t-> t%2==0).forEach(System.out::println);
		EvenNums.stream().filter(t-> t%2==0).forEach(t->System.out.println(t));
	}
}
