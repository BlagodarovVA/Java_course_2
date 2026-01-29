package r11_other;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число: ");
//        int i = scanner.nextInt();
//        System.out.println("Введенное число: " + i);

//        System.out.println("Введите 2 числа (между числами Enter):");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Частное = " + x / y);
//        System.out.println("Остаток = " + x % y);

//        System.out.println("Напишите пару слов");
//        String s = scanner.nextLine();
//        System.out.println("Введенная строка: " + s);

//        System.out.println("Напишите 2 строки");
//        String s1 = scanner.nextLine();
//        String s2 = scanner.nextLine();
//        System.out.println("Введенная строки: " +'\n' + s1 + '\n' + s2);

//        System.out.println("Введите дробное число: ");    // отделять дробную часть запятой
//        double d = scanner.nextDouble();
//        System.out.println("Введенное число: " + d);

//        Scanner scanner1 = new Scanner("Privet drug");
//        String s1 = scanner1.next();
//        System.out.println(s1);                          // выведется только первое слово

        Scanner scanner1 = new Scanner("Привет друг. \nКак дела? \nЧто нового?");
//        while (scanner1.hasNextLine()){                 // для избежания исключений
//            System.out.println(scanner1.nextLine());
//        }

        System.out.println(scanner1.next().charAt(3));      // вывод символа с 4 позиции


    }
}


