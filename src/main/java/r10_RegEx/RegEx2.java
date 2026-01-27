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
//        Pattern pattern1 = Pattern.compile("AB[C-F]OP");      // AB[одна из букв диапазона]OP

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[e-g4-7]");    // abc[буква или цифра из диапазонов]

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc[^e-g4-7]");   // abc[буква или цифра НЕ из диапазонов]

//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc(e|5)");       // abc( e или 5)

//        String s1 = "abcd abc abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");             // abc + любой символ (кроме новой строки)
//        Pattern pattern1 = Pattern.compile("^abc");             // проверка, что строка начинается с паттерна
//        Pattern pattern1 = Pattern.compile("g6abch$");          // проверка, что паттерн - конец строки

//        Pattern pattern1 = Pattern.compile("\\d");              // одна любая цифра
//        Pattern pattern1 = Pattern.compile("\\D");              // один любой символ не цифра
//        Pattern pattern1 = Pattern.compile("\\w");              // любой символ, кроме пробела
//        Pattern pattern1 = Pattern.compile("\\W");              // любой символ, кроме букв, цифр и _
//        Pattern pattern1 = Pattern.compile("\\w+");             // одно или более повторений \w

//        String s1 = "poka abc    Valery         dom   \nabstrakcionism";
        // из 1 слова может быть несколько соответствий, зависит от длины
//        Pattern pattern1 = Pattern.compile("\\w{4}");             // вывод из найденных соответствий указанного количества
//        Pattern pattern1 = Pattern.compile("\\w\\s+\\w");         // s - пробельные символы из [\t\n\r\f]

//        String s1 = "abcd abce3 abcfa75abcg6abch------------------";
//        Pattern pattern1 = Pattern.compile("\\D{2,6}");             // не цифры от 2 до 6 повторений. если 2 числа нет - без ограничений

//        String s1 = "ABCABABDA";
//        Pattern pattern1 = Pattern.compile("(AB){2,3}");            // соответствие нескольких символов с указанием кол-ва берется в скобки

//        String s1 = "DABCDABABDABABABABD";
//        Pattern pattern1 = Pattern.compile("D(AB){2,}");            // D (минимум 2 раза AB)

//        String s1 = "DABCDABABDA";
//        Pattern pattern1 = Pattern.compile("D(AB)?");               // D (AB - 0 или 1 раз)
//        Pattern pattern1 = Pattern.compile("D(AB)*");               // D (AB - 0 или больше раз)

        String s1 = "abcd abce3 abcfa75ab";
//        Pattern pattern1 = Pattern.compile("\\Aabcd");              // строка начинается с паттерна
        Pattern pattern1 = Pattern.compile("5ab\\Z");              // строка заканчивается паттерном



        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "   " + matcher.group());
        }
    }
}























