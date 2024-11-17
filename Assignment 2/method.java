// Parent Class
class Parent {
    // Method for greeting (overridden by child class)
    public void greet() {
        System.out.println("Hello from Parent!");
    }

    // Overloaded method for addition
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) { // Overloaded with 3 parameters
        return a + b + c;
    }
}

// Child Class
class Child extends Parent {
    @Override
    public void greet() { // Overriding the method from Parent class
        System.out.println("Hello from Child!");
    }
}

// Main Class
public class method {
    public static void main(String[] args) {
        // Demonstrating method overloading
        Parent parent = new Parent();
        System.out.println("Addition of two numbers: " + parent.add(5, 10));
        System.out.println("Addition of three numbers: " + parent.add(5, 10, 15));

        // Demonstrating method overriding
        Parent obj1 = new Parent();
        obj1.greet(); // Calls Parent's greet method

        Child obj2 = new Child();
        obj2.greet(); // Calls Child's overridden greet method
    }
}
