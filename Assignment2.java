public class Assignment2 {
    public static void main(String[] args) {
        String literal="Hello World";
        String str = new String("Hello, world!");


        System.out.println(literal+" "+"welcome!");
        String[] substrings = literal.split(" ");
        System.out.println("substrings: ");
        for (String substring : substrings) {
            System.out.println(substring);
        }
        String str2 = "   how are you   ";
        System.out.println(str2.trim());

        boolean startsWithHello = str.startsWith("He");
        System.out.println("str1 starts with \"He\": " + startsWithHello);

        String str3 = "hello";
        System.out.println(str2.toUpperCase());

        String a="hi I am a pigg";
        String sp[]=a.split("\\s");
        for(String ab:sp)
        {
            System.out.println(ab);
        }
        for(int i=0;i<sp.length;i++){
            System.out.println(sp[i]);
        }

    }
}
