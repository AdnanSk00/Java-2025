package tka_may08_StringLogical;

public class C5_RemoveSpaces {
    public static void main(String[] args) {

//        String s = "Hello World";
        String s = "Happy New Year";
        System.out.println("Original : " + s);

        char[] ch = s.toCharArray();

        System.out.print("Non Space Array - ");
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' '){
                System.out.print(ch[i]);
            }
        }
        String remSpace = new String(ch);       // ch[] --> String
        System.out.println("\n" + remSpace);
    }
}
