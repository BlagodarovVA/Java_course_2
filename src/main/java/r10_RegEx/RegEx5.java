package r10_RegEx;

import java.util.regex.Pattern;

public class RegEx5 {

    private static void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                        "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        // ((25[0-5]    |   2[0-4]\d    |   [01]?\d?\d)     (\.))    {3}
        //  250-255     OR   200-249    OR   0-199            .      3 раза

        System.out.println(ip + " is OK: " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {
        String ip1 = "10.200.0.5";
        String ip2 = "192.168.300.198";
        checkIP(ip1);
        checkIP(ip2);

    }
}
