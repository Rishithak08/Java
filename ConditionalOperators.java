public class ConditionalOperators {
    public static void main(String[] args) {
        int a= 200;
        int b=33;
        int c=100;

        if(a>b && a >c){
            System.out.println("a is greater");
        }
        else if(b>a && b>c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }

    }
}
