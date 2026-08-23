// Q.6 Print All Elements of an Array

import java.util.Scanner;

class AllArrayElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numbers[] = new int[5];

        System.out.print("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
