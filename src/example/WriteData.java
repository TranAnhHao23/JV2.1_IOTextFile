package example;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteData {
    public static void main(String[] args) throws IOException {

        // Viết như này cho đỡ phải close
        try (PrintWriter printWriter = new PrintWriter("src/example/demoFile")) {
            printWriter.println("Olala");
            printWriter.println("Olala");
            printWriter.println("Olala");
        }
    }
}
