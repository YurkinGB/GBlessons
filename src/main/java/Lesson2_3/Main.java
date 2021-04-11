package Lesson2_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("Полиморфизм", "Инкапсуляция", "Наследование", "Класс",
                "Объект", "Очередь", "Полиморфизм", "Массив", "Наследовние", "Инкапсуляция", "Очередь",
                "Очередь", "Массив"));

        HashMap<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            if (map.containsKey(s)) {
                Integer k = map.get(s);
                k += 1;
                map.put(s, k);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println("Через Map " + map);

        //тоже вариант
        Set<String> hSet = new HashSet<>(strings);
        System.out.print("Через HashSet ");
        for (String s : hSet) {
            int j = 0;
            for (int i = 0; i <= strings.size() - 1; i++) {
                if (s.equals(strings.get(i))) {
                    j += 1;
                }
            }
            System.out.print(s + "->" + j + " ");
        }

        //2 часть задания
        PhonBook phonBook = new PhonBook();

        phonBook.add("Петр", "111-111");
        phonBook.add("Петр", "111-222");
        phonBook.add("Петр", "111-333");
        phonBook.add("Андрей", "333-999");
        phonBook.add("Юля", "666-777");
        phonBook.add("Олег", "000-555");
        phonBook.add("Анатолий", "137-371");
        phonBook.add("Михаил", "222-555");
        phonBook.add("Юля", "888-999");

        System.out.println("\n--------------------------------------");
        System.out.println(phonBook.phoneBook.get("Юля"));

    }

}
