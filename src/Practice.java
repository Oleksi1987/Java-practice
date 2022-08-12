import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class Practice {
    public static void main(String args[]) {

       String name = "Bro";

       //boolean result = name.equalsIgnoreCase("bro");
        // int result = name.length();
        //char result = name.charAt(0);
        //int result = name.indexOf("B");
        //boolean result = name.isBlank();
        //String result = name.toUpperCase(Locale.ROOT);
        //String result = name.toLowerCase(Locale.ROOT);
        //String result = name.trim();
        String result = name.replace('r','a');


        System.out.println(result);

    }
}

