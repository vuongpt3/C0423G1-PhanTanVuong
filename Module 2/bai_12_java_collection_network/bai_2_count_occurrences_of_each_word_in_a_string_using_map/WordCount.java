package bai_12_java_collection_network.bai_2_count_occurrences_of_each_word_in_a_string_using_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String input = scanner.nextLine();

        // Xóa các ký tự đặc biệt và chuyển thành chữ thường
        input= input.replaceAll("[^a-zA-Z]","").toLowerCase();

        // Tách các từ
        String[] words = input.split("\\s+");

        // Sử dụng TreeMap để lưu trữ từ và số lần xuất hiện
        Map<String , Integer> wordCountMap = new TreeMap<>();

        // Đếm số lần xuất hiện của từng từ
        for (String word : words){
            if (wordCountMap.containsKey(word)){
                // Tăng giá trị lên 1 nếu từ đã tồn tại trong map
                wordCountMap.put(word, wordCountMap.get(word)+ 1);
            }else {
                // Thêm từ mới vào map với giá trị là 1
                wordCountMap.put(word , 1);
            }
        }

        System.out.println("Word Count : ");
        for (String word : wordCountMap.keySet()){
            int count = wordCountMap.get(word);
            System.out.println(word + " " + count);
        }
    }
}
