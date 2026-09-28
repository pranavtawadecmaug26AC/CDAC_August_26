class Triangle {
    double side1, side2, side3;

    Triangle(double a, double b, double c) {
        side1 = a;
        side2 = b;
        side3 = c;
    }

    // calculating perimeter
    double perimeter() {
        return side1 + side2 + side3;
    }

    // calculating area by Heron's formula
    double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);

        System.out.println("Area = " + t.area());
        System.out.println("Perimeter = " + t.perimeter());
    }
}