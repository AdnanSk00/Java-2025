package tka_may08_StringLogical;

public class C2_reverseStringPrint {
    public static void main(String[] args) {

        String s = "java";      // avaj
        char[] ch = s.toCharArray();
        for(int i = ch.length-1; i >= 0; i--){
            System.out.print(ch[i] + " ");
        }

    }
}
