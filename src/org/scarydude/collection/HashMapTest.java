package org.scarydude.collection;


import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> bandslist = new HashMap<Integer, String>();
        bandslist.put(1, "Iron Maiden");
        bandslist.put(4, "Manowar");
        bandslist.put(8, "Motley Crue");

        System.out.println(bandslist.get(4));

        bandslist.put(4, "Deep Purple");

        System.out.println(bandslist.get(4));

        if (bandslist.containsValue("Iron Maiden")) {
            System.out.println("Heavy Metal");

        }
        if (bandslist.containsValue("Manowar")) {
            System.out.println("Brothers of metal");

        }

        Map metalBandsList = new HashMap();
        metalBandsList.putAll(bandslist);

        System.out.println(metalBandsList.get(8));

        metalBandsList.put(3, "Gamma Ray");
        metalBandsList.put(2, "Dio");
        metalBandsList.put(6, "Skid Row");
        metalBandsList.put(5, "Judas Priest");
        metalBandsList.put(0, "Dokken");
        metalBandsList.put(9, "Heidenvolk");
        metalBandsList.put(11, "AC/DC");
        metalBandsList.put(666, "Twisted Sister");
        metalBandsList.put(46, "Slayer");
        metalBandsList.put(2, "Kreator");
        metalBandsList.put(23, "Amon Amath");
        metalBandsList.put(111, "Guns n' Roses");
        metalBandsList.put(54, "Ozzy");
        metalBandsList.put(23, "Turisas");

        Integer size = metalBandsList.size();
        System.out.println(size);

    }

}
