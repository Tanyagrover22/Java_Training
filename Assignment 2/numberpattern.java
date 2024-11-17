import java.util.Scanner;

public class numberpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows
        System.out.print("Enter the number of rows for the number triangle: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print the number 'i', repeated 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
