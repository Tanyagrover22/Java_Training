import java.util.Scanner;

// Class for handling logic
class NumberChecker {
    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}

// Main class to handle user interaction
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the NumberChecker class
        NumberChecker numberChecker = new NumberChecker();

        // Prompt the user to enter a number
        System.out.print("Enter a number to check if it's odd or even: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (numberChecker.isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Closing the scanner
        scanner.close();
    }
}
