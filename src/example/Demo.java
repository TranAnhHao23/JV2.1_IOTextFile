package example;

import java.io.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws IOException {

//         Tạo 1 file
        String pathName = "src\\example\\testFile2.txt";
        File file = new File(pathName);
        file.createNewFile();


        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParentFile());


        // Ghi file
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello1\n");
        fileWriter.write("Hello2\n");
        fileWriter.write("Hello3");
        fileWriter.close(); // Phải đóng luồng thì mới ghi được file


        // Ghi file bằng PrintWriter
        PrintWriter printWriter = new PrintWriter("src/example/demoPrintWriter");
        printWriter.println("Hello anh em");
        printWriter.print(2);
        printWriter.close();


        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        while ((str = bufferedReader.readLine()) != null){
            System.out.println(str);
        }
        bufferedReader.close();

        // Đọc và ghi bằng Stream - binary File
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        FileOutputStream fileOutputStream = new FileOutputStream("src\\example\\demoFile.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        for (int a : arrayList) {
            dataOutputStream.writeInt(a);
        }

        dataOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("src\\example\\demoFile.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

        try {
            Integer line;
            while ((line = dataInputStream.readInt()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println();
        }
    }
}
