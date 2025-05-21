package tka_april14_Encapsultaion;

public class Student {
	int id;
	String name;
	String course;
	float per;
	
	Student(){
		System.out.println("**Welcome Student()");
	}
	
	Student(int id, String name, String course, float per){
		System.out.println("**Welcome Student(, , , ,)");
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
		
	}
	
	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Course : " + course);
		System.out.println("% : " + per + "\n");
	}
	
	void updatePer(float  per) {
		if(per >= 0 && per <= 100) {
			this.per = per;
			System.out.println("per updated successfully....");
		} 
		else {
			System.err.println(per + " >> Invallid Entry...\n");
		}
	}
}
