package bai_11_dsa_stack_queue.bai_4_check_brackets_in_expressions_using_tack;

import java.util.Stack;

public class BracketChecker {
    public static boolean isBracketValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s - a) * (s - b) * (s - c)";
        String expression2 = "(– b + (b^2 - 4*a*c)^(0.5/2*a))";
        String expression3 = "s * (s - a) * (s - b * (s - c)";
        String expression4 = "s * (s - a) * s - b) * (s - c)";
        String expression5 = "(– b + (b^2 - 4*a*c)^(0.5/ 2*a))";

        System.out.println(expression1 + " → " + (isBracketValid(expression1) ? "Well" : "Not Well"));
        System.out.println(expression2 + " → " + (isBracketValid(expression2) ? "Well" : "Not Well"));
        System.out.println(expression3 + " → " + (isBracketValid(expression3) ? "Well" : "Not Well"));
        System.out.println(expression4 + " → " + (isBracketValid(expression4) ? "Well" : "Not Well"));
        System.out.println(expression5 + " → " + (isBracketValid(expression5) ? "Well" : "Not Well"));
    }
}
