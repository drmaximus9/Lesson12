package Lesson2;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkTwo {
    public static void main(String[] args) {

        boolean isWithin = within10and20(ThreadLocalRandom.current().nextInt(1, 10), ThreadLocalRandom.current().nextInt(10, 20));
        System.out.println(isWithin);
        System.out.println();

        isNumberPositiveOrNegative(ThreadLocalRandom.current().nextInt(-100, 100));
        System.out.println();

        boolean  isNegative = isTrueNegative(ThreadLocalRandom.current().nextInt(-20, 20));
        System.out.println(isNegative);
        System.out.println();

        printTextTimes("текст", 10);
        System.out.println();

        boolean isLeap = isYearLeap(ThreadLocalRandom.current().nextInt(1700,2300));
        System.out.println(isLeap);


    }

    public static boolean within10and20(int a, int b) {

        return (a + b >= 10) && (a + b <= 20);

    }

    public static void isNumberPositiveOrNegative(int number) {


        if (number < 0) {
            System.out.println(number + " Отрицательное число");
        }
        else {
            System.out.println(number + " Положительное число");
        }
    }

    public static boolean isTrueNegative(int integer) {
        return integer >= 0;
    }

    public static void printTextTimes(String word, int times) {


        for (int i = 0; i < 10; i++) {

            System.out.println(word);
        }
    }

    public static boolean isYearLeap(int year) {

        System.out.println(year + " ");


        if ((year / 100) % 4 == 0 || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }




}
