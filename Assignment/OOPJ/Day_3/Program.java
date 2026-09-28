public class Program {
    public static void main(String[] args){

        System.out.println("Enter the First Number");
        float num1 = ConsoleInput.getFloat();

        System.out.println("Enter the Second Number");
        float num2 = ConsoleInput.getFloat();


        //we craetd object bcz Calculator class's method are non-static. We keep them non static just to show you how can we use them nothing more, you can make them static also.

        Calculator objCalculator = new Calculator();
        float result = objCalculator.add(num1, num2);

        System.out.println(result);


    }
    
}