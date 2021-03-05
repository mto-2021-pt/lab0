package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> arrayList =  new ArrayList<>(value.length());
        for(int i = 0; i <= value.length(); i++){
            arrayList.add(value.substring(i));
        }
        return arrayList;
    }

}
