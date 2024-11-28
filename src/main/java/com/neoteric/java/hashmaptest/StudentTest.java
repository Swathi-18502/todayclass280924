package com.neoteric.java.hashmaptest;

import java.util.*;
import java.util.HashMap;


public class StudentTest {

    public static void main(String[] args) {

        Map<String, Integer> HashMap = new HashMap<>();
        // Insert data into Map

        HashMap.put("Maths", 65);
        HashMap.put("Hindhi", 75);
        HashMap.put("Telugu", 89);
        HashMap.put("English", 69);
        //Retrieve data from Map


        Set<Map.Entry<String,Integer>> entrySet =HashMap.entrySet();
        Iterator<Map.Entry<String,Integer>>itr = entrySet.iterator();

        while (itr.hasNext()){
            Map.Entry<String,Integer> entryMap = itr.next();
            System.out.println(entryMap.getKey()+" value "+entryMap.getValue());

        }
        HashMap.entrySet().stream().forEach(entry->{
            System.out.println(entry.getKey()+" value "+entry.getValue());

        });

        Map<String, Integer> SortedMap = new TreeMap<>();
        SortedMap.put("Maths", 65);
        SortedMap.put("Hindhi", 75);
        SortedMap.put("Telugu", 89);
        SortedMap.put("English",69);

        SortedMap.entrySet().stream().forEach(entry ->{
            System.out.println(entry.getKey()+" value"+entry.getValue());
        });

    }
}
