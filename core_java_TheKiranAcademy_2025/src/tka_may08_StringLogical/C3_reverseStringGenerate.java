package tka_may08_StringLogical;

public class C3_reverseStringGenerate {
    public static void main(String[] args) {

        String s = "java";      // avaj
//        String s = "MADAM";      // MADAM
        System.out.println("Original : " + s);

        char[] ch = s.toCharArray();

        String revStr1 = "";     // "" -- memory
        for(int i = ch.length-1; i >= 0; i--){
            revStr1 = revStr1 + ch[i];
        }
        System.out.println("Reverse1 : " + revStr1);

        int k = 0;
        char[] chRev2 = new char[ch.length];
        for(int i = ch.length-1; i >= 0; i--, k++){
            chRev2[k] = ch[i];
        }
        // [] chRev2 = {'a', 'v', 'a', 'j'};
        String revStr2 = new String(chRev2);      // Convert to new String
        System.out.println("Reverse2 : " + revStr2);

        if(s.equals(revStr1))
            System.out.println(s + " is Palindrom");
        else
            System.out.println(s + " is not Palindrom");

    }
}
