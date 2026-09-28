class NumberPattern {
    public static void main(String[] args) {

        int num = 1;

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }

        System.out.println("*");

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        System.out.println("*");

        for (int i = 6; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
