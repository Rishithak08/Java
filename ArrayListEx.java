import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListEx {
    public static void main(String[] args) {
       /* ArrayList<Integer> list=new ArrayList();
        list.add(7);
        list.add(7);
        list.add(7);
        list.add(32);
        list.add(1,3);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);*/

        HashSet<String> set=new HashSet<>();
        set.add("hello");
        set.add("dfskjl");
        set.add("hello");
       // System.out.println(set);
        set.remove("dfskjl");
        System.out.println(set);



    }
}
