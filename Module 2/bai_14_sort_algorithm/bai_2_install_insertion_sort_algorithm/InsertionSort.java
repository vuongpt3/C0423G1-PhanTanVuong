package bai_14_sort_algorithm.bai_2_install_insertion_sort_algorithm;

public class InsertionSort {
    public static int[] list = {14, 19, 20, 71, 54, 81, 42};

    public static void main(String[] args) {

        System.out.println("Original Array :");
        printArrays(list);

        insertionSort(list);

        System.out.println("Array after sorting");
        printArrays(list);

    }

    public static void insertionSort(int[] arr) {
        int valueInsert;
        int insertPosition;
        for (int i = 1; i < arr.length; i++) {
            valueInsert = arr[i];
            insertPosition = i;
            while (insertPosition > 0 && arr[insertPosition - 1] > valueInsert) {
                arr[insertPosition] = arr[insertPosition - 1];
                insertPosition--;
                System.out.println("Element Shift : " + arr[insertPosition]);
            }
            if (insertPosition != i) {
                System.out.println("Insert Element : " + valueInsert + " , at position : " + insertPosition);
                arr[insertPosition] = valueInsert;
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
