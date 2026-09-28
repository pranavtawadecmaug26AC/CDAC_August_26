class Rectangle
{
    private float length;
    private float breadth;

    Rectangle(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    void printArea()
    {
        System.out.println("Area = " + (length * breadth));
    }

    void printPerimeter()
    {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}

class Square extends Rectangle
{
    Square(float side)
    {
        super(side, side);
    }
}

public class RectangleSquare
{
    public static void main(String args[])
    {
        System.out.println("Enter length of rectangle:");
        float length = ConsoleInput.getFloat();

        System.out.println("Enter breadth of rectangle:");
        float breadth = ConsoleInput.getFloat();

        Rectangle rectangle = new Rectangle(length, breadth);

        System.out.println("\nRectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();

        System.out.println("\nEnter side of square:");
        float side = ConsoleInput.getFloat();

        Square square = new Square(side);

        System.out.println("\nSquare:");
        square.printArea();
        square.printPerimeter();
    }
}
