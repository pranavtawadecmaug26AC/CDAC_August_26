import java.util.*;

class Calculator {
    static  int powerInt(int num1, int num2){
        return (int) Math.pow(num1, num2);
    }
    
    static double powerDouble(double num1, int num2){
        return Math.pow(num1, num2);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        double num3 = sc.nextDouble();
        int num4 = sc.nextInt();
        
        System.err.println("PowerInt = " + Calculator.powerInt(num1, num2));
        System.err.println("PowerDouble = " + Calculator.powerDouble(num3, num4));
    }
}