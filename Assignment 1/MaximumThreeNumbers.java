import java.util.Scanner;

// Class for handling logic
class NumberUtils {
    // Method to find the maximum of three numbers
    public int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

// Main class to handle user interaction
public class MaximumThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of NumberUtils class
        NumberUtils numberUtils = new NumberUtils();

        // Prompting the user to enter three numbers
        System.out.println("Enter three numbers to find the maximum:");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the maximum
        int max = numberUtils.findMax(num1, num2, num3);

        // Display the result
        System.out.println("The maximum of the three numbers is: " + max);

        // Closing the scanner
        scanner.close();
    }
}

