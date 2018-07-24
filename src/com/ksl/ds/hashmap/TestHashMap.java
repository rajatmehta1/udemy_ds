package com.ksl.ds.hashmap;

public class TestHashMap {

    public static void main(String[] args) throws  Exception {
        OpenAdressingHashMap omap = new OpenAdressingHashMap();

            omap.put(8,"test");
            omap.put(3,"three");
            omap.put(5,"five");
            omap.put(23,"twenty three");

        System.out.println("value --> " + omap.get(3));

        System.out.println("value --> " + omap.get(23));
    }

}
