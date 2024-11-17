// Parent class
class Shape {
    // Method to display type of shape
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass: Square
class Square extends Shape {
    private double side;

    // Constructor for Square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    public double getArea() {
        return side * side;
    }

    @Override
    public void displayShape() {
        System.out.println("This is a square.");
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    private double length;
    private double breadth;

    // Constructor for Rectangle
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        return length * breadth;
    }

    @Override
    public void displayShape() {
        System.out.println("This is a rectangle.");
    }
}

// Subclass: Cube (3D shape derived from square)
class Cube extends Square {
    // Constructor for Cube
    public Cube(double side) {
        super(side); // Call the parent constructor for square
    }

    // Method to calculate the volume of the cube
    public double getVolume() {
        double side = super.getArea(); // Side from square area
        return Math.sqrt(side) * Math.sqrt(side) * Math.sqrt(side); // side^3
    }

    @Override
    public void displayShape() {
        System.out.println("This is a cube.");
    }
}

// Main class
public class shapes {
    public static void main(String[] args) {
        // Create a square object
        Square square = new Square(4);
        square.displayShape();
        System.out.println("Area of square: " + square.getArea());

        // Create a rectangle object
        Rectangle rectangle = new Rectangle(4, 5);
        rectangle.displayShape();
        System.out.println("Area of rectangle: " + rectangle.getArea());

        // Create a cube object
        Cube cube = new Cube(3);
        cube.displayShape();
        System.out.println("Volume of cube: " + cube.getVolume());
    }
}

