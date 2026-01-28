package r11_other;

import java.util.Arrays;

public class Enum1 {

    public static void main(String[] args) {
        Today today = new Today(WeekDays.FRIDAY);
        today.daysInfo();

        WeekDays w1 = WeekDays.FRIDAY;
        WeekDays w2 = WeekDays.FRIDAY;
        WeekDays w3 = WeekDays.MONDAY;
        System.out.println(w1 == w2);
        System.out.println(w1 == w3);

        // false т.к. разные типы
        System.out.println(WeekDays.MONDAY.equals(WeekDays2.MONDAY));

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] array = WeekDays.values();      // все значения enum
        System.out.println(Arrays.toString(array));
    }
}

