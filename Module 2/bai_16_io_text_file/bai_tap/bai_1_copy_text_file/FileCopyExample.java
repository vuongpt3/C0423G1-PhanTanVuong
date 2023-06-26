package bai_16_io_text_file.bai_tap.bai_1_copy_text_file;

import java.io.*;

public class FileCopyExample {
    public void fileCopyExample(String sourceFile, String targetFile) {

        try {
            File soureFile = new File(sourceFile);
            File targetFile1 = new File(targetFile);
            BufferedReader br = new BufferedReader(new FileReader(soureFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile1));
            int character;
            int characterCount = 0;

            while ((character = br.read()) != -1) {
                bw.write(character);
                characterCount++;
            }

            System.out.println("Copy Successfully . Number character : " + characterCount);
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file : " + e.getMessage());
        }
    }
}
