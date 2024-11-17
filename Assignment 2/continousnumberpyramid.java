import java.util.Scanner;

public class continousnumberpyramid{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the continuous number triangle: ");
        int rows = scanner.nextInt();

        int number = 1; // Start with the first number

        for (int i = 1; i <= rows; i++) {
            // Print numbers continuously for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++; // Increment the number
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
