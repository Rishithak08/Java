package java8;

public class Student {

    int StudentId;
    String Name;
    String clgName;
    String dpt;

    public Student(int studentId, String name, String clgName, String dpt) {
        StudentId = studentId;
        Name = name;
        this.clgName = clgName;
        this.dpt = dpt;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClgName() {
        return clgName;
    }

    public void setClgName(String clgName) {
        this.clgName = clgName;
    }

    public String getDpt() {
        return dpt;
    }

    public void setDpt(String dpt) {
        this.dpt = dpt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", Name='" + Name + '\'' +
                ", clgName='" + clgName + '\'' +
                ", dpt='" + dpt + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student oo = new Student(1234,"rishi","nrcm","ece");
        System.out.println(oo.toString());
    }
}
