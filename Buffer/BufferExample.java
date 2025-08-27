package Buffer;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("data.txt");

        // Without Buffer
        int ch;
        long start = System.currentTimeMillis();
        while ((ch = fr.read()) != -1) {
        }
        long end = System.currentTimeMillis();
        System.out.println("Without buffer: " + (end - start) + " ms");
        fr.close();

        // With Buffer
        FileReader fr2 = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr2);
        start = System.currentTimeMillis();
        while ((ch = br.read()) != -1) {
        }
        end = System.currentTimeMillis();
        System.out.println("With buffer: " + (end - start) + " ms");
        br.close();
    }
}
