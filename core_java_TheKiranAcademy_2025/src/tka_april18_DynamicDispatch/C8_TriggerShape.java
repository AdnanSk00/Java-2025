package tka_april18_DynamicDispatch;

public class C8_TriggerShape {
//	A objAB = new B();		// Dynamic Dispatch

//	C3_Shape sh = new C4_Circle()/C5_Rectangle()/C6_Square();
	void runShapeAPI(C3_Shape sh) {
		sh.calArea();
		sh.draw();
		sh.color();
		sh.resize();
		sh.move();
	 }
		 
}
