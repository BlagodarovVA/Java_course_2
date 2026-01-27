package r10_RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasiliy, Russia, Moscow, Lenin street, 51, Flat 48," +
                " email: vivanov@mail.ru, Postcode: AA99, Phone Number: +123456789;" +
                "Petrova Mariya, Ukraine, Kiyev, Lomonosov street, 33, Flat 18," +
                " email: masha@yandex.ru, Postcode: UKR54, Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood, All stars street, 87, Flat 21," +
                " email: chuck@gmail.com, Postcode: USA23, Phone Number: +136478952.";

//        Pattern pattern = Pattern.compile("\\w+");          // находим все слова и числа
//        Pattern pattern = Pattern.compile("\\b\\d{2}\\b");  // \\b означает границу числа или слова
//        Pattern pattern = Pattern.compile("\\+\\d{9}");     // + и 9 цифр. + экранируется
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");  // имейлы. точка экранируется




        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
