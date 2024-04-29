import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number of elements in array:");
            int n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Array must contain at least one element.");
                return;
            }
            int[] array = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println("Enter target number to search:");
            int target = scanner.nextInt();
            // Rest of the code
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}
