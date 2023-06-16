package bai_11_dsa_stack_queue.bai_tap.bai_1_reverse_element_from_decimal_to_binary;

import java.util.Stack;

public class ArrayReversal {
    private static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Number before reverse : ");
        for (int num : arr) {
            System.out.print(num + " , ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.println("Number after reverse : ");
        for (int num : arr) {
            System.out.print(num + " , ");
        }

        System.out.println();

        String str = "kwjfjggrrotiogefw";
        String reverseString1 =  reverseString(str);
        System.out.println("Character before reverse :");
        System.out.println(str);
        System.out.println();
        System.out.println("Character after reverse :");
        System.out.print(reverseString1);

    }
}
