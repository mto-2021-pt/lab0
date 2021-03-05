package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        String v = value;
        List<String> list = new ArrayList<>();
        for (int i = 0; i<value.length();i++){
            list.add(v);
            v=v.substring(1);
        }
        list.add(v);

        return list;
    }

}
