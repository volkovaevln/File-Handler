package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public void writeFile(String path, String fileContent) {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(fileContent);
        } catch (IOException e) {
            throw new RuntimeException("Could not write file: " + path, e);
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            StringBuilder stringBuilder = new StringBuilder();
            int sym;

            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();

        } catch (IOException e) {
            throw new RuntimeException("Could not read file: " + path, e);
        }
    }
}
