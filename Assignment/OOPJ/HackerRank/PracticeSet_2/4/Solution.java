// all right

import java.util.*;

class Patient {
    private String name;
    private double weight;
    private double height;
    
    Patient(String name, double weight, double height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    double BMI() {
        return (weight / (height * height)) * 703;
    }
    
    public String getName(){
        return name;
    }
    
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        double weight = sc.nextDouble();
        double height = sc.nextDouble();
                
        Patient obj = new Patient(name, weight, height);
        
        System.out.println("Patient Name: "+obj.getName());
        System.out.printf("BMI = %.2f", obj.BMI());
    }
}