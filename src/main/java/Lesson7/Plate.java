package Lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }


    public boolean decreaseFood(int n) {
        int foodDiff = foodCount - n;
        if (foodDiff < 0) {
            return false;
        } else {
            foodCount -= n;
        }

        return true;

    }

    public void addCatFood(int foodCount) {
        this.foodCount += foodCount;
    }

    public void printInfo() {
        System.out.printf("В миске осталось %s еды%n", foodCount);
    }

}
