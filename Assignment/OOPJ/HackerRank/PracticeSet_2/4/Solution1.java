// gives text cases fail although output is same
import java.util.Scanner;

class Patient {

    private String name;
    private double weight;
    private double height;

    Patient(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    double BMI() {
        return (weight / (height * height)) * 703;
    }

    public String getName() {
        return name;
    }

}

class Patients {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double weight = sc.nextDouble();
        double height = sc.nextDouble();

        Patient patient = new Patient(name, weight, height);

        System.out.println("Patient Name:" + patient.getName());
        // System.out.println("BMI = " + patient.BMI());
        System.out.printf("BMI = %.2f", patient.BMI());

    }
}
