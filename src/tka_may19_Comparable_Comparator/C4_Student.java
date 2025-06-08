package tka_may19_Comparable_Comparator;

public class C4_Student {
//public class C4_Student implements Comparable<C4_Student>{		// sorting by int
	
	int id;				// primitive --> extra functionality
	String name;		// class obj
	float per;
	
//	@Override			// byDefault Comparable.compareTo()
//	public int compareTo(C4_Student s) {  // sorting by int - Only one input
//		if(this.id == s.id)
//			return 0;
//		else if(this.id > s.id)
//			return 1;
//		else 
//			return -1;
//	}
	
	public C4_Student() {
		// TODO Auto-generated constructor stub
	}

	public C4_Student(int id, String name, float per) {
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
