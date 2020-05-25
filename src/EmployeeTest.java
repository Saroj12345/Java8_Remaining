import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String toString()
    {
        return "Employee Name: "+name+" age: "+age;
    }
}
public  class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
    }
}
