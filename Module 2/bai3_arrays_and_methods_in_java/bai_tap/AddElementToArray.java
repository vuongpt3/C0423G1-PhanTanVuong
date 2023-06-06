package bai3_arrays_and_methods_in_java.bai_tap;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int valueAdd = 6;
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length -1] = valueAdd;
        for (int arr2 : newArray){
            System.out.println(arr2 + " ");
        }
    }
}
