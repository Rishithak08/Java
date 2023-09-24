package java8;

import java.util.Arrays;
import java.util.List;

public class Parallelstream {
    public static void main(String[] args) {

        //List<Integer> li = Arrays.asList(2,5,9,44,65);

       // li.stream().forEach(num-> System.out.println(num +" " +Thread.currentThread().getName()));
       // li.parallelStream().forEach(num-> System.out.println(num +" " +Thread.currentThread().getName()));

        //li.parallelStream().filter(a->a%2==0).forEach(System.out::println);
        List<String> st = Arrays.asList("anila","anitha","arjun","gokesh","sari");
        st.parallelStream().filter(a->a.startsWith("a")).forEach(System.out::println);

    }

}

// print even numbers from list using parallel stream
// list of names print names starting with A using parallel stream
