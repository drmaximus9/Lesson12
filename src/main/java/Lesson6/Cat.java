package Lesson6;

public class Cat extends Animal {
    public Cat(String animalType, String animalName, int runDistance, int swimDistance) {
        super(animalType, animalName, runDistance, swimDistance);
    }

    @Override
    public void toRun() {

        int catDistance = getRunDistance();

        if (catDistance <= 200) {
            System.out.printf("Дисциплина бег:%n %s по кличке: %s пробежал %s метров! %n", animalType, animalName, getRunDistance());
        } else {
            System.out.printf("Дисциплина бег:%n данная дистанция - %sм., коту не по силам, %s по кличке: %s, выбывает из соревнований. %n", getRunDistance(), animalType, animalName);
        }
    }

    @Override
    public void toSwim() {
        System.out.printf("Дисциплина плавание:%n а коты у нас не плавают! %n");

    }


}
