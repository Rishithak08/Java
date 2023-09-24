public class Threads extends Thread {
    public void run(){
        System.out.println("i am thread");

    }

    public static void main(String[] args) {
        Threads vv = new Threads();
        vv.start();
    }
}
