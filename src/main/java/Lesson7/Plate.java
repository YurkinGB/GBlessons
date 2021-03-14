package Lesson7;

import java.util.Scanner;

import static java.lang.System.*;

public class Plate {

    private int food;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {

        if (food >= n) {
            food -= n;
            return true;
        } else {
            return false;
        }
    }

    public void info() {
        out.println("plate: " + food);
    }

    public int fillPlate(){

        out.print("Добавьте еду -> ");

        Scanner scanner = new Scanner(in);
        food = scanner.nextInt();
        scanner.close();

        info();

        return  food;
    }
}

