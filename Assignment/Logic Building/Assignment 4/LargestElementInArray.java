// Q.9 Find the Largest Element in an Array

import java.util.Scanner;
import java.util.Arrays;

class LargestElementInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.print("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
		
		Arrays.sort(numbers);

        System.out.println("The largest element is: " + numbers[4]);
    }
}
