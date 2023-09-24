package java8;

public class ReturnEx {

    public int sum(int a, int b){
        int c=a+b;
        return c;
    }
    public void sleep(){
        System.out.println("sleeping");
    }

    public static void main(String[] args) {
        ReturnEx r=new ReturnEx();
        System.out.println(r.sum(5,6));
        r.sleep();

    }
}
