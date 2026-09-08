package app;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "myfile.txt";
        String fileContent = "My very important information.";
        String path = BASE_PATH + fileName;

        try {
            handler.writeFile(path, fileContent);
            String content = handler.readFile(path);

            getOutput("RESULT: Success.");
            getOutput("FILE CONTENT: " + content);
        } catch (RuntimeException ex) {
            System.err.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}