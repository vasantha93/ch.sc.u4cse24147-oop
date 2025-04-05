class Person {
    String name;
    int age;

    void getDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Employee extends Person {
    String employeeId;

    void setEmployeeId(String id) {
        this.employeeId = id;
    }

    void showEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
    }
}
interface Department {
    void setDepartment(String dept);
    void showDepartment();
}
class Manager extends Employee implements Department {
    String department;

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public void showDepartment() {
        System.out.println("Department: " + department);
    }

    void showManagerInfo() {
        showDetails();
        showEmployeeInfo();
        showDepartment();
    }
}
public class Managerinformation{
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.getDetails("Alice", 35);
        mgr.setEmployeeId("EMP123");
        mgr.setDepartment("Sales");

        System.out.println("------Manager Info-------");
        mgr.showManagerInfo();
    }
}
