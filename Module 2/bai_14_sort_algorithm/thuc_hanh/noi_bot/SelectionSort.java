package bai_14_sort_algorithm.thuc_hanh.noi_bot;

public class SelectionSort {
    public static void main(String[] args) {
        int[]arr = {7,5,9,2,3,1,8};
        System.out.println("Original Array");
        printArrays(arr);

        selectionSort(arr);

        System.out.println("Mảng sau khi sắp xếp");
        printArrays(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; ++i) {
            int min = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            if (min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
    public static void printArrays(int[] arr){
        for (int num : arr){
            System.out.print(num + " , ");
        }
        System.out.println();
    }
}
