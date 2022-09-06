package com.prodemy.h3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        //sorting array dengan library Arrays
        int[] arr = {3,1,5,2,4};
        System.out.println("panjang array: "+ arr.length);
        System.out.println("Array awal: ");
        String res = Arrays.toString(arr);
        System.out.println(res);

        System.out.println("Setelah sorting: ");
        Arrays.sort(arr);
        String res2 = Arrays.toString(arr);
        System.out.println(res2);
    }
}
