import java.io.*;
import java.util.Scanner;

public class FilesImporter {
    Scanner sc = new Scanner(System.in);

    String readUserInput() {
        String userinput = sc.nextLine();
        return userinput;
    }

        int[] readFilesBytes (File userinput) throws IOException {
            int[] bytes = new int[24];
            InputStream is = new FileInputStream(userinput);
            for (int i = 0; i < 24; i++) {
                bytes[i] = is.read();
            }
            return bytes;
        }



}