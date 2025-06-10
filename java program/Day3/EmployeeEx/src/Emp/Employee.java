package Emp;

public class Employee {

	
		  // Instance variables
	    String name;
	    int id;

	    // Static variable
	    static int employeeCount = 0;

	    // Constructor
	    public Employee(String name, int id) {
	        this.name = name;
	        this.id = id;
	        employeeCount++;  // Incrementing static variable
	    }

	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name);

	}
	    public static void main(String[] args) {
	    	Employee e1 = new Employee("Deepali", 10);
	        Employee e2 = new Employee("Aditi", 12);

	        e1.display();
	        e2.display();

	        System.out.println("Total Employees: " + Employee.employeeCount);

	    }

}
