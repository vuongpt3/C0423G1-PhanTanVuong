package bai_14_sort_algorithm.thuc_hanh.noi_bot;

public class InsertSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        System.out.println("Original Array");
        printArrays(list);
        System.out.println();

        insertSort(list);

        System.out.println();
        System.out.println("Mảng sau khi sắp xếp");
        printArrays(list);

    }
    public static void insertSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > i ; j--) {
                if (arr[j] < arr[j -1]){
                    int temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
            System.out.println("Step " + (i+1) + " :");
            printArrays(arr);
        }
    }
    public static void printArrays(int[] arr){
        for (int num : arr){
            System.out.print(num + " , ");
        }
        System.out.println();
    }
}
