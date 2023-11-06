
import java.util.*;
public class ArraysDemoHome {
    public static void main(String[] args) {
        int[] numbers = {7, 14, 3, 9};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Massivin bütün dəyərləri toplamı: " + sum);

        System.out.print("Massivin dəyərləri (foreach): ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        int average = 0;
        for (int number : numbers) {
            average += number;
        }
        average /= numbers.length;
        System.out.println("Massivin elementlərinin ədədi ortası: " + average);

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Ən kiçik element: " + min);
        System.out.println("Ən böyük element: " + max);

        System.out.print("Tək elementlər: ");
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.print("Cüt elementlər: ");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

       System.out.print("Sadə ədədlər: ");
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        Arrays.sort(numbers);
        System.out.print("Massivin azalan sıralanmış hali: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

