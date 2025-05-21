package tka_april4;

public class RgiClgStudent {
	public static void main(String[] args) {

		Student rgi = new Student();

		rgi.rollNo = 13;
		rgi.name = "Fahad";
		rgi.course = "UI/UX";
		rgi.per = 83.72f;

		System.out.println("\n*** Student Details ***");
		System.out.println("Roll No : " + rgi.rollNo);
		System.out.println("Name : " + rgi.name);
		System.out.println("Course : " + rgi.course);
		System.out.println("Percentage : " + rgi.per);
		rgi.doHomeWork();
		rgi.playSports();
		rgi.attendExam();

		System.out.println("--------------------------------");
		
		Student ghRGI = new Student();

		ghRGI.rollNo = 44;
		ghRGI.name = "Rehan";
		ghRGI.course = "Python";
		ghRGI.per = 78.09f;

		System.out.println("\n*** Student Details ***");
		System.out.println("Roll No : " + ghRGI.rollNo);
		System.out.println("Name : " + ghRGI.name);
		System.out.println("Course : " + ghRGI.course);
		System.out.println("Percentage : " + ghRGI.per);
		ghRGI.doHomeWork();
		ghRGI.attendExam();
		ghRGI.playSports();

	}
}
