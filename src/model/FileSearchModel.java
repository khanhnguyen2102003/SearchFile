package model;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSearchModel {
    public static int countWordInFile(String fileSource, String word) {
        try {
            FileReader fr = new FileReader(fileSource);
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    if (w.equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            br.close();
            fr.close();
            return count;
        } catch (IOException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
}
