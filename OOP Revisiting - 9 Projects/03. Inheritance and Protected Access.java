//it23017
class Employee {
    
    protected double baseSalary = 50000.0;

    String name = "Generic Employee";

    public void displaySalary() {
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
    }
}

class Manager extends Employee {
    
    double bonus = 10000.0;

    public void calculateTotalPay() {
        name = "Mr. Smith (Manager)";
        double totalPay = baseSalary + bonus;
        
        System.out.println("Name: " + name);
        System.out.println("Total Pay (Base + Bonus): " + totalPay);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager mgr = new Manager();

        mgr.calculateTotalPay();
        
        System.out.println();

        mgr.displaySalary(); 
    }
}
