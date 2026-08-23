// Q.3
class EvenNumbers {

    static void printEvenNumbers() {
        int n = 1;
		
		while (n <= 50) {
			if (n % 2 == 0) {
				System.out.println(n + "");
			}
			n++;
		}
    }

    public static void main(String[] args) {
		EvenNumbers.printEvenNumbers();
    }
}
