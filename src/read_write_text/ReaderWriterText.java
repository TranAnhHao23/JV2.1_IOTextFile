package read_write_text;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class ReaderWriterText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập từ muons ghi: ");
        String pathName = "src/read_write_text/Demo3.txt";
        LinkedList<String> copyFileText = new LinkedList<>();
        String word = sc.nextLine();
        writeText(copyFileText, pathName, word);
        readText(pathName);

//        clearText(copyFileText, pathName);
//        readText(pathName);


    }

    public static void writeText(LinkedList<String> copyFileText, String pathName, String str) {
        try {
            File file = new File(pathName);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                copyFileText.add(line);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
//            bufferedWriter.write(str);
            copyFileText.add(str);
//            bufferedWriter.close();

            for (String string : copyFileText) {
                bufferedWriter.write(string + "\n");
            }
            bufferedWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readText(String pathName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void clearText(LinkedList<String> copyFileText, String pathName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                copyFileText.add(line);
            }

            copyFileText.remove(copyFileText.size() - 1);

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName));
            for (String string : copyFileText) {
                bufferedWriter.write(string + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
