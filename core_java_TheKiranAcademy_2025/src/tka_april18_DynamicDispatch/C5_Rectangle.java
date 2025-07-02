package tka_april18_DynamicDispatch;

public class C5_Rectangle extends C3_Shape{
	
	@Override
	void calArea() {
		System.out.println("\nArea of Rectangle : " + 12);
	}
	@Override
	void draw() {
		System.out.println("Rectangle is draw : ");
	}
	@Override
	void color() {
		System.out.println("Rectangle is colored : ");
	}
	@Override
	void resize() {
		System.out.println("Rectangle is resized : ");
	}
	@Override
	void move() {
		System.out.println("Rectangle is moved 5-8");
	}
}
