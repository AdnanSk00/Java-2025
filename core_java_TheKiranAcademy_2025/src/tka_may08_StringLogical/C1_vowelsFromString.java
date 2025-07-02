package tka_may08_StringLogical;

public class C1_vowelsFromString {
    public static void main(String[] args) {
    	
        String s = "Java";
        System.out.println(s.length());
        System.out.println(s.charAt(2));
        System.out.println(s.indexOf("v"));
        System.out.println(s.indexOf("b"));     // -1 [end of steam]
        System.out.println(s.isEmpty());

        String s1 = "AAA";   // Ascii - 65 65 65
        String s2 = "ADC";   // Ascii - 65 68 67
        System.out.println(s1.compareTo(s2));   // 65-68 = -3

        String t = "TKA, Hadapsar, Pune";
        String[] splitStr = t.split(", ");
        for(String splitItems : splitStr){
            System.out.print(splitItems + " ");
        }
        System.out.println("--------");
        for(int i = 0; i < splitStr.length; i++){
            System.out.println(splitStr[i]);
        }
        String h = "hello";
        char[] charArray = h.toCharArray();
        System.out.println(charArray);
        for(char ch : charArray){
//            System.out.print(ch + " ");
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println(ch);
            }
        }
        System.out.println(h.hashCode());   // hashCode
        System.out.println(h);              // className-@-hashCode
        System.out.println(h.toString());   // className-@-hashCode

        System.out.println("--------------");
        System.out.println(charArray.hashCode());   // hashCode
        System.out.println(charArray.toString());   // className-@-hashCode

        System.out.println("--------------");
        A aa = new A();
        System.out.println(aa.hashCode());
        System.out.println(aa);
        System.out.println(aa.toString());          // className-@-hashCode

    }
}

// className-@-hashCode => Employee [ id = 2, name = "Rahul", salary = 78000 ]


