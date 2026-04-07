import java.io.*;
import java.util.*;

class FileSearchThread extends Thread {
    String filename, search;

    FileSearchThread(String filename, String search) {
        this.filename = filename;
        this.search = search;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            int lineNo = 0;

            while ((line = br.readLine()) != null) {
                lineNo++;
                if (line.contains(search)) {
                    System.out.println("Found in file: " + filename +
                            " at line: " + lineNo);
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println("Error in file: " + filename);
        }
    }
}

public class slip14_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string to search: ");
        String search = sc.nextLine();

        File folder = new File("."); // current directory
        File[] files = folder.listFiles();

        for (File file : files) {
            if (file.isFile() && file.getName().endsWith(".java")) {

                // Create thread for each file
                FileSearchThread t = new FileSearchThread(file.getName(), search);
                t.start();
            }
        }
    }
}