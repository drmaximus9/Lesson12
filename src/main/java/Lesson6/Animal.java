package Lesson6;

public abstract class Animal {
    protected String animalType;
    protected String animalName;
    private final int runDistance;
    private final int swimDistance;
    protected int animalCount;

    public Animal(String animalType, String animalName, int runDistance, int swimDistance) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwimDistance() {
        return swimDistance;
    }

    @Override
    public String toString() {
        return String.format("%s по кличке %s", animalType, animalName);
    }

    public abstract void toRun();
    public abstract void toSwim();
}
