package bai_17_io_binary_file_and_serialization.bai_tap.copy_binary_file;

import java.util.Scanner;

public class MainCopyFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the source file path");
        String srcPath = scanner.nextLine();
        System.out.println("Enter the copy file path");
        String targetPath = scanner.nextLine();
        CopyFile copy = new CopyFile();
        copy.copyFile(srcPath, targetPath);
    }
}
