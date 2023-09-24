import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<Integer>ss = new ArrayList<>() ;
        ss.add(67);
        ss.add(70);
        ss.add(34);
        ss.add(12);

        //print even numbers
        ss.stream().filter(a->a%2==0).collect(Collectors.toList()).forEach(System.out::println);
    }
}
