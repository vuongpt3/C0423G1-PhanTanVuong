package bai3_arrays_and_methods_in_java.bai_tap;

public class FindTheSmallestValueInAnArray {
    public static void main(String[] args) {
        int[][] array = new int[][]{new int[]{20,25,30}, new int[]{35,40,45}, new int[]{50,55,60}};
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        System.out.println("The smallest number in a 2D array is : " + min);
    }
}
