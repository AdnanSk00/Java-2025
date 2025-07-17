package tka_may15_Collections;

public class C3_Typecasting {
	public static void main(String[] args) {
		
//		byte b = 11; 	// type(11) --> byDefault - int
		byte b = (byte)11;		// byte
		System.out.println(b);		// 11
		
//		int c = 211;		// int
//		long c = 211;		// int
		long c = (long)112;	// int to long --> long(int)
		
//		long l = (long)97892389411;		// int
		long l = (long)97892389411L;		// long - but chance to lost data
		byte B = (byte)150;			// error - sizeofByte(127)
		
		
		int p = 15;
		// small to large : Boxing
		Integer o1 = new Integer(p);	// primitive to wrapper class
		
		// large to small : Unboxing
//		float f = 10;
//		Integer o1 = new Integer(f);
		float f = o1.floatValue();		// wrapper class to primitive
		System.out.println(f);
		
		// small to large : Auto-Boxing {JVM}
		Integer o2 = p;		// new Integer(p) - JVM
		
		// large to small : Auto-Unboxing {JVM}
		float f2 = o2;		// .floatValue() - JVM
		System.out.println(f2);
		
		
		// al.add(11);	// al.add(new Integer(11));
		// Object obj = new Integer(11);
		// al.add(obj);
	}
}
