package r10_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

        // любой символ из квадратных скобок
//        String s1 = "OPABMNCD";
//        Pattern pattern1 = Pattern.compile("[ABC]");

//        String s1 = "ABDOPABCOP";
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");    // AB[одна из букв диапазона]OP

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");  // abc[буква или цифра из диапазонов]

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");  // abc[буква или цифра НЕ из диапазонов]

        String s1 = "abcd abce abc5abcg6abch";
        Pattern pattern1 = Pattern.compile("abc(e|5)");         // abc( e или 5)

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }
}
