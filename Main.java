import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Main {
    public static void main(String[] args) {
        String htmlRegex = "^#([A-Fa-f0-9]{6}|[A-Fa-f0-9])$";
        Pattern pattern = Pattern.compile(htmlRegex);

        String[] test = {
           "#FFFFFF",
           "#FF3421",
           "#00ff00",
           "232323",
        };

        for (String html : test) {
            boolean isTrue = pattern.matcher(html).matches();
            System.out.println(html + ": " + (isTrue ? "Правильно " : "Неправильно"));
        }
    }
}
