public interface Printer {
    void print(String x, String y);
    default void print(String s){
        System.out.println(s);
    }

}
