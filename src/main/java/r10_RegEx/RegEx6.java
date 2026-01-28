package r10_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx6 {
    public static void main(String[] args) {
        String myCards = "52029173463187360727555;" +
                         "30673956365422090828111;" +
                         "78143698251277550929444";
        // 07/27 5202 9173 4631 8736 (555)
        Pattern pattern = Pattern.compile(
                "(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})(;)?"
        );
        Matcher matcher = pattern.matcher(myCards);

        String newString = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)\n");
        System.out.println(newString);

//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }

    }
}
