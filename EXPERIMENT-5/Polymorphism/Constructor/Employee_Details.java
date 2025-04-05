class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

class ITEmployee extends Employee {
    String skill;

    ITEmployee(String name, String skill) {
        super(name);
        this.skill = skill;
    }

    @Override
    void display() {
        super.display(); // Calls parent class display method
        System.out.println("Skill: " + skill);
    }
}

public class Employee_Details {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        ITEmployee itEmp = new ITEmployee("Bob", "Java");

        // display() method
        System.out.println("Employee Details:");
        emp.display();

        System.out.println("\nIT Employee Details:");
        itEmp.display();
    }
}
