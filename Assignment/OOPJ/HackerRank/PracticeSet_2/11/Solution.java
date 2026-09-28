import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        try {
            int[] arr = new int[2];
            
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            
            int result = arr[0] / arr[1];
            
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        }
    }
}