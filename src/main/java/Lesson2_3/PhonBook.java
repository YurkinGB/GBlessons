package Lesson2_3;

import java.util.ArrayList;
import java.util.HashMap;

public class PhonBook {

     HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String name, String number){
        ArrayList<String> np;
        if (phoneBook.containsKey(name)){
            np = phoneBook.get(name);
        }else {
            np = new ArrayList<>();
        }
        np.add(number);
        phoneBook.put(name, np);
    }

}
