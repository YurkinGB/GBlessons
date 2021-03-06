package Lesson5;

import Lesson5.Employee;

import static java.lang.System.*;

public class Lesson5Obj {

    static final int VOL_EMP = 5;

    public static void main(String[] args) {

        Employee[] empArray = new Employee[VOL_EMP];

        empArray[0] = new Employee("Ivanov Ivan", "programmer", "ivanov@mail.ru",
                "89280000000", 65000, 30);
        empArray[1] = new Employee("Petrov Petr", "manager", "petrov@mail.ru",
                "89281000000", 32000, 41);
        empArray[2] = new Employee("Sidorov Oleg", "developer", "sidorov@mail.ru",
                "89282000000", 75000, 39);
        empArray[3] = new Employee("Zverev Roman", "programmer", "romazver@mail.ru",
                "89283000000", 65000, 43);
        empArray[4] = new Employee("Chicherina Irina", "director", "chicha@mail.ru",
                "89284000000", 65000, 49);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].getAge() > 40) {
                empArray[i].emplInfo();
                out.println("---------------------------------------------------------");
            }
        }

    }
}
