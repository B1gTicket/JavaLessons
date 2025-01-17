package com.handtruth.lessons.lesson1.task1;

class Simple {

    /**
     * Trivial
     *
     * Вычислить дискриминант квадратного уравнения
     */
    double discriminant(double a, double b, double c) {
        double x = Math.pow(b,2) - (4 * a * c);
        return x;
    }

    /**
     * Trivial
     *
     * Поиск одного из корней квадратного уравнения
     */
    double sqRoot(double a, double b, double c) {
        double x = (-b + Math.sqrt(discriminant(a,b,c)))/(2*a);
        return x;
    }

    /**
     * Trivial
     *
     * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
     * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
     */
    double seconds(int hours, int minutes, int seconds) {
        int x = (hours*60*60) + (minutes*60) + seconds;
        return x;
    }

    /**
     * Easy
     * Пользователь задает целое трехзначное число (например, 478).
     * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
     */
    int numberRevert(int number) {
        int a = number/100; //4
        int b = (number/10)%10; //7
        int c = number%10; //8
        int x = c*100 + b*10 + a;
        return x;
    }
}
