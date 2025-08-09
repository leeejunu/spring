package com.spring;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {

    public List<String> sortByLength(List<String> list) {
        list.sort((o1, o2) -> o1.length() - o2.length());
        return list;
    }

    public static void main(String[] args) {
        List<String> scores = Arrays.asList("1", "3213", "52");
        Collections.sort(scores);

        Collections.sort(scores, (o1, o2) ->  o1.length() - o2.length());

    }
}
