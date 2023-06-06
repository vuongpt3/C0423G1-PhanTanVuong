package bai3_arrays_and_methods_in_java.bai_tap;

public class SumTheNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        int[][] array = new int[][]{new int[]{20,25,30}, new int[]{35,40,45}, new int[]{50,55,60}};
        int columsSum = 1;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][columsSum];
        }
        System.out.println("The sum of the fixed column is : " + sum);
    }
}
