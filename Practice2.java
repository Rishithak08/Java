package java8;

import java.util.ArrayList;


public class Practice2 {

    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(10);
        arrL.add(7);
        arrL.add(7);
        arrL.add(8);


        arrL.stream().filter(number -> number == 7).forEach(System.out::println);
        //for (int number : arrL) {
           // if (number == 7) {
                //System.out.println(number);
           // }
        //}


    }
}
