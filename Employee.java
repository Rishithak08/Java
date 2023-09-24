package java8;

import java.util.Arrays;
import java.util.List;

public class Employee {

    int employeeId;
    String name;
    int salary;
    String dept;

    public Employee(int employeeId, String name, int salary, String dept) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName(){

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';

    }
    public List<Employee> getEmpList() {
        return Arrays.asList(
                new Employee(1, "Zacharias", 101146, "IT"),
                new Employee(11, "Kyle",  29310, "IT"),
                new Employee(111, "Axe",  62291, "Admin"),
                new Employee(1111, "Robinet", 142439, "Admin"),
                new Employee(23, "Zulick",  128764, "dev"),
                new Employee(23232, "Tailor",  152924, "dev"),
                new Employee(322, "Joete",  128907, "IT"),
                new Employee(232, "Elroy",  2510, "dev")
        );
    }


    public static void main(String[] args) {
        Employee ss = new Employee(234,"durgesh",56789,"it");
        Employee ss1 = new Employee();

        ss1.setEmployeeId(678);
        ss1.setName("rishitha");
        ss1.setSalary(89156);
        ss1.setDept("cs");
        System.out.println(ss1.toString());
        System.out.println(ss.toString());


    }
}
