package tka_may02_Array_NextLevel;

public class C9_MissingNumber {
	public static void main(String[] args) {
        int a[] = {12, 14, 16, 19};
        // Sorted Array
        for(int i = 0; i < a.length-1; i++){
            int exp = a[i] + 1;
            int act = a[i+1];

            while(exp != act){
                System.out.println(exp + " > Missing");
                exp++;
            }
        }
	}
}
