import java.io.File;
import java.io.IOException;


public class Runner {

    FilesImporter fileimporter = new FilesImporter();
    CheckJPG checkjpg = new CheckJPG();
    CheckPNG checkpng = new CheckPNG();
    CheckGIF checkgif = new CheckGIF();

    void run() throws IOException {
        FilesImporter fileimporter = new FilesImporter();
        CheckJPG checkjpg = new CheckJPG();
        CheckPNG checkpng = new CheckPNG();
        CheckGIF checkgif = new CheckGIF();

        System.out.println("Enter path");
        String userinput = fileimporter.readUserInput();


        File file = new File(userinput);

        int[] bytes = new int[0];
        bytes = fileimporter.readFilesBytes(file);


                if (checkjpg.isJPG(bytes)) {

                    System.out.println("it was checked correctly file jpg");
                }






    }

}





