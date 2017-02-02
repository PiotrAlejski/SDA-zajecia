package zajecia;

/**
 * Created by RENT on 2017-02-02.
 */
public class Zjecia3 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, -2, 4, -3};
        int sumOFnumbers = sumOF(numbers);
        System.out.println(sumOFnumbers);
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOF(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPositive(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }
}
