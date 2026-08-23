// Q.2
import java.util.Scanner;

class AgeChecker {

    static void  checkAgeCategory(int age) {
        if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }
    }

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
        int age = sc.nextInt();

		AgeChecker.checkAgeCategory(age);
    }
}
