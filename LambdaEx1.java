package java8;

@FunctionalInterface
interface Sample1{
   public  void dance();
}


public class LambdaEx1 {
    public static void main(String[] args) {
       /* Sample1 ss=()-> System.out.println("classical dance");
        ss.dance();*/
        Sample1 obj=new Sample1(){
           public void dance()
            {
                System.out.println("dancing");
            }
        };

        obj.dance();

    }
}
