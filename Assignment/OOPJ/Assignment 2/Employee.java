public abstract class Employee {

    protected String name;
    protected String address;
    protected String gender;
    protected float basicSalary;

    public Employee(String name, String address, String gender, float basicSalary) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public abstract void display();
}
