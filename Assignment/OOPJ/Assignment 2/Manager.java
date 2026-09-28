public class Manager extends Employee {

    private float hra;

    public Manager(String name, String address, String gender,
                   float basicSalary, float hra) {

        super(name, address, gender, basicSalary);
        this.hra = hra;
    }

    public float getHra() {
        return hra;
    }

    @Override
    public void display() {

        System.out.println("Employee Type : Manager");
        System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Gender        : " + gender);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("HRA           : " + hra);
    }
}
