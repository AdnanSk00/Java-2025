package tka_april14_Encapsultaion;

public class C1_Student {
	int id;
	String name;
	String course;
	float per;
	
	C1_Student(){
		System.out.println("**Welcome Student()");
	}
	
	C1_Student(int id, String name, String course, float per){
		this();		// same class -> no-argument Constructor();
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
