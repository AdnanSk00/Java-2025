
package tka_june3_project_jdk8;


public class C5_Circle extends C4_Shape{
	
//	static -- can not override
	static void shapeMethod() {				// not @override - own method() of Circle
		System.out.println("Circle > Welcome");
	}

	@Override		// RunTime
	void calArea() {
		System.out.println("Circle Area...");
	}

	@Override
	void color() {
		System.out.println("Circle color...");
	}

	@Override
	void fill() {
		System.out.println("Circle filled...");
		
	}
	
	
}
