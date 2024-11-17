import java.util.Scanner;

public class SwapNumberWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b; // Step 1: Add both numbers
        b = a - b; // Step 2: Subtract the new value of 'a' by 'b'
        a = a - b; // Step 3: Subtract the new value of 'b' from the new value of 'a'

        System.out.println("After swapping: a = " + a + ", b = " + b);

        scanner.close();
    }
}


