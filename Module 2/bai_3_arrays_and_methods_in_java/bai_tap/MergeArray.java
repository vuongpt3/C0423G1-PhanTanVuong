package bai_3_arrays_and_methods_in_java.bai_tap;

public class MergeArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        int newSize = array1.length + array2.length;
        int[] newArray = new int[newSize];
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            newArray[array1.length + i] = array2[i];
        }
        for ( int arr : newArray){
            System.out.println(arr + " ");
        }
    }
}
