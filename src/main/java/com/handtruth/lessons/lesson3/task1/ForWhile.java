package com.handtruth.lessons.lesson3.task1;

class ForWhile {

    /**
     * Trivial
     * <p>
     * Вычислить факториал
     */
    long factorial(int n) {
        long k = 1;
        while (n > 1){
           k *= n;
           n--;
        }
        return k;
    }

    /**
     * Trivial
     * <p>
     * Найти количество цифр в заданном числе
     */
    int counter(int n) {
        int k = 0;
        if (n == 0){
            return 1;
        }
        while (n != 0) {
            k++;
            n = n / 10;
        }
        return k;
    }

    /**
     * Easy
     * <p>
     * Определить, являются ли два заданных числа m и n взаимно простыми.
     * Взаимно простые числа не имеют общих делителей, кроме 1.
     * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
     */
    boolean isCoPrime(int a, int b) {
        while (a != b){
            if (a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        if (a == 1) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Medium
     * <p>
     * Для заданного x рассчитать с заданной точностью eps
     * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
     * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
     */
    double sin(double x, double exp) {
        double sin = 0;
        while (exp != 1){
            sin += x + Math.pow(x,exp);
            exp -= 1;
        }
        return sin;
    }

    /**
     * Hard
     * <p>
     * Найти n-ю цифру последовательности из квадратов целых чисел:
     * 149162536496481100121144...
     * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
     */
    int squareSequenceDigit(int n) {
        int m = 1;
        String k = "";
       while (m != n){
           k += m*m;
           m += 1;
       }
       k = k.substring(n-1,n);
       int index = Integer.parseInt(k);
       return index;
    }

}

