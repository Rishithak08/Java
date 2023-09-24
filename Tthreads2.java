public class Tthreads2 implements Runnable{

    @Override
    public void run() {
        System.out.println("i am in runnable");

    }

    public static void main(String[] args) {
        Tthreads2 rr = new Tthreads2();
        Thread t1=new Thread(rr);
        t1.start();
    }
}
