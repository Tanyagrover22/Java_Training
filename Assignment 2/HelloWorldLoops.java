public class HelloWorldLoops {
    public static void main(String[] args) {
        System.out.println("Using while loop:");
        int countWhile = 0;

        // While loop example
        while (countWhile > 0) {
            System.out.println("Hello, World!");
            countWhile--;
        }

        System.out.println("\nUsing do-while loop:");
        int countDoWhile = 0;

        // Do-while loop example
        do {
            System.out.println("Hello, World!");
            countDoWhile--;
        } while (countDoWhile > 0);
    }
}

