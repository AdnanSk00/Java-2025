package tka_april18_DynamicDispatch;

public class C2_TestSumAppn {
	public static void main(String[] args) {
		
		byte b1 = 1, b2 = 2;
		short s1 = 11, s2 = 22;
		int i1 = 111, i2 = 222;
		long l1 = 1111, l2 = 2222;
		
		C1_Addition obj = new C1_Addition();
		obj.sum(b1, b2);
		obj.sum(s1, s2);
		obj.sum(i1, i2);
		obj.sum(l1, l2);
		
//		Note:- Above all will work for long data type due to high size 
	}
}
