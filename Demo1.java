import java.sql.SQLOutput;

public class Demo1 {
int rolno=10;
String name="rishitha";
String clg="webster";

public void run(){
    System.out.println("running,./.kjhg");
}

public Demo1()
{

}
    public Demo1(int rollNo,String name){
        this.rolno=rollNo;
        this.name=name;
    }
    public Demo1(int rollNo){
        this.rolno=rollNo;    }

public static void main(String args[]){
    Demo1 rr=new Demo1(20,"dhoni");
    System.out.println(rr.clg);
    System.out.println(rr.rolno);
    System.out.println(rr.name);

    Demo1 rd=new Demo1();
   // System.out.println(rd.clg);
  //  System.out.println(rd.rolno);
   // System.out.println(rd.name);
    rd.run();
    System.out.println( rd.name);



    }

}
