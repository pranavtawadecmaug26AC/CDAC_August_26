class Parent
{
    void parentMethod()
    {
        System.out.println("This is parent class");
    }
}

class Child extends Parent
{
    void childMethod()
    {
        System.out.println("This is child class");
    }
}

public class ParentChildMethod
{
    public static void main(String args[])
    {
        // 1. Parent method by parent class object
        Parent p = new Parent();
        p.parentMethod();

        // 2. Child method by child class object
        Child c = new Child();
        c.childMethod();

        // 3. Parent method by child class object
        c.parentMethod();
    }
}
