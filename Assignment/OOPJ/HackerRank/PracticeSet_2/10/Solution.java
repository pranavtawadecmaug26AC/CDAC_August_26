
import java.util.*;

class MyCalculator {

    long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }

        return (long) Math.pow(n, p);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();

        MyCalculator myCalculator = new MyCalculator();

        try {
            System.out.println(myCalculator.power(n, p));
        } catch (Exception e) {
            System.out.println(e);
        }

        // while (sc.hasNextInt()) {
        //     int n = sc.nextInt();
        //     int p = sc.nextInt();

        //     try {
        //         System.out.println(myCalculator.power(n, p));
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        // }

    }
}
