package tka_april17_Polymorphism;

public class C93_Square extends C9_Shape{
	
	// resArea
	int side;
	
	public C93_Square() {

	}

	public C93_Square(int side) {
		this.side = side;
	}
	
	@Override
	void calArea() {
		resArea = side * side;
		System.out.println("Area of Square : " + resArea);
	}
}
