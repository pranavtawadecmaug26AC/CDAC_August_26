import java.util.Scanner;

class SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sorting
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Calculate sum - Q.3
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("\n");
        System.out.println("Sum of array = " + sum);

        // avg. value of array element = Q.4 
        double average = (double) sum / n;
        System.out.println("Average = " + average);

        // Copy array - Q.5
        int[] copy = new int[n];

        for (int itemp = 0; itemp < n; itemp++) {
            copy[itemp] = arr[itemp];
        }

        System.out.println("Copied array:");

        for (int itemp = 0; itemp < n; itemp++) {
            System.out.print(copy[itemp] + " ");
        }

        // Maximum and Minimum - Q.6
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\n");
        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);

        // Reverse array - Q.7
        System.out.println("Reverse array:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        // Duplicate values - Q.8
        System.out.println("\n");
        System.out.println("Duplicate values:");

        for (int i = 0; i < n - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
