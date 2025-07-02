package tka_may08_StringLogical;

public class C6_RemoveSpacesGen {
    public static void main(String[] args) {

//        String s = "Hello World";
        String s = "Happy New Year";
        System.out.println("Original : " + s);

        char[] ch = s.toCharArray();
        String remSpace = "";
        System.out.print("Without Space - ");
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' '){
                remSpace = remSpace + ch[i];
            }
        }
        System.out.println(remSpace);
    }
}
