// SearchComplexity.java
// Starter code for final programming assignment in CIT-63 Java Programming Spring 2024

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.binarySearch;

public final class SearchComplexity {

    // Linear Search Method
    public static int linearSearch(int[] array, int target) {
        int iterations = 0;
        for (int i = 0; i < array.length; i++) {
            iterations++;
            if (array[i] == target) {
                System.out.println("Linear search iterations: " + iterations);
                return i;
                // Returns index of found element
            }
        }
        System.out.println("Linear search iterations: " + iterations);
        return -1; // Target not found
    }

    // Binary Search Method
    public static int binarySearchRecursive(int[] array, int target, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return binarySearchRecursive(array, target, left, mid - 1);
            }
            return binarySearchRecursive(array, target, mid + 1, right);
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter target number to search:");
        int target = scanner.nextInt();

        // Linear Search
        int linearResult = linearSearch(array, target);
        System.out.println((linearResult == -1) ? "Target not found by linear search." :
                "Target found by linear search at index: " + linearResult);

        // Binary Search (Array must be sorted)
        Arrays.sort(array);
        int binaryResult = binarySearch(array, target);
        System.out.println((binaryResult == -1) ? "Target not found by binary search." :
                "Target found by binary search at index: " + binaryResult);

        scanner.close();
    }
}