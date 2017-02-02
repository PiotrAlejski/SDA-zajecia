package zajecia;

/**
 * Created by RENT on 2017-01-31.
 */
public class Application {

    public static void main(String[] args) {
        //checkAge();
        //greaterThen();
        //array();
       // displayArray();
        // listEven();
        sumOFArray();
    }


    public static void sumOFArray() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 ==0 ) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }


    public static void listEven() {
        int[] array = {2,4,1,22,4,63,2,3,6};
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 0 ) {
                System.out.println(array[i]);
            }
        }
    }


public static void displayArray() {
            //wyswietl elemnty tablicy
            int[] array = {1, 3, 2, 5, 7, 4, 2};
            for (int i = 0; i <array.length; i++) {
                System.out.println(array[i]);
            }
        }






    public static void array (){
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int index = 2;
        if (index > 0 && index < array.length){
            if (array[index]%2==0) {
                System.out.println("liczba jest parzysta");
            } else {
                System.out.println("liczba nie parzysta");
            }
        }

    }




public static void even() {

    int liczba = 4 ;
    if (liczba % 2 == 0) {
        System.out.println("liczba parzysta");
    }else {
        System.out.println("liczba nie parzysta");
    }



}






    public static void greaterThan0(){


        //sprawdzic czy uzytkownik jest pelnoletni
        int liczba = -3;
        if ( liczba > 0 ) {
            System.out.println("OK");
        }else {
            System.out.println("wrong data");

        }
    }

    public static void chekAge() {
        int age = 13;
        String okMessage = "under 18. Your age is" + age;
        if (age < 18) {
            System.out.println("under 18");

        } else {
            System.out.println("jestes pelnoletni");
        }
        System.out.println("the end");
    }
}
