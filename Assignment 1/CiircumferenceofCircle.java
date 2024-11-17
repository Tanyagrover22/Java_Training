import java.util.Scanner;

public class CiircumferenceofCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 2 * Math.PI * radius;

        // Output the result
        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();
    }
}

