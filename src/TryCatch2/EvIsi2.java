package TryCatch2;
import java.io.IOException;

public class EvIsi2 {
    public static void main(String[] args) {
        // 1. Nested Try-Catch
        try {
            int[] numbers = {1, 2, 3};
            try {
                int result = numbers[4] / 0; // Inner block handles arithmetic exception
                System.out.println("Result: " + result);
            } catch (ArithmeticException innerException) {
                System.out.println("Inner Block: " + innerException.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException outerException) {
            System.out.println("Outer Block: " + outerException.getMessage());
        }

        // 2. Exception Propagation
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in methodA: " + e.getMessage());
        }

        // 3. Multiple Exceptions
        try {
            throwMultipleExceptions();
        } catch (Exception e) {
            System.out.println("Caught multiple exceptions: " + e.getMessage());
        }

        // 4. Using `throws` Keyword
        try {
            methodWithCheckedException();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        // 5. Chained Exceptions
        try {
            methodThatThrowsChainedException();
        } catch (Exception e) {
            System.out.println("Caught chained exception: " + e.getMessage());
            System.out.println("Original cause: " + e.getCause().getMessage());
        }
    }

    private static void methodA() throws Exception {
        methodB();
    }

    private static void methodB() throws Exception {
        throw new Exception("Exception thrown in methodB");
    }

    private static void throwMultipleExceptions() {
        try {
            int result = 5 / 0; 
            String str = null;
            str.length(); 
        } catch (Exception e) {
            throw new RuntimeException("Multiple exceptions occurred", e);
        }
    }

    private static void methodWithCheckedException() throws IOException {
        throw new IOException("IOException occurred");
    }

    private static void methodThatThrowsChainedException() throws Exception {
        try {
            int result = 5 / 0;
        } catch (ArithmeticException e) {
            throw new Exception("Chained exception occurred", e);
        }
    }
}
