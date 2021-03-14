package Lesson7;

import static Lesson7.Action.plate;

public class MainClass {

    public static void main(String[] args) {

        plate = new Plate();
        plate.setFood(plate.fillPlate());

        Action.feedTheCats();
        plate.info();

    }
}