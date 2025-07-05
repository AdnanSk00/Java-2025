
package tka_june5_project_jdk8;


public abstract class C4_Shape {
	
	// Method hiding --> final, private, static
	// Want to hide this method for child
	static void shapeMethod() {			// concrete method
		System.out.println("Shape > Welcome");
	}
	
	// child classes suggestion
	abstract void calArea();
	abstract void color();
	abstract void fill();
}
