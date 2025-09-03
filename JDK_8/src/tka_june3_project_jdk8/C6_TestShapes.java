package tka_june3_project_jdk8;

public class C6_TestShapes {

	public static void main(String[] args) {
//		C5_Circle c = new C5_Circle();
		C4_Shape c = new C5_Circle();
		c.shapeMethod();
		c.calArea();
		
//		C5_Circle c = new C5_Circle();
//		c.shapeMethod();	// static store in stack memory 
//		C5_Circle.shapeMethod();	// better approach - class instance
	
	}

}

// object data store in heap memory while static method store in stack
// Better way - static method is accessed by class instance(reference)
// E.g - C4_Shape.shapeMethod();
