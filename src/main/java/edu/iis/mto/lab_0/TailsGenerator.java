package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        List<String> tail = new ArrayList<>();
        for (int i = 0; i < value.length() + 1; i++){
            System.out.println(value.substring(i));
            tail.add(value.substring(i));
        }
        return tail;
    }

}
