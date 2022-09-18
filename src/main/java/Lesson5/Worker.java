package Lesson5;

public class Worker {
    private String fio;
    private String position;
    private String email;
    private int salary;
    private int phone;
    private int age;

    public Worker(String fio, String position, String email, int salary, int phone, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    void printInfo() {
        System.out.println("ФИО: " + fio + " Должность: " + position + ", Электронная почта: " +
                email + ", Телефон: " + phone + ", Зароботная плата: " + salary + " руб. Возраст: " + age + " лет. ");

    }

}
