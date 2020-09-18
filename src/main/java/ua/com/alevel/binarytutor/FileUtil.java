package ua.com.alevel.binarytutor;

import java.io.*;

public class FileUtil {

    private static final String FILE_PATH = "test.txt";

    public static void writeFile(String text) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {
            System.out.println("text = " + text);
            System.out.println("text to binary = " + ConvertUtil.convertStringToBinary(text));
            byte[] bytes = text.getBytes();
            fileOutputStream.write(bytes, 0, bytes.length);
        } catch (IOException e) {
            System.out.println("e = " + e.getMessage());
        }
    }

    public static void readFile() {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH)) {
            System.out.printf("File size: %d bytes \n", fileInputStream.available());
            int i = -1;
            while((i = fileInputStream.read()) != -1) {
                System.out.println("char: " + (char)i + " binary: " + Integer.toBinaryString(i) + " binary custom: " + ConvertUtil.convertStringToBinary(String.valueOf((char) i)));
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeConsole() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Please, enter a text: ");
            String text = reader.readLine();
            writeFile(text);
        } catch (Exception e) {
            System.out.println("ex = " + e.getMessage());
        }
    }
}
