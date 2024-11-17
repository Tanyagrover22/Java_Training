import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, time, and number of times interest is compounded
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        System.out.print("Enter the time in years: ");
        int time = scanner.nextInt();

        // Convert the interest rate from percentage to decimal
        rate = rate / 100;

        // Calculate the compound interest
        double amount = principal * Math.pow(1 + rate / n, n * time);
        double compoundInterest = amount - principal;

        // Output the result
        System.out.println("The compound interest is: " + compoundInterest);
        System.out.println("The total amount (Principal + Interest) is: " + amount);

        scanner.close();
    }
}
