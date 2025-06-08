package tka_april17_Polymorphism;

public class C91_Circle extends C9_Shape {
	
	// resArea,
	int r;
	
	public C91_Circle() {
		// Scanner Enter redius
	}
	
	public C91_Circle(int r) {
		this.r = r;
	}
	
	@Override
	void calArea() {
		resArea = 3.14 * r * r;
		System.out.println("Area of Circle : " + resArea);
	}
}
