package Lesson6;

import static java.lang.System.*;

public class Cat extends Animal {

    public static int catVol = 0;

    private static final int MAX_DISTANCE_RUN = 200;

    public Cat(String animalType){
        super(animalType);
        catVol ++;
    }

    @Override
    public String anSwim(int s){
        return "Кошки не умеют плавать!";
    }

    @Override
    public void setRun(int run) {
        if (run > MAX_DISTANCE_RUN){
        out.println("Кошка не может пробежать больше 200м.");
        super.setRun(MAX_DISTANCE_RUN);
        }else {
            super.setRun(run);
        }
    }
}
