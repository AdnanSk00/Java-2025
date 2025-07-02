package tka_may05_String;

// String - Immutable [Cannot modify]
// > If we perform any operations on string it won't be modified, it creates new String
// > Security

public class C3_ImmutableDemo {
    public static void main(String[] args) {

        String s = "Java";      // 915
        System.out.println("Original s : " + s);

        String upper = s.toUpperCase();
        System.out.println("--- s : " + s);
        System.out.println("--- s : " + upper);

        String concat = s.concat(" by Adnan");
        System.out.println("--- s : " + s);
        System.out.println("--- s : " + concat);

        int a = 10;
        System.out.println(a*5);    // 50
        System.out.println(a);      // 10
        a = a*5;
        System.out.println(a);      // 50

        String str = "php";
//        System.out.println(str);

//        str = str.toUpperCase();
        str = new String(str.toUpperCase());
        System.out.println(str);
    }
}
