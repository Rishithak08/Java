import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        System.out.println( " print the value of a");
        int a = ss.nextInt();
        switch(a){
            case 1:
                System.out.println(" jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            default:
                System.out.println("enter correct value");
        }




    }
}


