package java8;

import java.util.Collections;
import java.util.HashSet;


public class Practice {
    public static void main(String[] args) {
        HashSet<String> arrL = new HashSet<>();
        arrL.add("10");
        arrL.add("54");
        arrL.add("24");
        arrL.add("48");

        //arrL.stream().forEach(n -> System.out.println(n));
        // here we can use map foe dividing the numbers
       /* arrL.stream().filter(i->i>25).map(i->i/2).forEach(System.out::println);
       //adding  two numbers
        Integer integer = arrL.stream().reduce((a, b) -> (a + b)).get();
        System.out.println(integer);*/

        //multiplying set by 3 and converting string to integer
         //arrL.stream().mapToInt(Integer::parseInt).map(i -> i * 3).forEach(System.out::println);

         //avrage all elements in set
       /* double v = arrL.stream().mapToDouble(Integer::parseInt).average().orElse(5.0);
        System.out.println(v);
*/

        //print set in ascnding order
        //arrL.stream().sorted().forEach(System.out::println);

        //print set in desc order
        arrL.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);


        //create a list of integers and print values equal to 7
        //creates a list of duplicatee elemnts and print only distinct values
    }
}





