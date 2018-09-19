

public class CheckJPG implements Checker {


    private final int JPG_MAGIC[] = new int[]{0xFF, 0xD8, 0xFF, 0xE0, 0x00, 0x10, 0x4A, 0x46, 0x49, 0x46,
            0x00, 0x01};
    CheckBytes checkBytesImpl = new CheckBytesImpl();
   public boolean check(int[] bytes) {
       boolean result = checkBytesImpl.check(bytes, JPG_MAGIC);
    return result;

    }
}


