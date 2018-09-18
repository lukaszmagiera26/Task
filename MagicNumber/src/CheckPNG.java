import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckPNG {

    private final int PNG_MAGIC[] = new int[]{0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a};


    boolean isPng(int[] bytes)  {
        boolean result = true;
        for (int i = 0; i < PNG_MAGIC.length; ++i) {
            if (bytes[i] != PNG_MAGIC[i]) {
                result = false;
            }
        }
        return result;
    }


}
