package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(value);
        for (int i = 1; i < value.length() + 1; i++) {
            arrayList.add(value.substring(i));
        }
        return arrayList;
    }

}
