package tka_april18_DynamicDispatch;

public class C4_Circle extends C3_Shape {
	
	@Override
	void calArea() {
		System.out.println("\nCircle Area : " + 34.46);
	}
	@Override
	void draw() {
		System.out.println("Circle is draw : ");
	}
	@Override
	void color() {
		System.out.println("Circle is colored : ");
	}
	@Override
	void resize() {
		System.out.println("Circle is resized : ");
	}
	@Override
	void move() {
		System.out.println("Circle is moved 4-8");
	}
}
