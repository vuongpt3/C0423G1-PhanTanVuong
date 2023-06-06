package bai3_arrays_and_methods_in_java.bai_tap;

public class FindTheIargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The largest number in a 2D array is : " + max);
    }
}
