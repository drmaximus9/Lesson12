package ru.geekbrains.lesson1;

public class If {
    public static void main(String[] args) {
        if (5 > 1) System.out.println("Пять больше чем один");
        if (2<4) {
            System.out.println("Два меньше четырёх");
            System.out.println("Проверка выполнена успешно");


        }
        int num = 3;
        if (((num > 5) && (num < 10)) || (num == 12))
            System.out.println("Число в диапозоне от 6 до 9 включительно или равно 12");
    }
}
