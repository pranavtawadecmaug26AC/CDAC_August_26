// Q.24 Reverse a String

import java.util.Scanner;

class ReverseString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Reversed string: " + sb.reverse());
    }
}
