package tka_april17_Polymorphism;

public class C92_Rectangle extends C9_Shape{
	
	// resArea
	int l, b;
	
	public C92_Rectangle() {
	
	}
	
	public C92_Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	@Override
	void calArea() {
		resArea = l * b;
		System.out.println("Area of Rectangle : " + resArea);
	}
}
