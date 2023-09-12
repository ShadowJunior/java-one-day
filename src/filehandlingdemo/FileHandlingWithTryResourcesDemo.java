package filehandlingdemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileHandlingWithTryResourcesDemo {
    public static void main(String[] args) {
        String line;

        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader("/Users/juniorjoseph/Downloads/java-one-day/src/filehandlingdemo/myFile.txt"))) {
            line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
