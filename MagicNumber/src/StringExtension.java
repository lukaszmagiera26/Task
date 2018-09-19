public class StringExtension {
    String stringExtension(String userinput) {
        String extension = userinput.substring(userinput.lastIndexOf('.'), userinput.length());
        return extension;
    }


}
