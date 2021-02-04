package GeekBrains.Java2.Lesson2;

public class Main {

    public static void main(String[] args) {
        Massives myArClass = new Massives();

        String[][] strings0 = {{"1", "4", "2", "3"}, {"2", "3"}, {"3", "1", "2", "12"}, {"F", "F", "F", "F"}};
        String[][] strings1 = {{"1", "4", "5", "8"}, {"2", "3", "9", "1,"}, {"3", "1", "2", "12"}, {"F", "F", "F", "F"}};
        String[][] strings2 = {{"1", "4", "5", "8"}, {"2", "3", "9", "1"}, {"3", "1", "2", "12"}, {"12", "12", "12", "12"}};

        try {
            myArClass.castStringToIntAndSum(strings0);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }

        try {
            myArClass.castStringToIntAndSum(strings1);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
            ex.printStackTrace();
        }

        try {
            myArClass.castStringToIntAndSum(strings2);
        } catch (Exception ex) {
        }
    }
}
