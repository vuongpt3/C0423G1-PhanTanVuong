package bai_14_sort_algorithm.bai_1_illustration_of_insertion_sort_algorithm;

public class InsertionSortVisualization {
    public static void main(String[] args) {
        int[] arr = {5, 8, 20, 15, 40, 21, 30, 7};
        System.out.println("Originel Array :");
        printArrays(arr);

        System.out.println();
        insertionSort(arr);
        System.out.println();

        System.out.println("Array after sorting");
        printArrays(arr);

    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueInsertion = arr[i];
            int insertionPosition = i;

            while (insertionPosition > 0 && arr[insertionPosition - 1] > valueInsertion) {
                arr[insertionPosition] = arr[insertionPosition - 1];
                insertionPosition--;
                System.out.println("Element Shift : " + arr[insertionPosition]);
            }
            if (insertionPosition != i) {
                System.out.println("Insert Element : " + valueInsertion + " . At Position : " + insertionPosition);
                arr[insertionPosition] = valueInsertion;
            }
            System.out.println("Round : " + i);
            printArrays(arr);
        }
    }

    public static void printArrays(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " , ");
        }
        System.out.println();
    }
}
