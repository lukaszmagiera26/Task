import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CheckGIF {
    /* private final int GIF_MAGIC_87a[] = new int[]{0x47, 0x49, 0x46, 0x38, 0x37, 0x61};*/
    private final int GIF_MAGIC_89a[] = new int[]{0x47, 0x49, 0x46, 0x38, 0x39, 0x61};

    boolean isGIF(int[] bytes) {
        boolean result = true;
        for (int i = 0; i < GIF_MAGIC_89a.length; ++i) {
            if (bytes[i] != GIF_MAGIC_89a[i]) {
                result = false;
            }
        }
        return result;
    }
}





