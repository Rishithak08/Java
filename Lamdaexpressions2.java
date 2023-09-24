package java8;

@FunctionalInterface
interface Sample2{
    void numbers(int i, int j);
}

interface Sample3{
    void integers(int i, int j);
}


public class Lamdaexpressions2 {
    public static void main(String[] args) {
        Sample2 sum=(i,j)-> System.out.println(i*j);
        sum.numbers(5,6);

        Sample2 ss=(a,b)-> System.out.println(a/b);
        ss.numbers(10,5);
    }

}
