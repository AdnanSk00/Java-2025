package tka_april15_Inheritance;

public class C1_Person {
	
	int id;
	String name;
	int age;

	public C1_Person() {		// without argument - Constructor
		System.out.println("@@@@@@@");
	}

	public C1_Person(int id, String name, int age) {
//		this();					// call sibling - without argu Constructor
		System.out.println("# == id, name, age == #");
		this.id = id;
		this.name = name;
		this.age = age;
	}

}
