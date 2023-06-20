package bai_13_find_the_ascending_sequence_with_the_largest_length.bai_3_find_the_longest_consecutive_string;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestConsecutiveSubstring {
    public static String findLongestConsecutiveSubstring(String str) {
        LinkedList<Character> currentSubstring = new LinkedList<>();
        LinkedList<Character> longestSubstring = new LinkedList<>();

        for (char c : str.toCharArray()) {
            if (currentSubstring.isEmpty() || c == currentSubstring.getLast() + 1) {
                currentSubstring.add(c);
            } else {
                if (currentSubstring.size() > longestSubstring.size()) {
                    longestSubstring = new LinkedList<>(currentSubstring);
                }
                currentSubstring.clear();
                currentSubstring.add(c);
            }
        }
        if (currentSubstring.size() > longestSubstring.size()) {
            longestSubstring = new LinkedList<>(currentSubstring);
        }

        StringBuilder result = new StringBuilder();
        for (char c : longestSubstring) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string");
        String input = scanner.nextLine();

        String longestConsecutiveSubstring = findLongestConsecutiveSubstring(input);
        System.out.println("Consecutive sequence of maximum length is : " + longestConsecutiveSubstring);
    }
}
