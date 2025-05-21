package tka_april15;

public class Student extends Person {

//	id, name, age
	String course;
	float per;

	public Student() {

	}

	public Student(int id, String name, int age, String course, float per) {
//		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.course = course;
		this.per = per;
	}

	void display() {
		System.out.println("Student : " + id + " " + name + " " + age + " " + course + " " + per);
	}
}
