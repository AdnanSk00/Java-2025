package tka_may19_Comparable_Comparator;

import java.util.Stack;

//Stack - LIFO (Last In First Out) or FILO

public class C2_StackDemo {
	public static void main(String[] args) {
		
		Stack stc = new Stack();
		stc.push(11);
		stc.push(22);
		stc.push(33);
		stc.push(44);
		
		while(!stc.empty()) {
			System.out.println(stc);
			stc.pop();		// romove - top
		}
	}
	
}
