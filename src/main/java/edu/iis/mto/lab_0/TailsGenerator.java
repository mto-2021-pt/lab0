package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        var result= new ArrayList<String>(value.length());
        String temporary=value;
        for (int i=0;i<value.length();i++)
        {
            result.add(temporary);
            temporary=temporary.substring(1);
        }
        result.add("");
        return result;
    }

}
