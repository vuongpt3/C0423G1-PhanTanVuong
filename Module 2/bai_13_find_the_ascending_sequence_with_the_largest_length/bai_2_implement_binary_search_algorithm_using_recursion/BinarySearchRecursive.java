package bai_13_find_the_ascending_sequence_with_the_largest_length.bai_2_implement_binary_search_algorithm_using_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (right >= left) {
            int middle = left + (right - left) / 2;

            if (array[middle] == value)
                return middle;

            if (array[middle] > value)
                return binarySearch(array, left, middle - 1, value);

            return binarySearch(array, middle + 1, right, value);

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < n; i++) {
            System.out.println("At position : " + (i + 1));
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);

        System.out.println("Enter the value to find");
        int value = scanner.nextInt();

        int result = binarySearch(array, 0, n - 1, value);

        if (result == -1) {
            System.out.println("No value found in array");
        } else {
            System.out.println("Find value in array at position : " + result);
        }
    }
}
