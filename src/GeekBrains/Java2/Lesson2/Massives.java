package GeekBrains.Java2.Lesson2;

public class Massives {

    public void castStringToIntAndSum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (checkArraySize(strings)) {
            for (int i = 0; i < strings.length; i++) {
                for (int j = 0; j < strings[i].length; j++) {
                    try {
                        sum += Integer.parseInt(strings[i][j]);
                    } catch (Exception ex) {
                        throw new MyArrayDataException("can't cast to int:array[" + i + "][" + j + "]:" + strings[i][j], ex);
                    }
                }
            }
            System.out.println("Sum = " + sum);
        }
    }

    private boolean checkArraySize(String array[][]) throws MyArraySizeException {
        if (array.length == 4) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].length < 4) {
                    throw new MyArraySizeException("Array size:" + array.length + " " + array[i].length);
                }
            }
        }
        return true;
    }
}

