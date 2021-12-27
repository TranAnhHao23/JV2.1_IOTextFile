package total_number_intext;

import java.io.*;
import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file");
        String pathName = sc.nextLine();

        readFileText(pathName);


    }

    public static void readFileText(String pathName) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Tổng = " + sum);
        } catch (IOException | NumberFormatException e) {
            System.err.println("File không tồn tại hoặc có lỗi!!!");
            e.printStackTrace();
        }

    }


}
