package bai_11_dsa_stack_queue.bai_1_reverse_elements_in_integer_array_using_stack;

import java.util.Stack;

public class ArrayReversal {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14, 15};
        System.out.println("Array before inversion");
        for (int num : arr) {
            System.out.println(num + " ");
        }
        reverseArray(arr);

        System.out.println("Array after inversion");
        for (int num : arr) {
            System.out.print(num + " , ");
        }
    }
}
