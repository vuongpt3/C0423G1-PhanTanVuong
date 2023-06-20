package bai_13_find_the_ascending_sequence_with_the_largest_length.bai_1_find_the_ascending_sequence_with_the_largest_length;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one String : ");
        String input = scanner.nextLine();
        String sortedSubstring = getSortedSubstring(input);
        System.out.println("The substrings are sorted from smallest to largest : " + sortedSubstring);
    }

    public static String getSortedSubstring(String input) {
        LinkedList<Character> characters = new LinkedList<>();
        for (char c : input.toCharArray()) {
            characters.add(c);
        }
        characters.sort(Character::compareTo);
        StringBuilder sortedSubstring = new StringBuilder();
        for (char c : characters) {
            sortedSubstring.append(c);
        }
        return sortedSubstring.toString();
    }
}
