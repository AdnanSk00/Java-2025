package tka_april09_Constructor;

public class C2_Student {
	int id;
	String name;
	String course;
	float per;
	
	C2_Student(){
		System.out.println("--Default Constructor--");
	};
	
	C2_Student(int id, String name, String course, float per) {
		System.out.println("*** Welcome ***");	// R - Read/Display
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("Percentage : " + per + "\n");
	}
	
}
