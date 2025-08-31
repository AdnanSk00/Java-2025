package tka_april30_Array;

public class C8_RemoveDuplicate {
	public static void main(String[] args) {
		
        int arr[] = {10, 20, 20, 30, 40, 10, 50, 30};

        int n = arr.length;
        int[] temp = new int[n];   // temporary array to store unique elements
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Printing unique elements
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");
        }
        
    }
}
