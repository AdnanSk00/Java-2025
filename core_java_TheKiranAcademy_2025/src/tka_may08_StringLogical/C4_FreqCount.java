package tka_may08_StringLogical;

public class C4_FreqCount {
    public static void main(String[] args) {

//        String s = "java";      // avaj
        String s = "MADAM";      // MADAM
        System.out.println("Original : " + s);

        char[] ch = s.toCharArray();

        for(int i = 0; i < ch.length; i++) {
            int cnt = 1;
            for(int j = i+1; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    cnt++;
                    ch[j] = 0;
                }
            }
            if(ch[i] != 0)
                System.out.println(ch[i] + " count >> " + cnt + " times");
        }

    }
}
