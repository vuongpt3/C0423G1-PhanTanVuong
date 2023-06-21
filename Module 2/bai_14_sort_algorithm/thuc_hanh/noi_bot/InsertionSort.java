package bai_14_sort_algorithm.thuc_hanh.noi_bot;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 8, 5, 1, 6, 4, 15,101,99,64,51,4,47,37,36,35,86,85,83,81};
        System.out.println("Original Array");
        printArray(arr);
        System.out.println();

        insertionSort(arr);

        System.out.println();
        System.out.println("Mảng sau khi sắp xếp");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int valueToInsert = arr[i];
            int insertionPosition = i;

            while (insertionPosition > 0 && arr[insertionPosition - 1] > valueToInsert) {
                arr[insertionPosition] = arr[insertionPosition - 1];
                insertionPosition--;
                System.out.println("Dịch chuyển phần tử : " + arr[insertionPosition]);
            }
            if (insertionPosition != i) {
                System.out.println("Chèn phần tử : " + valueToInsert + " . Tại vị trí : " + insertionPosition);
                arr[insertionPosition] = valueToInsert;
            }
            System.out.println("Vòng thứ : " + i);
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " , ");
        }
        System.out.println();
    }
}
