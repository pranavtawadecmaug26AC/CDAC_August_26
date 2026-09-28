import java.util.*;

class Fruit {
    protected String name;
    protected String taste;
    protected String size;
    
    Fruit(String name, String taste, String size) {
    this.name = name;
    this.taste = taste;
    this.size = size;
}
    
    void eat(){
        System.out.println(name + " tastes " + taste);
    }
}

class Apple extends Fruit {
   Apple(String name, String taste, String size) {
        super(name, taste, size);
    } 
    
    void eat(){
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {
    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }
    
    void eat(){
        System.out.println(name + " tastes " + taste);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String appleName = sc.next();
        String appleTaste = sc.next();
        String appleSize = sc.next();

        String orangeName = sc.next();
        String orangeTaste = sc.next();
        String orangeSize = sc.next();
        
        Apple apple = new Apple(appleName, appleTaste, appleSize);
        apple.eat();
        
        Orange orange = new Orange(orangeName, orangeTaste, orangeSize);
        orange.eat();
    }
}