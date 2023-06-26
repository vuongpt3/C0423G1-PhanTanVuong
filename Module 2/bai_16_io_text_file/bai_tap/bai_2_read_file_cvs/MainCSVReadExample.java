package bai_16_io_text_file.bai_tap.bai_2_read_file_cvs;

import java.util.Scanner;

public class MainCSVReadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path of the csv . file");
        String path = scanner.nextLine();
        CVSReadExample cvsReadExample = new CVSReadExample();
        cvsReadExample.csvReadExample(path);
    }

}
