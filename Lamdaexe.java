import java.util.function.Predicate;

@FunctionalInterface
interface oops{
    abstract void bow();

   public static void run(){
       System.out.println("run");
   }
}


public class Lamdaexe {
    public static void main(String[] args) {

        oops b=()->System.out.println("bow bowwwww");
        b.bow();
        oops.run();


    }
}
