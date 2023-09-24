package java8;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Practice3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrL = new ArrayList<>();
        arrL.add(10);
        arrL.add(7);
        arrL.add(7);
        arrL.add(8);
        arrL.add(7);
        arrL.add(9);
        // Use a HashSet to filter out distinct values
       HashSet<Integer> distinctNumbers = new HashSet<>(arrL);

        System.out.println("Distinct values:");

        distinctNumbers.forEach(System.out::println);

        // Print the distinct values
       /* System.out.println("Distinct values:");
        distinctNumbers.forEach(System.out::println);*/
    }
}

        // Print the distinct values
       /* System.out.println("Distinct values:");
        distinctNumbers.for*/


