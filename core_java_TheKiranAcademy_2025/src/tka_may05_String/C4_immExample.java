package tka_may05_String;

public class C4_immExample {
    public static void main(String[] args) {

        String query = "Select * from emp";
        System.out.println("init : " + query);
        query.concat("where id > 100;");
        System.out.println("---- : " + query);

        StringBuilder sb = new StringBuilder("select * from emp");
        System.out.println("\ninit : " + sb);
        sb.append(" where id > 100;");
        System.out.println("---- : " + sb);
        sb.delete(3, 10);
        System.out.println("---- : " + sb);

        StringBuffer sf = new StringBuffer("select * from emp");
        System.out.println("\ninit : " + sf);
        sf.append(" where id > 100;");
        System.out.println("---- : " + sf);

        String t = "adnan";
        System.out.println(t + " " + t.toString());

    }
}
