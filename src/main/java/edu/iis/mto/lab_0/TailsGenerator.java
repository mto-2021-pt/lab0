package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {
    public List<String> tails(String value) {
        ArrayList<String> tailsList = new ArrayList<>();

        while (true) {
            tailsList.add(value);

            if (value.isEmpty()) {
                break;
            }

            value = value.substring(1);
        }

        return tailsList;
    }
}
