class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + id + " " + salary);
    }
}
public class Employeemain {
    public static void main(String[] args) {
        Employee Emp=new Employee("mayur", 01, 100000);
         Employee Emp1=new Employee("mitheel", 01, 100000);

         Emp.display();
         Emp1.display();

    }
    
}
