package tka_april07_Object_Function;

public class C2_Student {
	int id;
	String name;
	String course;
	float per;
	
	// CRUD -
	// C - Create
	// R - Read
	// U - Update
	// D - Delete
	
	void accept(int id, String name, String course, float per) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	void display() {
		System.out.println("\n*** Student Details ***");	// R - Read/Display
		System.out.println("Roll No : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Percentage : " + per);
	}
}
