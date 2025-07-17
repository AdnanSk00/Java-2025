package tka_may19_Comparable_Comparator;

public class C04_Student {
//public class C04_Student implements Comparable<C04_Student>{		// sorting by int
	
	int id;				// primitive --> extra functionality
	String name;		// class obj
	float per;
	
//	@Override			// byDefault Comparable.compareTo()
//	public int compareTo(C04_Student s) {  // sorting by int - Only one input
//		if(this.id == s.id)
//			return 0;
//		else if(this.id > s.id)
//			return 1;
//		else 
//			return -1;
//	}
	
	public C04_Student() {
		// TODO Auto-generated constructor stub
	}

	public C04_Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}

	
}
