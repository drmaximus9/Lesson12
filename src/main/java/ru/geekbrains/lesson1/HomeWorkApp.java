package ru.geekbrains.lesson1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }
    public static void printTreeWords() {//печатает три слова
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() { //выдаёт результата суммы двух чисел
        int a = 5;
        int b = 7;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");

        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() { //сравнивает числа
        int value = -25;

        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        else if (value > 100) {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers() { //сравнивает переменные
        int a = 3;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }

    }

}
