package tka_may02_Array_NextLevel;

public class C4_DuplicateSameArray {
	public static void main(String[] args) {
		
		int a[] = { 3, 5, 6, 4, 11, 3, 4, 6, 7, 3 };
		
		for(int i = 0; i < a.length; i++) {
			int cnt = 1;
			for(int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					cnt++;
					a[j] = 0;
				}
			}
			if(a[i] != 0 && cnt >= 2)
				System.out.println(a[i] + " duplicate with count " + cnt);
		}
	
	}
}
