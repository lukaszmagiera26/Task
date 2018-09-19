public class SysoPrinter implements Printer{
    @Override
    public void print(String x, String y) {
        System.out.println(x + y);
    }
}
