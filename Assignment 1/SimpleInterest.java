
import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, and time
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Calculate total amount
        double totalAmount = principal + simpleInterest;

        // Output the result
        System.out.println("The simple interest is: " + simpleInterest);
        System.out.println("The total amount (Principal + Interest) is: " + totalAmount);

        scanner.close();
    }
}
