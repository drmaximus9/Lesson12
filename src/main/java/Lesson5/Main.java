package Lesson5;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Иванов Пётр Сидорович", "Директор", "ivanoff@gmail.com", 3333333, 500000, 55);
        workers[1] = new Worker("Васечкин Игнатий Понтелеймонович", "Зам. директора", "vasechkin@gmail.com", 31331331, 300000, 45);
        workers[2] = new Worker("Чернышко Фёдор Марьяннович", "Технолог", "maryanich@gmail.com", 22222222, 200000, 50);
        workers[3] = new Worker("Петров Василий Иванович", "Маркетолог", "petroff@gmail.com", 3223222, 300000, 24);
        workers[4] = new Worker("Линг Ван Си", "Коммерческий директор", "li@gmail.com", 7777777, 500000, 40);
        Worker worker1 = new Worker("Vasiliy", "Director", "director@gmail.com", 2550568, 250000, 34);

        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getAge() > 40)
                workers[i].printInfo();
            System.out.println();

        }

    }

}
