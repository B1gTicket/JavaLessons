package com.handtruth.lessons.lesson5.task1;

import java.util.Arrays;
import java.util.Date;
import java.util.regex.Pattern;

class Parse {
    /**
     * Easy
     * <p>
     * Дано число n от 0 до 99.
     * Вернуть его же в виде двухсимвольной строки, от "00" до "99"
     * Для конкатинации строк использовать метод concat()
     */
    String toDigitStr(int n) {
        if (n < 10) {
            String one = "0";
            String two = Integer.toString(n);
            return one.concat(two);
        } else {
            return Integer.toString(n);
        }
    }

    /**
     * Easy
     * <p>
     * Дано seconds -- время в секундах, прошедшее с начала дня.
     * Вернуть текущее время в виде строки в формате "ЧЧ:ММ:СС".
     * Для конкатинации строк использовать StringBuilder
     */
    String timeSecondsToStr(int seconds) {
        StringBuilder sb = new StringBuilder(8);
        sb.append(seconds / 3600).append(":");
        if ((seconds / 60) == 0 || (seconds % 60) == 0) {
            sb.append((seconds / 60) % 60).append("0:0");
            sb.append(seconds % 60);
            return sb.toString();
        }

        sb.append((seconds / 60) % 60).append(":");
        sb.append(seconds % 60);
        return sb.toString();

    }

    /**
     * Easy
     * <p>
     * Дано число. Если это число двоичное, вернуть true, иначе false.
     * (пример двоичного числа: 100101)
     */
    boolean isBin(String n) {
        String d = "[0-1]+"; // [0-1]+ (+) - один или несколько раз
        return n.matches(d);
    }

    /**
     * Medium
     * <p>
     * Дана строка. Вернуть содержимое строки в промежутке символов [n, m)
     * Не использовать стандартную функцию substring()
     */
    String substring(String str, int n, int m) {
        StringBuilder sb = new StringBuilder();
        while (n != m) {
            sb.append(str.charAt(n));
            n++;
        }
        return sb.toString();
    }

    /**
     * Hard
     * <p>
     * На входе простой простой математический пример в виде двух операндов и одной операции:
     * int <операция> int; Могут быть операции +-*.
     * Вернуть результат операции.
     */
    int mathOperation(String example) {
        int sum = 0;
        String example2 = example.replace(" ", "");
        boolean Minus = example2.contains("-");
        boolean Plus = example2.contains("+");
        boolean Mult = example2.contains("*");

        if (Minus) {
            String[] Razbiv = example2.split("-");
            sum = Integer.parseInt(Razbiv[0]) - Integer.parseInt(Razbiv[1]);
        }
        if (Plus) {
            String[] Razbiv = example2.split(Pattern.quote("+"));
            sum = Integer.parseInt(Razbiv[0]) + Integer.parseInt(Razbiv[1]);
        }
        if (Mult) {
            String[] Razbiv = example2.split(Pattern.quote("*"));
            sum = Integer.parseInt(Razbiv[0]) * Integer.parseInt(Razbiv[1]);
        }
        return sum;
    }
}
