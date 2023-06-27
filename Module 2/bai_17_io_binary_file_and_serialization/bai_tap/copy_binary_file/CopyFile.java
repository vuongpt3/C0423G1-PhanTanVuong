package bai_17_io_binary_file_and_serialization.bai_tap.copy_binary_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void copyFile(String sourceFile, String targetFile) {
        try {
            File srcFile = new File(sourceFile);
            File targFile = new File(targetFile);

            FileInputStream inputStream = new FileInputStream(srcFile);
            FileOutputStream outputStream = new FileOutputStream(targFile);


            byte[] buffer = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;
            }

            System.out.println("Copy completed. Number of bytes copied: " + totalBytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
