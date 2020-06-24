package com.develogical;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        } else if (query.toLowerCase().contains("what is your name")) {
            return "Manish Rathi";
        } else if (query.toLowerCase().contains ("what is")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query);

            Integer sum = 0;
            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }

            return String.valueOf(sum);
        }
        return "";
    }
}
