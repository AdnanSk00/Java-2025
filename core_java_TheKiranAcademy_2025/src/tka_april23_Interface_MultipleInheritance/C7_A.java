package tka_april23_Interface_MultipleInheritance;

final public class C7_A {				// don't want that someone extends me

//	double pi = 3.14;					// can change in local block areaOfCircle(){ pi = 4.14;}
//	final double pi = 3.14;				// global(instance) variable - constant
	
	final void areaOfCircle(int r) {
		
//		double pi = 3.14;				// can change - pi = 4.14;
//		final double pi = 3.14;			// final - constant(can't be changed) - local var also
		
//		double area = pi * r * r;
		
		double area = 3.14 * r * r;
		System.out.println("Circle Area : " + area);
	}
	
	final void areaOfSquare() {
		
	}
	final void areaOfRectangle() {
		
	}
	void areaOftriangle() {
		
	}
	
}

//  final keyword can be used at three places which are local, global(instance) and reference space for variables.
//	final --> restrict for modify. (constant)
//				var - reinitialize for modify	int a = 4;  a = 6;
//  			method - overriding				@override 
//  			class - extends 				class B extends A {}
//  If class having 50 methods I want to keep it final so I will have to write final with every methods so we can directly assign final before that class to make final all its methods.
//  If a 'variable' declare as final - then cannot change its value become a constant.
//  If a 'method' declare as final - then cannot override it.
//  If a 'class' declare as final - then can not derived or extends it.