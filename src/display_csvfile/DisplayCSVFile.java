package display_csvfile;

import java.io.BufferedReader;
import java.io.FileReader;

public class DisplayCSVFile {
    public static void main(String[] args) {
        String pathName = "src/display_csvfile/country.csv";
        display(pathName);
    }

    public static void display(String pathName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split(",");
                System.out.println(words[0] + ',' + '"' + words[1] + ',' + '"' + words[2] + '"');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
