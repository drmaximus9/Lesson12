package Lesson6;

public class lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Кот сиамский", "Барсик",150,0);
        Dog dog = new Dog("Пёс боксёр", "Хук", 205, 10);
        Cat cat1 = new Cat("Кот мейнкун", "Мотя", 201, 0);
        Dog dog1 = new Dog("Пёс лайка", "Ласка", 175, 50);

        Animal[] animals = {cat, cat1, dog, dog1};

        for (Animal animal: animals) {

            animal.toRun();
            animal.toSwim();

        }

        System.out.println("Всего в соревнованиях приняло участие " + animals.length + " животных!");



    }
}
