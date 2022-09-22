package Lesson6;

public class Dog extends Animal{
    public Dog(String animalType, String animalName, int runDistance, int swimDistance) {
        super(animalType, animalName, runDistance, swimDistance);
    }

    @Override
    public void toRun() {
        int dogDistance = getRunDistance();
        if (dogDistance <= 500) {
            System.out.printf("Дисциплина бег:%n %s по кличке %s пробежал %s метров! %n", animalType, animalName, getRunDistance());
        } else {
            System.out.printf("Дисциплина бег:%n данная дистанция - %sм., псу не по силам, %s %s выбывает %n", getRunDistance(), animalType, animalName);
        }

    }

    @Override
    public void toSwim() {
        int dogSwimDistance = getSwimDistance();

        if (dogSwimDistance <= 10) {

            System.out.printf("Дисциплина плавание:%n %s по кличке %s проплыл %s метров! %n", animalType, animalName, getSwimDistance());
        } else {

            System.out.printf("Дисциплина плавание:%n %s по кличке %s утонул, мы все скорбим ;( %n", animalType, animalName);
        }


    }
}
