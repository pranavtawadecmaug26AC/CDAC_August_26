import java.util.*;

class Person  {
    protected String name;
    
    Person(String name) {
        this.name = name;
    }
    
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

class Teacher extends Person {
    private double salary;
    private String subject;
    
    Teacher(String name, double salary, String subject) {
        super(name);
        this.salary = salary;
        this.subject = subject;
    }
    
    int getSalary() {
        return (int)salary;
    }

    String getSubject() {
        return subject;
    }
    
}

class CollegeStudent extends Student {
    private int year;
    private String major;
    
    CollegeStudent(String name, int year, String major) {
        super(name);
        this.year = year;
        this.major = major;
    }
    
    int getYear() {
        return year;
    }

    String getMajor() {
        return major;
    }
}



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String teacherName = sc.next();
        double salary = sc.nextDouble();
        String subject = sc.next();
        
        String studentName = sc.next();
        int year = sc.nextInt();
        String major = sc.next();
        
        Teacher teacher = new Teacher(teacherName, salary, subject);
        System.out.println("Teacher Name: " + teacher.name);
        System.out.println("Salary: "+ teacher.getSalary());
        System.out.println("Subject: " + teacher.getSubject());
        
        
        CollegeStudent clgstd = new CollegeStudent(studentName, year, major);
        System.out.println("College Student Name: " + clgstd.name);
        System.out.println("Year: " + clgstd.getYear());
        System.out.println("Major: " + clgstd.getMajor());
        
    }
}