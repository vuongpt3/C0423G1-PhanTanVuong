package bai_13_find_the_ascending_sequence_with_the_largest_length.bai_1_find_the_ascending_sequence_with_the_largest_length;

import java.util.LinkedList;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String str = scanner.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character cha : max) {
            System.out.print(cha);
        }
        System.out.println();
    }
}
