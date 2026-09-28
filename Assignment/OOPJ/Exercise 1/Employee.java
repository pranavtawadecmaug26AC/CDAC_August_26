class Employee {
    String name;
    int year;
    double salary;
    String address;

    // Constructor
    Employee(String n, int y, double s, String a) {
        name = n;
        year = y;
        salary = s;
        address = a;
    }

    public static void main(String[] args) {

        Employee e1 = new Employee("Robert", 1994, 50000, "64C- WallsStreat");
        Employee e2 = new Employee("Sam", 2000, 55000, "68D- WallsStreat");
        Employee e3 = new Employee("John", 1999, 60000, "26B- WallsStreat");

        System.out.println("Name\tYear of joining\tAddress");
        System.out.println(e1.name + "\t" + e1.year + "\t\t" + e1.address);
        System.out.println(e2.name + "\t" + e2.year + "\t\t" + e2.address);
        System.out.println(e3.name + "\t" + e3.year + "\t\t" + e3.address);
    }
}
