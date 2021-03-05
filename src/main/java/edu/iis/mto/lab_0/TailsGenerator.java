package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> tailsArray = new ArrayList<>(value.length());

        for(int index = 0; index <= value.length(); index++) {
            tailsArray.add(value.substring(index));
        }

        return tailsArray;
    }

}
