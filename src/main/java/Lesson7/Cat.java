package Lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean eat(Plate p) {

        return p.decreaseFood(appetite);
    }
}
