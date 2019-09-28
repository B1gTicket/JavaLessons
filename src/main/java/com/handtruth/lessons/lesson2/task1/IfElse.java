package com.handtruth.lessons.lesson2.task1;

class IfElse {

    /**
     * Trivial
     *
     * На вход два числа.
     * Если первое больше второго, вывести 1,
     * Если равны - 0,
     * Если второе больше первого - -1
     */
    int compare(int a, int b) {
        if (a > b) {
            return 1;
        }
        else if (a < b) {
            return 0;
        }
        else{
            return -1;
        }
    }


    /**
     * Easy
     * <p>
     * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
     * вернуть строку вида: «21 год», «32 года», «12 лет».
     */
    String ageDescription(int age) {
        int a = age % 10; //Последняя цифра
        if (age == 11 || age == 12 || age == 13 || age == 14 || age == 111) {
            return age + " лет";
        }
        if (a == 1){
            return age + " год";
        }
        else if (a == 2 || a == 3 || a == 4) {
            return age + " года";
        }
        else {
            return age + " лет";
        }
    }

    /**
     * Easy
     * <p>
     * Треугольник задан длинами своих сторон a, b, c.
     * Проверить, является ли данный треугольник остроугольным (вернуть 0),
     * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
     * Если такой треугольник не существует, вернуть -1.
     */
    int triangleKind(double a, double b, double c) {
        double x = 0;
        double max = 0;
        if (a >= b & a >= c){
            max = a;
            x = b*b + c*c;
        }
        else if (b >= a & b >= c){
            max = b;
            x = c*c + a*a;
        }
        else if (c >= a & c >= b){
            max = c;
            x = a*a + b*b;
        }

        if (a + b > c & b + c > a & a + c > b) {
            if (Math.pow(max, 2) > x) {
                return 2;
            }
            if (Math.pow(max, 2) == x) {
                return 1;
            }
            if (Math.pow(max, 2) < x) {
                return 0;
            }
        }
        return -1;
    }



    /**
     * Medium
     * <p>
     * Даны четыре точки на одной прямой: A, B, C и D.
     * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
     * Найти длину пересечения отрезков AB и CD.
     * Если пересечения нет, вернуть -1.
     */

    int segmentLength(int a, int b, int c, int d) {
        int min = 0;
        int max = 0;
        if (a > c){
            max = a;
        }
        else if (c > a){
            max = c;
        }
        if (b < d){
            min = b;
        }
        else if (d < b){
            min = d;
        }
        if (min >= max){
            return min - max;
        }
        return -1;
    }
}
