package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> result = new ArrayList<>();
        result.add(value);

        do {
            value = value.substring(1);
            result.add(value);
        } while (value.length() > 0);

        return result;
    }

}
