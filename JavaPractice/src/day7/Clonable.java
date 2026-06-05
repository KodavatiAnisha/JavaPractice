package day7;

class Employee implements Cloneable {

    int id;
    String name;
    double salary;

    // Constructor
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Clone method
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Main class
public class Clonable {

    public static void main(String[] args) {

        try {
            // Original object
            Employee emp1 = new Employee(101, "Anisha", 50000);

            // Cloned object
            Employee emp2 = (Employee) emp1.clone();

            // Modify cloned object
            emp2.name = "Priya";
            emp2.salary = 60000;

            // Print original object
            System.out.println("Original Employee:");
            System.out.println("ID: " + emp1.id);
            System.out.println("Name: " + emp1.name);
            System.out.println("Salary: " + emp1.salary);

            // Print cloned object
            System.out.println("\nCloned Employee:");
            System.out.println("ID: " + emp2.id);
            System.out.println("Name: " + emp2.name);
            System.out.println("Salary: " + emp2.salary);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning is not supported.");
        }
    }
}