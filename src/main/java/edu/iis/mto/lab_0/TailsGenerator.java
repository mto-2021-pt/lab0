package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> ret = new ArrayList<>(value.length() + 1);
        for (int i = 0; i < value.length() + 1; ++i) {
            ret.add(value.substring(i));
        }
        return ret;
    }

}
