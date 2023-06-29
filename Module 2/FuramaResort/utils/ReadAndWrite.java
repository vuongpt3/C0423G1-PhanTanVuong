package FuramaResort.utils;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readBinaryFile(String pathFile){
        List<String> stringList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return stringList;
    }
    public static void writeBinaryFile(String pathFile ,List<String> stringList, boolean append){
        try {
            FileWriter fileWriter = new FileWriter(pathFile, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String s : stringList){
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
