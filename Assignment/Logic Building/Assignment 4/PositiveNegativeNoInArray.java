// Q.11 Count Positive and Negative Numbers in an Array

import java.util.Scanner;

class PositiveNegativeNoInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[6];

        System.out.print("Enter 6 integers: ");

        for (int i = 0; i < 6; i++) {
            numbers[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 6; i++) {

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
    }
}
