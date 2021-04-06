package Lesson2_2;

public class Main {

    static final int ROW = 4;
    static final int COLUMN = 4;

    public static void main(String[] args) {

        String[][] strings = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}};

        try {
            System.out.println(sumArray(strings));
        }catch (ArrayIndexOutOfBoundsException e){
            throw new  MyArraySizeException("Размерность массива не равна 4х4");
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }

    }

    public static int sumArray (String[][] myArray) throws NumberFormatException, ArrayIndexOutOfBoundsException{

        int sumArray_ = 0;

        if (myArray.length == ROW){
            for (int i = 0; i <= myArray.length - 1; i++){
                if (myArray[i].length != COLUMN){
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        }else {
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i = 0; i <= myArray.length - 1; i++) {
            for (int j = 0; j <= myArray[i].length - 1; j++){
                try {
                    sumArray_ += Integer.parseInt(myArray[i][j]);
                }catch (NumberFormatException e){
                    throw new  MyArrayDataException("строка-" + (i+1) + " столбец-" + (j+1) + " символ->" + myArray[i][j] +
                    " не может быть преобразован в int!");
                }
            }
        } return sumArray_;
    }
}
