package tka_may05_String;

public class C2_SCPDemo {
    public static void main(String[] args) {
        C1_Init C1 = new C1_Init();    // 806 - hashCode()
        C1_Init C2 = new C1_Init();    // 254

        C1 = C2;                        // Equal Address
        System.out.println("C1 " + C1.hashCode());
        System.out.println("C2 " + C2.hashCode());
        System.out.println("C1 == C2 : " + (C1 == C2));
        System.out.println("C1.equals(C2) : " + C1.equals(C2));
//        Note:- == or .equal() play same roles for comparing objects

        String a = "Java";  // 506      SCP
        String b = "PHP";   // 192
        String c = "Java";  // 506

        String s1 = new String("Python");   // 924      HEAP
        String s2 = new String("Java");     // 506
        String s3 = new String("Python");   // 924

        System.out.println("a --> " + a.hashCode());
//        System.out.println("b --> " + b.hashCode());
//        System.out.println("c --> " + c.hashCode());
//        System.out.println("s1 --> " + s1.hashCode());
//        System.out.println("s2 --> " + s2.hashCode());
//        System.out.println("s3 --> " + s3.hashCode());

        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + (a .equals(b)));

        System.out.println("\n --- Same in SCP ---");
        System.out.println("a == c : " + (a == c));
        System.out.println("a.equals(c) : " + (a.equals(c)));

        System.out.println("\n --- Same in HEAP ---");
        System.out.println("s1 == s3 : " + (s1 == s3));     // address
        System.out.println("s1.equals(s3) : " + (s1.equals(s3)));

        System.out.println("\n --- Same in SCP & HEAP ---");
        System.out.println("a == s2 : " + (a == s2));     // address
        System.out.println("a.equals(s2) : " + (a.equals(s2)));   // compares character set
    }
}

//  How to compare address of two objects ?
//  --> 1. == operators
//  --> 2. Object.equals() method

//  How to compare address of two Strings ?
//  --> 1. == operators

//  What is difference between equals() of Object and equals() String class ?
//  --> Object.equals() compares both object's address
// --> String.equals() compares both String's Content [Character sets]