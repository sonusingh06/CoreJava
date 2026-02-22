package com.collectionframework.map;

import java.util.LinkedHashMap;

public class LinedHashMapDemo{
    public static void main(String[] args) {
        /*
        Ordered Map
        LinkedHashMap(int initialCapacity,
                         float loadFactor,
                         boolean accessOrder)
         */
        LinkedHashMap<Integer,String> map= new LinkedHashMap<>(11,0.9f,true);
        map.put(10, "Apple");
        map.put(20, "Banana");
        map.put(30, "Mango");
        map.put(40, "Orange");
        map.put(50, "Grapes");

        System.out.println(map);
        /*
        if accessOrder==True then get element move to the Last of the linked List
        Least recently Use Mechanism:- Track the least used element.
         */
        map.get(10);
        System.out.println(map);
        map.get(30);
        System.out.println(map);
        /*
        GetOrDefault()
        Give the value of the key or give the default value of Index;
         */
        System.out.println(map.getOrDefault(10,"cocanuts"));
        System.out.println(map.getOrDefault(11,"cocanuts"));

        map.putIfAbsent(11,"Cocanut");
        System.out.println(map);
        map.putIfAbsent(10,"Dates");
        System.out.println(map);
    }
}
