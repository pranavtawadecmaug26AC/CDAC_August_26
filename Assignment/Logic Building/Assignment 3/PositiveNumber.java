// Q.4
import java.util.Scanner;

class PositiveNumber {

    static void  askForPositiveNumber() {
		Scanner sc = new Scanner(System.in);
        int n;
		
		do {
            System.out.print("Enter a positive number: ");
			n = sc.nextInt();
            
        } while (n <= 0);

        System.out.println("You entered a positive number: " + n);
    }

    public static void main(String[] args) {
		PositiveNumber.askForPositiveNumber();
    }
}
