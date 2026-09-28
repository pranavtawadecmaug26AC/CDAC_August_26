public class Program {
    public static void main(String[] args) {

        Date objDate = new  Date();

        // objDate.setyear(2026);
        // objDate.setMonth(2);
        // objDate.setDay(10);

        System.out.println("Enter the day");
        int day = ConsoleInput.getInt();

        System.out.println("Enter the month");
        int month = ConsoleInput.getInt();

        System.out.println("Enter the year");
        int year = ConsoleInput.getInt();

        objDate.setDate(day, month, year);


        

        System.out.println(objDate.getDay() + "/" + objDate.getMonth() + "/" + objDate.getyear());
    }
}