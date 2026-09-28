public class Program {
    public static void main(String[] args){

        // System.out.println("Enter the First Number");
        // int num1 = getInt();
        // System.out.println("Enter the Second Number");
        // int num2 = getInt();

        System.out.println("Enter the First Number");
        float num1 = getFloat();
        System.out.println("Enter the Second Number");
        float num2 = getFloat();


        double result = num1 + num2;

        System.out.println(result);


    }
    
    public static float getFloat() 
    {
        String objString = getString();

        float data = Float.parseFloat(objString);
        return data;

    }

    public static int getInt() 
    {
        // String objString = getString();

        // int data = Integer.parseInt(objString);
        // return data;

        return Integer.parseInt(getString());

    }

    public static String getString() 
    {
        try 
        {
          byte arrInput[] = new byte [100] ; //Heap 

        //   System.out.println("Enter the Value"); // even if you like remove it not matter in code anyway

        int length = System.in.read(arrInput);

        byte [] arrFinal = new byte [length - 2];

        System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

        String objString = new String(arrFinal);

        return  objString;  

        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return  null;
    }
}