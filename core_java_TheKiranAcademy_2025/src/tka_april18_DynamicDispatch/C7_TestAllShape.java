package tka_april18_DynamicDispatch;

//	Dynamic Dispatch --

public class C7_TestAllShape {
	public static void main(String[] args) {
		
		C8_TriggerShape tr = new C8_TriggerShape();
//		C3_Shape tr = new C3_Shape();
//		C4_Circle c1 = new C4_Circle();		
//		tr.runShapeAPI(c1);		// call - circle-byte
				
//		C4_Circle c2 = new C4_Circle();			
//		tr.runShapeAPI(c2);
		
//		Parent ref  = new Child()
		C3_Shape c1 = new C4_Circle();	//	C3_Shape - long
		tr.runShapeAPI(c1);		// call - byte
		
		C3_Shape r1 = new C5_Rectangle();
		tr.runShapeAPI(r1);		// call - rectangle-short
//		
		C3_Shape s1 = new C6_Square();
		tr.runShapeAPI(s1);		// call - square-int
		
		
	}
}
