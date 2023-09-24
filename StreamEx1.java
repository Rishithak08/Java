package java8;

import java.util.ArrayList;

public class StreamEx1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("rishi");
        names.add(0,"reddy");
        names.add("hgdsj");
        names.add("dgh");
        names.add("gfbuyds");

        names.stream().forEach(System.out::println);

        names.stream().filter((i)->i.equals("rishi")).forEach(System.out::println);


        //set should be integer type 1) add all elemnts in set 2) multiply each element by 2





    }
}
