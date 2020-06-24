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
        } else if (query.toLowerCase().contains("what colour is a banana")) {
            return "Yellow";
        } else if (query.toLowerCase().contains ("what is")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query.split(":")[1]);

            Integer sum = 0;
            while (matcher.find()) {
                sum += Integer.parseInt(matcher.group());
            }

            return String.valueOf(sum);
        } else if (query.toLowerCase().contains ("which of the following numbers is the largest")) {
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(query.split(":")[2]);

            Integer largest = 0;
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                if (number > largest)
                    largest = number;
            }

            return String.valueOf(largest);
        }

        return "";
    }
}
