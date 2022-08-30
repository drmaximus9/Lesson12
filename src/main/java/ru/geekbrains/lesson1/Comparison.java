package ru.geekbrains.lesson1;

public class Comparison {
    public static void main(String[] args) {
        String txt = "Fantastic";
        String lang = "Java";
        boolean state = (txt == lang); //Присваеваем результат проверки
        System.out.println("Проверка строк на равенство: " + state);
        state = (txt != lang); //Результат на неравенство
        System.out.println("Проверка строк на неравенство: " + state);

        int dozen = 12;
        int score = 20;
        state = (dozen > score);
        System.out.println("Проверка на больше: " + state);

        state = (dozen < score);
        System.out.println("Проверка на меньше: " + state);


    }
}
