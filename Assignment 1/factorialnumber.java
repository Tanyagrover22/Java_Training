import java.util.Scanner;

public class factorialnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Calculate factorial
        long factorial = 1; // long to handle larger numbers
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Output the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
