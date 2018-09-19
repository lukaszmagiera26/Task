
public class CheckGIF implements Checker{

    private final int GIF_MAGIC_89a[] = new int[]{0x47, 0x49, 0x46, 0x38, 0x39, 0x61};
    CheckBytesImpl checkBytesImpl = new CheckBytesImpl() {};

    public boolean check(int[] bytes) {
        boolean result = checkBytesImpl.check(bytes, GIF_MAGIC_89a);
        return result;

    }


}







