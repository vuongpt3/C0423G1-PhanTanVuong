package bai3_arrays_and_methods_in_java.bai_tap;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int valueRemove = 3;
        int[] newArray = new int[arr.length - 1];
        int newIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != valueRemove) {
                newArray[newIndex] = arr[i];
                newIndex++;
            }
        }

        for (int array : newArray) {
            System.out.println(array + " ");
        }
    }
}
