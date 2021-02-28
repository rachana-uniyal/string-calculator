package Code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {


    public int add(String s) {
//        String s ="//;\n1;2;3";
        int result = 0;
        if (s.isEmpty()) {
            result = 0;
        }

        if (s.length() == 1) {
            result = Integer.parseInt(s);
        } else {
            if (s.startsWith("//")) {
                String[] text = splitUsingCustomDelimiter(s);
                result = getResult(text);
            } else {
                String s1 = s.replaceAll("\n", ",");
                String[] text = s1.split(",");
                result = getResult(text);
            }

        }
        System.out.println(result);
        return result;
    }

    public int getResult(String[] text) {
        int result = 0;
        int x = 0;
        for (String s : text) {
            x = Integer.parseInt(s);
            result += x;
        }
        return result;
    }

    private String[] splitUsingCustomDelimiter(String text) {
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        matcher.matches();
        String customDelimiter = matcher.group(1);
        String numbers = matcher.group(2);
        return numbers.split(Pattern.quote(customDelimiter));
    }
}
