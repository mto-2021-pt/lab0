package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {

        ArrayList<String> list=new ArrayList<>();
        int i=0;
        while(i<=value.length())
        {
            list.add(value.substring(i));
            i++;
        }

        return list;
    }

}
