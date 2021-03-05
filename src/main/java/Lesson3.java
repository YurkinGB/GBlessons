import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Lesson3 {

    static Random random = new Random();
    static Scanner scanner = new Scanner(in);
    static final int ATTEMPS = 3;
    static int resume, wordsId;
    static String aiWord, userWord;
    static boolean win;
    static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};


    public static void main(String[] args) {

        do {
            int aiNumb = random.nextInt(10);

            out.println("\nКомпьютер загадал число от 0 до 9");
            out.println("попробуйте отгадать его за 3 попытки.");

            for (int i = 0; i < ATTEMPS; i++) {
                if (checkWin(aiNumb, checkResp())) break;
            }

            out.print("Игра окончена, чтобы продолжить введите - 1 / для завершения игры - 0 -> ");

            resume = scanner.nextInt();

        } while (resume == 1);

        //задание 2
        wordsId = random.nextInt(words.length);
        aiWord = words[wordsId];

        gameConditions();

        do {
            userWord = chekUserWord();
            win = game(aiWord, userWord);
        }while (!win);

        scanner.close();

    }



    public static boolean checkWin(int aiN, int res){
        if (res == aiN) {
            out.println("Вы выиграли!!!");
            return true;
        }
        else if (res < aiN){
            out.println("Загаданое чило больше");
            return false;
        }
        else {
            out.println("Загаданое число меньше");
            return false;
        }
    }

    public static int checkResp(){
        int resp;
        do {
            resp = scanner.nextInt();
            if ((resp < 0) || (resp > 9)){
                out.println("Число должно быть >= 0 и >= 9");}
        } while ((resp < 0) || (resp > 9));

            return resp;
    }



    public static void gameConditions(){
        out.println("\n\nКомпьютер загадал слово из списка:");

        for (int i = 0; i < words.length; i++) {
            if (i % 13 == 0) {
                out.print("\n");
            }
            out.print(words[i] +" ");
        }

        out.print("\n");

    }

    public static String chekUserWord() {
        boolean chekWord = true;
        String usWord;

        do {
            out.println("\nВыберите слово из списка.");
            usWord = scanner.next();
            for (String str : words) {
                if (str.equals(usWord)){
                    chekWord = false;
                }
            }

        }while (chekWord);

        return usWord;
    }

    public  static void hint(String aWord, String usWord){
        for (int i = 0; i < 15; i++){
            if (aWord.length() > i && usWord.length() > i && aWord.charAt(i) == usWord.charAt(i)){
                out.print(aWord.charAt(i));
            }else {
                out.print("#");
            }
        }

    }

    public static boolean game(String aWord, String usWord){
        boolean checkWord = false;
        if (aWord.equals(usWord)) {
            out.println("Вы выиграли!!!");
            checkWord = true;
        } else {
            hint(aWord, usWord);
        }
        return checkWord;
    }

}
