package tka_may08_StringLogical;

public class C7_StringAnagram {
    public static void main(String[] args) {

        String s1 = "TEACHER";
        String s2 = "CHEATER";
        
        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        int count = 1;
        for(int i = 0; i < char1.length-1; i++) {
        	for(int j = i+1; j < char2.length-1; j++) {
        		if(char1[i] == char1[i]) {
        			count++;
        		}
        	}
        }
    }
}
