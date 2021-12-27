package findmax_text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FindMaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn");
        String pathName = sc.nextLine();
        ArrayList<Integer> numbers = readFile(pathName);
        System.out.println("Max = " + findMax(numbers));
    }

    public static ArrayList<Integer> readFile(String pathName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line = "";
            int max;
            while ((line = bufferedReader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("Lỗi rồi bạn ê");
            e.printStackTrace();
        }
        return numbers;
    }

//    public void writeFile(String pathName) {
//        try {
//
//        } catch (IOException e) {
//            System.err.println("Lỗi rồi bạn ê");
//            e.printStackTrace();
//        }
//    }

    public static int findMax(ArrayList<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
