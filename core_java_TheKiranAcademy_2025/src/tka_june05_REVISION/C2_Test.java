package tka_june05_REVISION;

import java.util.List;

public class C2_Test {
	public static void main(String[] args) {
		
		C3_Emp e = new C3_Emp(101, "Raj");
//		System.out.println(e);
		
//		List<Integer> l;	// List<> ==> <Integer> --> <E>
//		l.add(11);			// .add() ==> <Integer e> --> <E e>

		C1_MyClass<Integer> nums = new C1_MyClass();
		nums.scanData(5);		// .add()
		nums.scanData(10);
//		nums.scanData("hello");		// error
		nums.scanData(15);
		
		C1_MyClass<String> names = new C1_MyClass();
		names.scanData("java");
		names.scanData("js");
		names.scanData("cpp");
//		names.scanData(123);
		
		C1_MyClass<C3_Emp> emps = new C1_MyClass();
		emps.scanData(e);
//		emps.scanData(5);
//		emps.scanData("java");
		
	}
}
