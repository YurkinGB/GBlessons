package Lesson6;

import static java.lang.System.*;

public class Dog extends Animal {

    public static int dogVol = 0;

    private static final int MAX_DISTANCE_RUN = 500;
    private static final int MAX_DISTANCE_SWIM = 10;

    public Dog(String animalType){
        super(animalType);
        dogVol ++;
    }

    @Override
    public void setRun(int run) {
        if (run > MAX_DISTANCE_RUN) {
            out.println("Собака не может пробежать больше 500м.");
            super.setRun(MAX_DISTANCE_RUN);
        }else {
            super.setRun(run);
        }
    }

    @Override
    public void setSwim(int swim) {
        if (swim > MAX_DISTANCE_SWIM) {
            out.println("Собака не может проплыть больше 10м.");
            super.setSwim(MAX_DISTANCE_SWIM);
        }else {
            super.setSwim(swim);
        }
    }

}
