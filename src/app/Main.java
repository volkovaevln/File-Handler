package app;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile.txt";
        String fileContent = "My very important information.";
        handler.writeFile(BASE_PATH + fileName, fileContent);
        String content = handler.readFile(BASE_PATH + fileName);
        getOutput("RESULT: Success.");
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
