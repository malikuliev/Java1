
package TryCatch;
import java.util.Scanner;

public class EvIsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 1. Basic Try-Catch
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
     
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            // 2. Multiple Catch Blocks
            System.out.println("Error: Please enter valid numeric values.");
        } finally {
            // 3. Finally Block
            System.out.println("End of the program.");
            scanner.close();
        }

        // 4. Throwing an Exception
        try {
            int number = -5;
            checkNegativeNumber(number);
            System.out.println("Number is not negative.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 5. Custom Exception
        try {
            int number = 110;
            checkRange(number);
            System.out.println("Number is within the specified range.");
        } catch (OutOfRangeValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int divideNumbers(int numerator, int denominator) {
        return numerator / denominator;
    }

    private static void checkNegativeNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
    }

    private static void checkRange(int number) throws OutOfRangeValueException {
        if (number < 0 || number > 100) {
            throw new OutOfRangeValueException("Number is outside the specified range (0-100).");
        }
    }
}

class OutOfRangeValueException extends Exception {
    public OutOfRangeValueException(String message) {
        super(message);
    }
}
