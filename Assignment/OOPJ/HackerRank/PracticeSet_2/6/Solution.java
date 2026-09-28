import java.util.*;

class Person {
    private String name;
    
    Person(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}

class Employee extends Person {
    double annualSalary;
    int yearStarted;
    String insuranceNumber;
    
    Employee(String name, double annualSalary, int yearStarted, String insuranceNumber) {
        super(name);
        
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }
    
    public int getAnnualSalary() {
        return (int)annualSalary;
    }
    
    public int getYearStarted(){
        return yearStarted;
    }
    
    public String getInsuranceNumber(){
        return insuranceNumber;
    }
     
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        double annualSalary = sc.nextDouble();
        int yearStarted = sc.nextInt();
        sc.nextLine();
        String insuranceNumber = sc.nextLine();
        
        Employee emp = new Employee(name, annualSalary, yearStarted, insuranceNumber);
        
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance Number: " + emp.getInsuranceNumber());
    }
}