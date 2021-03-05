package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> ret = new ArrayList<>(value.length() + 1);
        for (int i = 0; i < value.length() + 1; ++i) {
            if (i == 2) {
                ret.add(value.substring(2));
            }
            else if (i == value.length()) {
                ret.add("");
            }
            else {
                ret.add(value);
            }
        }

        return ret;
    }

}
