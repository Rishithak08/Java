public class Exception extends Throwable {
    public static void main(String[] args) {
        try {
            int a = 25;
            int b = 0;
            System.out.println(a / b);
        }
        catch(java.lang.Exception e){
            System.out.println();
        }
    }
}
