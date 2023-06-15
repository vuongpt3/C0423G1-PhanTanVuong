package bai_11_dsa_stack_queue.bai_3_checking_palindrome_strings_using_queues;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(c)) {
                queue.offer(c);
            }
        }
        while (queue.size() > 1) {
            char first = queue.poll();
            char last = queue.poll();
            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        boolean isPalindrome = isPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " : is the Palindrome series. ");
        } else {
            System.out.println(str + " : not a Palindrome series. ");
        }
    }
}
