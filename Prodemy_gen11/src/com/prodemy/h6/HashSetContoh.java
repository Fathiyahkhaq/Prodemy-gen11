package com.prodemy.h6;

import java.util.*;

public class HashSetContoh {
    public static void main(String args[]) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lemon");
        System.out.println(fruits);
        System.out.println("Apakah ada naga? " + fruits.contains("naga"));

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        System.out.println(numbers);

        //coba duplikat
        fruits.add("banana");
        fruits.add(null);
        fruits.add(null);
        System.out.println(fruits);

        //delete hashset
        numbers.clear();
        System.out.println("Setelah .clear() : "+numbers);
        System.out.println("Apakah fruits ada isinya?"+ fruits.isEmpty());
        //copy
        HashSet<String> buah = (HashSet<String>)fruits.clone();
        System.out.println("buah: "+ buah);

        //convert HashSet to Array
        System.out.println("HashSet awal: "+ fruits);
        String[] arr = new String[fruits.size()];
        fruits.toArray(arr);
        System.out.println("Array element: "+ Arrays.toString(arr));

        //TreeSet
        TreeSet<String> tset = new TreeSet<String>();
        tset.add("ABC");
        tset.add("Test");
        tset.add("Bag");

        System.out.println(tset);

        //LinkedHashSet
        LinkedHashSet<String> lh = new LinkedHashSet<String>();
        lh.add("Z");
        lh.add("PQ");
        lh.add("N");
        lh.add("O");
        lh.add("KK");
        lh.add("FGH");
        System.out.println(lh);

    }
}
