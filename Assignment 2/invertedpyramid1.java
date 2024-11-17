import java.util.Scanner;

public class invertedpyramid1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the inverted triangle: ");
        int rows = scanner.nextInt();

        for (int i = rows; i >= 1; i--) {
            // Print stars for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
