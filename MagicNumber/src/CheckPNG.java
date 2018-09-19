

public class CheckPNG implements Checker {

    private final int PNG_MAGIC[] = new int[]{0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a};

    CheckBytes checkBytesImpl = new CheckBytesImpl();

    public boolean check(int[] bytes) {
        boolean result = checkBytesImpl.check(bytes, PNG_MAGIC);
        return result;
    }


}