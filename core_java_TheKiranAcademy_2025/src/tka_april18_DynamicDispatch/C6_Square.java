package tka_april18_DynamicDispatch;

public class C6_Square extends C3_Shape{
	
	@Override
	void calArea() {
		System.out.println("\nArea of Square : " + 36);
	}
	@Override
	void draw() {
		System.out.println("Square is draw : ");
	}
	@Override
	void color() {
		System.out.println("Square is colored : ");
	}
	@Override
	void resize() {
		System.out.println("Square is resized : ");
	}
	@Override
	void move() {
		System.out.println("Square is moved 6-8");
	}
}
