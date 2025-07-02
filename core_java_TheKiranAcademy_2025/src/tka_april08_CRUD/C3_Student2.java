package tka_april08_CRUD;

public class C3_Student2 {
	int id;
	String name;
	int sub1;
	int sub2;
	int sub3;
	int totalMarks;
	float per;
	char grade = 'A';
//	boolean isAdmitted;
	
	void accept(int id, String name, int sub1, int sub2, int sub3) {
		this. id = id;
		this. name = name;
		this. sub1 = sub1;
		this. sub2 = sub2;
		this. sub3 = sub3;
		this. totalMarks = 0;
		this. per = 0;
		this.calculate();	// cal -> total per, & grade
	}
	void calculate() {
		this.totalMarks = sub1 + sub2 + sub3;
		this.per = totalMarks / 3;
		this.calGrade();
	}
	
	void calGrade() {
		if(per >= 75)
			grade = 'A';
		else if(per >= 60 && per < 75)
			grade = 'B';
		else if(per >= 45 && per < 60)
			grade = 'C';
		else if(per >= 35 && per < 45)
				grade = 'P';
		else
			grade = 'F';
	}
	
	void updateMarks(int sub1, int sub2, int sub3) {
		this. sub1 = sub1;
		this. sub2 = sub2;
		this. sub3 = sub3;
		this.calculate();
//		System.out.println("Subject Marks : " + sub1 + ", " + sub2 + ", " + sub3);
	}
	
	void display() {
		System.out.println(id + " - " + name + " - " + totalMarks + " - " + per + "% - " + grade);
//		System.out.println("isAdmitted > " + isAdmitted);
	}

}
