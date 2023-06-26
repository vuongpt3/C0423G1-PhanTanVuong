package bai_16_io_text_file.thuc_hanh.sum_of_numbers_in_text_file;

import java.util.Scanner;

public class MainReadFileText {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample readfileEX = new ReadFileExample();
        readfileEX.readFileText(path);
    }
}
