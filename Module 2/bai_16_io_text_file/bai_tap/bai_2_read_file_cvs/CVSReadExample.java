package bai_16_io_text_file.bai_tap.bai_2_read_file_cvs;


import java.io.*;

public class CVSReadExample {
    public void csvReadExample(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String id = fields[0].trim();
                String code = fields[1].trim();
                String name = fields[2].trim();

                System.out.println("ID : " + id + " , CODE : " + code + " , NAME : " + name);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the CSV file : " + e.getMessage());
        }
    }
}
