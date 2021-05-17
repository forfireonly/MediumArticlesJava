package com.company;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.System.out;

public class StreamPlay {

    public static void main(String[] args) {
        //String[] lettersArray = {"a", "b", "c", "d"};
        List<String> lettersList = Arrays.asList("a", "b", "c", "d", "");

        long numberOfLetters = lettersList.stream()
                .filter(letter -> letter.length() > 0)
                .count();

        out.println(numberOfLetters);

    }

}
