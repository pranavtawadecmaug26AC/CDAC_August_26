public class Engineer extends Employee {

    private float overtime;

    public Engineer(String name, String address, String gender,
                    float basicSalary, float overtime) {

        super(name, address, gender, basicSalary);
        this.overtime = overtime;
    }

    public float getOvertime() {
        return overtime;
    }

    @Override
    public void display() {

        System.out.println("Employee Type : Engineer");
        System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Gender        : " + gender);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Over-time     : " + overtime);
    }
}
