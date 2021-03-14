package Lesson7;

import static java.lang.System.out;

public final class Action {

    private Action(){

    }

    public static Plate plate;

    public static Cat[] createArrayCats(){

        Cat[] cats = new Cat[5];

        cats[0] = new Cat();
        cats[0].setName("Мурзик");
        cats[0].setAppetite(15);
        cats[0].setSatiety(false);

        cats[1] = new Cat();
        cats[1].setName("Барсик");
        cats[1].setAppetite(6);
        cats[1].setSatiety(false);

        cats[2] = new Cat();
        cats[2].setName("Рыжик");
        cats[2].setAppetite(18);
        cats[2].setSatiety(false);

        cats[3] = new Cat();
        cats[3].setName("Базилио");
        cats[3].setAppetite(5);
        cats[3].setSatiety(false);

        cats[4] = new Cat();
        cats[4].setName("Васька");
        cats[4].setAppetite(8);
        cats[4].setSatiety(false);

        return cats;
    }

    public static void feedTheCats(){

        for (Cat cat : createArrayCats()) {
            if (cat.eat(plate)) {
                cat.setSatiety(true);
                out.println(cat.getName() + " сытость -> " + cat.isSatiety());
            } else {
                out.println(cat.getName() + " сытость -> " + cat.isSatiety() + " не хватило "
                        + (cat.getAppetite() - plate.getFood()));
            }
        }
    }

}
