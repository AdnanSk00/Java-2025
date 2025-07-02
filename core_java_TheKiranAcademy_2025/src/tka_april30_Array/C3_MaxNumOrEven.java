package tka_april30_Array;

public class C3_MaxNumOrEven {
	public static void main(String[] args) {
		// even / odd if(a[i] % 2 == 0)
		// Max num ??
		
		int a[] = { 11, 22, 44, 101, 55, 33, 99, 77 };
		int max = a[0];
		
		for(int items : a) {
			if(items % 2 == 0) {
				System.out.println("Even - " + items);
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max > " + max);
		
	}
}
