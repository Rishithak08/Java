package java8;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;


public  class EmployeeTest {

    public static void main(String[] args) {
        Employee ss = new Employee();
        List<Employee> empList=ss.getEmpList();
        //System.out.println(empList);

        //print emplist
       // empList.stream().forEach(System.out::println);


        //sort base on salary ascending
        //empList.stream().sorted((emp1,emp2)->emp1.getSalary()-emp2.getSalary()).toList().forEach(System.out::println);
        //empList.stream().sorted(Comparator.comparingInt(Employee::getSalary)).toList().forEach(System.out::println);

        //sort base on salary descending
        //empList.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).toList().forEach(System.out::println);

        //sort based on empid descending
        //empList.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId).reversed()).toList().forEach(System.out::println);

        //sort based on name
        //empList.stream().sorted(Comparator.comparing(Employee::getName)).toList().forEach(System.out::println);


        //filter salary > 100000
       // empList.stream().sorted(Comparator.comparing(Employee::getName)).toList().forEach(System.out::println);
          //empList.stream().filter(employee -> employee.getSalary()>100000).collect(Collectors.toList()).forEach(System.out::println);
          //Stream<T> filter(Predicate< super T> predicate);

        //Stream<R> map(Function<? super T, ? extends R> mapper);

        //get all emp dept="IT"
        //empList.stream().filter(employee -> employee.getDept().equals("IT")).toList().forEach(System.out::println);

        //print emp with anme="Axe"
        //empList.stream().filter(employee -> employee.getName().equals("Axe")).toList().forEach(System.out::println);

        //sum of salaries of all emp
       /* IntSummaryStatistics intSummaryStatistics = empList.stream().mapToInt(Employee::getSalary).summaryStatistics();
        System.out.println(intSummaryStatistics);*/

        //print empid>111
        //empList.stream().filter(employee -> employee.getEmployeeId()>111).collect(Collectors.toList()).forEach(System.out::println);


    }

}
