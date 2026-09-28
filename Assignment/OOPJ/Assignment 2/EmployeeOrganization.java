public class EmployeeOrganization {

    public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();

        int choice;

        do {

            System.out.println("\n================================");
            System.out.println("     EMPLOYEE ORGANIZATION");
            System.out.println("================================");
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("4. Sort");
            System.out.println("7. Exit");
            System.out.println("================================");
            System.out.print("Enter choice: ");

            choice = ConsoleInput.getInt();

            switch (choice) {

                case 1:
                    addEmployee(manager);
                    break;

                case 2:
                    manager.displayEmployees();
                    break;

                case 4:
                    manager.sortByName();
                    break;

                case 7:
                    System.out.println("Exiting Employee Organization...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);
    }

    public static void addEmployee(EmployeeManager manager) {

        int choice;

        do {

            System.out.println("\n===== ADD EMPLOYEE =====");
            System.out.println("1. Manager");
            System.out.println("2. Engineer");
            System.out.println("3. Sales Person");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = ConsoleInput.getInt();

            switch (choice) {

                case 1:
                    addManager(manager);
                    break;

                case 2:
                    addEngineer(manager);
                    break;

                case 3:
                    addSalesPerson(manager);
                    break;

                case 4:
                    System.out.println("Returning to main menu...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    public static void addManager(EmployeeManager manager) {

        System.out.println("\n===== MANAGER =====");

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();

        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Basic Salary: ");
        float basicSalary = ConsoleInput.getFloat();

        System.out.print("Enter HRA: ");
        float hra = ConsoleInput.getFloat();

        Manager managerObject =
                new Manager(name, address, gender, basicSalary, hra);

        manager.addEmployee(managerObject);
    }

    public static void addEngineer(EmployeeManager manager) {

        System.out.println("\n===== ENGINEER =====");

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();

        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Basic Salary: ");
        float basicSalary = ConsoleInput.getFloat();

        System.out.print("Enter Over-time: ");
        float overtime = ConsoleInput.getFloat();

        Engineer engineerObject =
                new Engineer(name, address, gender, basicSalary, overtime);

        manager.addEmployee(engineerObject);
    }

    public static void addSalesPerson(EmployeeManager manager) {

        System.out.println("\n===== SALES PERSON =====");

        System.out.print("Enter Name: ");
        String name = ConsoleInput.getString();

        System.out.print("Enter Address: ");
        String address = ConsoleInput.getString();

        System.out.print("Enter Gender: ");
        String gender = ConsoleInput.getString();

        System.out.print("Enter Basic Salary: ");
        float basicSalary = ConsoleInput.getFloat();

        System.out.print("Enter Commission: ");
        float commission = ConsoleInput.getFloat();

        SalesPerson salesPersonObject =
                new SalesPerson(name, address, gender,
                        basicSalary, commission);

        manager.addEmployee(salesPersonObject);
    }
}
