package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> tailsarray = new ArrayList<>(value.length() + 1);
        for (int i = 0; i < value.length() + 1; i++)
            tailsarray.add(value.substring(i));
        return tailsarray;
    }

}
