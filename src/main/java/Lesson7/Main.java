package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Рихард", 25),
                new Cat("Федя", 20),
                new Cat("Люся", 15)
        };
        Plate plate = new Plate(60);


        for (Cat cat : cats) {
            cat.eat(plate);
            cat.catInfo();
        }

        plate.addCatFood(10);
        plate.printInfo();

    }
}
