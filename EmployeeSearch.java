package Chapterall;
 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private String address ;
    
    // Constructor, getter, and setter methods
    public Employee(String id, String name,String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name +" adress "+address;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "John Doe"," newYork"));
        employees.add(new Employee("2", "Jane Smith"," canifonia"));
        employees.add(new Employee("3", "Johnny Depp"," florida"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = scanner.nextLine().toLowerCase();

        // Search employees by name (or other criteria)
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getName().toLowerCase().contains(keyword)) {
                System.out.println(emp);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with keyword: " + keyword);
        }
    }
}


