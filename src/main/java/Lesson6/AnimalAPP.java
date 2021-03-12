package Lesson6;

import static java.lang.System.*;

public class AnimalAPP {

    public static void main(String[] args) {

        Animal dog = new Dog("Собака");
        dog.setRun(501);
        dog.setSwim(10);

        Animal cat = new Cat("Кошка");
        cat.setRun(105);
        cat.setSwim(10);

        animalAction(dog);
        animalAction(cat);

        animalAmount();
    }

    public static void animalAction(Animal animal){
        out.println(animal.anRun(animal.getRun()));
        out.println(animal.anSwim(animal.getSwim()));
    }

    public static void animalAmount(){
        out.println("------------------------------------------");
        out.println("Количество животных = " + Animal.animalVol);
        out.println("Количество котов = " + Cat.catVol);
        out.println("Количество собак = " + Dog.dogVol);
    }

}
