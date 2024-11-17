import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Multiply the numbers
        double result = num1 * num2;

        // Output the result
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}
