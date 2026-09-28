// BoxVolumeCalculator.java

import java.util.Scanner;

class Box {

    private double width;
    private double height;
    private double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume() {
        return width * height * depth;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double depth = sc.nextDouble();

        Box box = new Box(width, height, depth);

        System.out.println("Volume = " + box.volume());
        System.out.printf("Volume = %.0f", box.volume());


    }
}
