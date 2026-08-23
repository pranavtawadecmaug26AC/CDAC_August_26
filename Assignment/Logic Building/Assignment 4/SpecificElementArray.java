// Q.13 Check if an Array Contains a Specific Element

import java.util.Scanner;
import java.util.Arrays;

class SpecificElementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer numbers[] = new Integer[5];

        System.out.print("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        if (Arrays.asList(numbers).contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
