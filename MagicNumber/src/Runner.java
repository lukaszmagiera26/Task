import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.InputStream;

public class Runner {

    FilesImporter fileimporter = new FilesImporter();
    CheckJPG checkjpg = new CheckJPG();
    CheckPNG checkpng = new CheckPNG();
    CheckGIF checkgif = new CheckGIF();

    void run() throws IOException {

        String userinput = "";
        while(true){
            System.out.println("Enter path");
            userinput = fileimporter.readUserInput();
            if(new File(userinput).canRead() && userinput.contains(".")){


                String  extension = userinput.substring(userinput.lastIndexOf('.'),userinput.length());
                File file = new File(userinput);

                int[] bytes = new int[0];
                bytes = fileimporter.readFilesBytes(file);

                switch (extension) {
                    case ".jpg":
                        if (checkjpg.isJPG(bytes)) {
                            System.out.println(" file extenstion is: " + extension);
                            System.out.println("it was checked correctly file jpg");
                        }
                        break;
                    case ".gif":
                        if (checkgif.isGIF(bytes)) {
                            System.out.println(" file extenstion is: " + extension);
                            System.out.println("it was checked correctly file gif");
                        }
                        break;
                    case ".png":
                        if (checkpng.isPng(bytes)) {
                            System.out.println(" file extenstion is: " + extension);
                            System.out.println("it was checked correctly file png");

                        }
                        break;
                    default:
                        System.out.println("Not found!!!");
                }

            }

        }
         }



}
