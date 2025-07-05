
package tka_june5_project_jdk8;


public interface C3_TestJ8 {
	public static void main(String[] args) {
		
		C2_ImpJ8 obj = new C2_ImpJ8();
		
		obj.m1Abst();				// Need object --> class
		obj.m2Default();			// call by object - object level
		
//		obj.m3Static();				// error
		C1_InterfaceJ8.m3Static();	// class reference
	}
		
}
