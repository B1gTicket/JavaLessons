package com.handtruth.lessons.lesson2.task2;

class Switch {

    /**
     * Trivial
     * <p>
     * Пользователь вводит число от 1 до 10
     * Ипользуя конструкция switch case возвращать
     * символьное описание числа: 1-> один и т.д.
     * Если число не выходит в заданный интервал, вернуть
     * строку "Число не входит в разрешенный интервал"
     */

    String switchNumber(int number) {
        if ((number <= 10) & (number >= 1) ){
            switch (number) {
                case (1):
                    return "Один";
                case (2):
                    return "Два";
                case (3):
                    return "Три";
                case (4):
                    return "Четыре";
                case (5):
                    return "Пять";
                case (6):
                    return "Шесть";
                case (7):
                    return "Семь";
                case (8):
                    return "Восемь";
                case (9):
                    return "Девять";
                case(10):
                    return "Десять";
                default:
        }
        }
        return "Число не входит в разрешенный интервал";

    }


    /**
     * Trivial
     *
     * На вход подается цвет, необходимо
     * вывести навзавние цвета, т.е. White -> Белый и т.д.
     */

    String switchEnum(Color color) {
      switch(color) {
            case White:
                return "Белый";
            case Black:
                return "Черный";
            case Yellow:
                return "Желтый";
            default:
        }

        return "Не сегодня,дружище";
    }


    enum Color {
        White(1), Black(2), Yellow(3);

        int code;

        Color(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }
}
