import java.util.Scanner;

public class InvertedTrianglePattern{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the inverted triangle: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
