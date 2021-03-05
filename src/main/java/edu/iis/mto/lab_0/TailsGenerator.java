package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> list = new ArrayList<>();
        String test=value;

        for(int i=value.length();i>0;i--) {
            list.add(test);
            test=test.substring(1);
        }
        list.add("");

        return list;
    }



}
