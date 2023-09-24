public class Opps {

    int age;
    String name;

    Opps(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public static void main(String[] args) {
        Opps ss = new Opps(12, "rishi");
        System.out.println(ss.age);
        System.out.println(ss.name);

    }
}
