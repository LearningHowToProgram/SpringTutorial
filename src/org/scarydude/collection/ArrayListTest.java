package org.scarydude.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest implements Alcohol{

    public List<String> createAlkoholList() {
        List<String> drinklist = new ArrayList<String>();
        drinklist.add(VODKA);
        drinklist.add(BEER);
        drinklist.add(RUM);
        drinklist.add(BLOOD);

        return drinklist;
    }
}
