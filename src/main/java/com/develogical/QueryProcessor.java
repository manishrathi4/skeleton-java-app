package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("romeo and juliet")) {
            return "William Shakespeare";
        } else if (query.toLowerCase().split(":")[1].contains("what is your name")) {
            return "Manish Rathi";
        }
        return "";
    }
}
