package r10_RegEx;

public class RegEx4 {
    public static void main(String[] args) {
        String s1 = "Privet,    my   friend!  Kak   idet izuchenie   Java   ?";
        System.out.println(s1);
//        s1 = s1.replace("Java", "SQL");
//        s1 = s1.replaceAll(" {2,}", " ");     // замена нескольких пробелов на 1
//        s1 = s1.replaceAll("\\bi\\w+", "4444");
        s1 = s1.replaceFirst("\\bi\\w+", "4444");   // замена первого найденного значения
        System.out.println(s1);
    }
}
