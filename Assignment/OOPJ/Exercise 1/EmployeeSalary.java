class EmployeeSalary {
    int salary;
    int hours;

    void getInfo(int s, int h) {
        salary = s;
        hours = h;
    }

    void addSal() {
        if (salary < 500) {
            salary = salary + 10;
        }
    }

    void addWork() {
        if (hours > 6) {
            salary = salary + 5;
        }
    }

    public static void main(String[] args) {
        EmployeeSalary e = new EmployeeSalary();

        e.getInfo(450, 7);
        e.addSal();
        e.addWork();

        System.out.println("Final salary = $" + e.salary);
    }
}
