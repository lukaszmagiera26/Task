public class CheckBytesImpl implements CheckBytes {
    public boolean check(int[] x, int[] y) {
        boolean result = true;
        for (int i = 0; i < y.length; ++i) {
            if (x[i] != y[i]) {
                result = false;
            }
        }
        return result;

    }
}