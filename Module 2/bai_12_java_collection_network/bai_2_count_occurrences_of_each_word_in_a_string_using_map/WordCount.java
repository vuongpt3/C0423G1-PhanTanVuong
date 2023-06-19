package bai_12_java_collection_network.bai_2_count_occurrences_of_each_word_in_a_string_using_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.nextLine();

        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        String[] words = input.split("\\s+");

        Map<String, Integer> wordCountMap = new TreeMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {

                wordCountMap.put(word, 1);
            }
        }

        System.out.println("Word Count : ");
        for (String word : wordCountMap.keySet()) {
            int count = wordCountMap.get(word);
            System.out.println(word + " " + count);
        }
    }
}
