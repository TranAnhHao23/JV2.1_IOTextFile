package example;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
        File file = new File("src/tester.txt");
        file.createNewFile();

        System.out.println("Does it exist? " + file.exists());
        System.out.println("The file has " + file.length() + " byte");
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be read? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " + file.getAbsolutePath());
        System.out.println("Last modifier is " + new Date(file.lastModified()));
    }
}
