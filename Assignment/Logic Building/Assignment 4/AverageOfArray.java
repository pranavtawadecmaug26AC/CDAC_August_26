// Q.10 Find the Average of Elements in an Array

import java.util.Scanner;

class AverageOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.print("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            sum = sum + numbers[i];
        }

		int average = sum / 5;

        System.out.println("The average of the numbers is: " + average);
    }
}
