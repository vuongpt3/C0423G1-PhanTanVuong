package bai_11_dsa_stack_queue.bai_2_convert_from_decimal_to_binary;

import java.util.Stack;

public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        while (decimal > 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        int decimal = 30;
        String binary = decimalToBinary(decimal);
        System.out.println("Number : " + decimal + " at the binary system is : " + binary);
    }
}
