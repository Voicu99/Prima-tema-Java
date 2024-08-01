import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Step 1: Simple Output
        System.out.println("Librimir Voicu");
        System.out.println(25);
        System.out.println("Blue");

        // Step 2: Using Variables
        int myInt = 25;
        double myDouble = 7.14;
        char myChar = 'V';
        String myString = "Homework";

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("String: " + myString);

        // Step 3: Operations on User Input
        Scanner scanner = new Scanner(System.in);

        int inputNum1 = getIntInput(scanner, "Enter the first number: ");
        int inputNum2 = getIntInput(scanner, "Enter the second number: ");

        // Perform operations
        int addition = inputNum1 + inputNum2;
        int subtraction = inputNum1 - inputNum2;
        int multiplication = inputNum1 * inputNum2;
        double division = (double) inputNum1 / inputNum2;
        int modulus = inputNum1 % inputNum2;

        // Print results of operations
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        int num;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }
        return num;
    }
}
