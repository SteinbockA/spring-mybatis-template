package practice;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by duanyixiao on 2017/10/5.
 */
public class Regex {
    public static void main(String[] args) {
        String input = "test[context]";
        String pattern = "\\[\\w+\\]";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        System.out.println(matcher.matches());

    }
}
