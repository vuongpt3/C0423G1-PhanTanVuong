package bai_16_io_text_file.bai_tap.bai_1_copy_text_file;

import bai_16_io_text_file.thuc_hanh.sum_of_numbers_in_text_file.ReadFileExample;

import java.util.Scanner;

public class MainFileCopyExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source file path");
        String sourceFile = scanner.nextLine();
        System.out.println("Enter the path of the copied file");
        String targetFile = scanner.nextLine();
        FileCopyExample fileCopy = new FileCopyExample();
        fileCopy.fileCopyExample(sourceFile, targetFile);
    }
}
