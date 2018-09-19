import java.io.File;
import java.io.IOException;

public class Runner {
    FilesImporter fileimporter = new FilesImporter();
    Checker checkjpg = new CheckJPG();
    Checker checkpng = new CheckPNG();
    Checker checkgif = new CheckGIF();
    StringExtension stringExtension = new StringExtension();
    Printer printer = new SysoPrinter();
    void run() throws IOException {
        while (true) {
            printer.print("Enter path");
            String userinput = fileimporter.readUserInput();
            if (new File(userinput).canRead() && userinput.contains(".")) {
                String extension = stringExtension.stringExtension(userinput);
                File file = new File(userinput);
                int[] bytes = fileimporter.readFilesBytes(file);

                switch (extension) {
                    case ".jpg":
                        if (checkjpg.check(bytes)) {
                            printer.print("Files extension is", extension);
                            printer.print("it was checked correctly file png", extension);
                        }
                        break;
                    case ".gif":
                        if (checkgif.check(bytes)) {
                            printer.print("Files extension is", extension);
                            printer.print("it was checked correctly file png", extension);
                        }
                        break;
                    case ".png":
                        if (checkpng.check(bytes)) {
                            printer.print("Files extension is", extension);
                            printer.print("it was checked correctly file png", extension);
                        }
                        break;
                    default:
                       printer.print("Not found!!!");
                }
            }
            break;
        }
    }


}
