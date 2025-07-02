package tka_may02_Array_NextLevel;

public class C5_FreqSameArrayj {
	public static void main(String[] args) {
		
		int a[] = { 3, 5, 6, 4, 3, 7, 6, 3, 4 };
		
		for(int i = 0; i < a.length; i++) {
			int cnt = 1;
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					cnt++;
					a[j] = 0;
				}
			}
			if(a[i] != 0)
				System.out.println(a[i] + " count >> " + cnt + " times");					
		}
	
	}
}
