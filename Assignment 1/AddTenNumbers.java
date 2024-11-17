
import java.util.Scanner;

// Class for handling the addition logic
class Adder {
    // Method to calculate the sum of an array of numbers
    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

// Main class to handle user interaction
public class AddTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of the Adder class
        Adder adder = new Adder();
        int[] numbers = new int[10]; // Array to store 10 numbers

        System.out.println("Enter 10 numbers:");

        // Take 10 inputs from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum
        int sum = adder.calculateSum(numbers);

        // Display the result
        System.out.println("The sum of the numbers you entered is: " + sum);

        // Closing the scanner
        scanner.close();
    }
}
