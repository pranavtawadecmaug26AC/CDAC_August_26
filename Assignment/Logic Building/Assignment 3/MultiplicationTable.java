// Q.5
import java.util.Scanner;

class MultiplicationTable {

    static void printMultiplicationTable (int n) {
		
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n*i);
        }
	
    }

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		MultiplicationTable.printMultiplicationTable(n);
    }
}
