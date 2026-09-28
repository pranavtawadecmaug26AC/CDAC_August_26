public class EmployeeManager {

    private Employee employees[];
    private int count;

    public EmployeeManager() {
        employees = new Employee[100];
        count = 0;
    }

    public void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee added successfully.");

        } else {
            System.out.println("Employee storage is full.");
        }
    }

    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No employees available.");
            return;
        }

        System.out.println("\n===== Employee List =====");

        for (int i = 0; i < count; i++) {

            System.out.println("\n-------------------------");
            employees[i].display();
        }
    }

    public void sortByName() {

        if (count <= 1) {
            System.out.println("Nothing to sort.");
            return;
        }

        // Manual sorting - no built-in sort method
        for (int i = 0; i < count - 1; i++) {

            for (int j = 0; j < count - i - 1; j++) {

                if (employees[j].getName()
                        .compareToIgnoreCase(employees[j + 1].getName()) > 0) {

                    Employee temp = employees[j];

                    employees[j] = employees[j + 1];

                    employees[j + 1] = temp;
                }
            }
        }

        System.out.println("Employees sorted by name successfully.");
    }
}
