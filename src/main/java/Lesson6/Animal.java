package Lesson6;

public class Animal {

    public static int animalVol = 0;

    protected String animalType;
    private int run;
    private int swim;

    public Animal(String animalType){
        this.animalType = animalType;
        animalVol ++;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    protected String anRun(int r){
        return animalType + " пробежал(а) " + getRun() + "м.";
    }

    protected String anSwim(int s){
        return animalType + " проплыл(а) " + getSwim() + "м.";
    }
}
