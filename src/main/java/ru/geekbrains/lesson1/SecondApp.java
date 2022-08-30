package ru.geekbrains.lesson1;

public class SecondApp {
    public static void main(String[] args) {
        int a = 2, b = 3, c = 0;
        if (a < b) {  // если а меньше б
            System.out.println("а меньше б");
        }
        if (a == b) {  // если а равно б
            System.out.println("а равно б. Это сообщение не будет выведено");
        }
        c = a - b; // переменная с = 2-3 = -1
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("С не отрицательно");
        }
        if (c < 0) {
            System.out.println("с отрицательно");
        }
        c = b - a; // переменная с = 3-2 =1
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("с неотрицательно");
        }
        if (c < 0) {
            System.out.println("c отрицательно");
        }


    }
}
