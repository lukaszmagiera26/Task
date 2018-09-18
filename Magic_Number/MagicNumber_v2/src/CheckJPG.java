

public class CheckJPG {


    private final int JPG_MAGIC[] = new int[]{0xFF, 0xD8, 0xFF, 0xE0, 0x00, 0x10, 0x4A, 0x46, 0x49, 0x46,
            0x00, 0x01};

    public boolean isJPG(int[] bytes)  {
        boolean result = true;
        for (int i = 0; i < JPG_MAGIC.length; ++i) {
            if (bytes[i] != JPG_MAGIC[i]) {
                result = false;
            }
        }
        return result;

    }

    }
