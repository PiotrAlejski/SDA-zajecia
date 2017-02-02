package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-02-01.
 */
public class Zajecia2 {
    /*public static void main(String[] args) {
        //sumOFPositive();
        //isEven(5);
        boolean b = isEven(4);
        int[] array = {1, 2, 4, 4, 5};
        //int number = sumOfEven(array);
        double avg = avgOFeven(array);
        int oddnumber = numberOFodd(array);
        int sumof = sumOF(array);
      //  System.out.println(sumof);
  *//*      Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int number = scanner.nextInt();
        if(isEven(number)) {
            System.out.println("liczba parzysta");
        } else {
                    System.out.println("liczba nieparzysta");
                }*//*
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your name: ");
        String name = scanner.nextLine();
        System.out.println("Insert your last name");
        String lastName = scanner.nextLine();

        System.out.println("insert your age");
        int age = scanner.nextInt();


    }






    public static int sumOF(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int numberOFodd(int[] array) {
        return sumOF(array) - sumOfEven(array);
    }


    public static double avgOFeven(int[] array) {
        double sum = sumOfEven(array);
        int counter = numberofEVEN(array);
        if (counter == 0) {
            return 0;
        }
        return sum / counter;
    }

    public static int numberofEVEN(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++)
            if (isEven(array[i])) {
                counter++;
            }
        return counter;
    }


    public static int sumOfEven(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (isEven(array[i])) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void sumOFPositive() {
        int[] array = {2, 4, -2, 4, -3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}








