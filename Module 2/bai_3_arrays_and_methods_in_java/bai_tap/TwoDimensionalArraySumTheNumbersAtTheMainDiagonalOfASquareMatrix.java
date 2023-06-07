package bai_3_arrays_and_methods_in_java.bai_tap;

public class TwoDimensionalArraySumTheNumbersAtTheMainDiagonalOfASquareMatrix {
    public static void main(String[] args) {
        int[][] array = new int[][]{new int[]{20,25,30}, new int[]{35,40,45}, new int[]{50,55,60}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                break;
            }
        }
        System.out.println(sum);
    }
}
