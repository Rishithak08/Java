import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArryListEx {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList();
        li.add(99);
        li.add(66);
        li.add(77);
        li.add(66);

        //li.stream().forEach(System.out::println);

        //li.stream().filter((i)->i==66).forEach(System.out::println);

        int sum = li.stream().reduce((a, b) -> a + b).get();
        System.out.println(sum);
    }

}
