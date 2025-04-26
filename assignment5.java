abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends Employee {
    int monthlySalary;

    FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    void calculateSalary() {
        System.out.println("Full time salary of " + name + " is: " + monthlySalary);
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    int hourlyRate;

    PartTimeEmployee(String name, int hoursWorked, int hourlyRate) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        int salary = hoursWorked * hourlyRate;
        System.out.println("Part time salary of " + name + " is: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("Amit", 30000);
        PartTimeEmployee pte = new PartTimeEmployee("Ravi", 100, 200);

        fte.calculateSalary();
        pte.calculateSalary();
    }
}