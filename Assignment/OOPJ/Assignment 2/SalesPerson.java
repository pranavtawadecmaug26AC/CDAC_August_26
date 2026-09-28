public class SalesPerson extends Employee {

    private float commission;

    public SalesPerson(String name, String address, String gender,
                       float basicSalary, float commission) {

        super(name, address, gender, basicSalary);
        this.commission = commission;
    }

    public float getCommission() {
        return commission;
    }

    @Override
    public void display() {

        System.out.println("Employee Type : Sales Person");
        System.out.println("Name          : " + name);
        System.out.println("Address       : " + address);
        System.out.println("Gender        : " + gender);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Commission    : " + commission);
    }
}
