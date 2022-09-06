package com.prodemy.h3;

import java.util.Arrays;

public class SortArrayManual {
    public static void main(String[] args) {
        int[] arr = {3,2,3,4,1};
        System.out.println("panjang array adalah "+arr.length);
        System.out.println("array awal adalah "+ Arrays.toString(arr) );
        int init, init2, wadah;

        for (init = 0; init < arr.length; init++) {
            for (init2 = init; init2 < arr.length; init2++) {
                if (arr[init]>arr[init2]){
                    wadah = arr[init];
                    arr[init] = arr[init2];
                    arr[init2] = wadah;
                }
            }
        }
        System.out.println("setelah disorting: "+Arrays.toString(arr));
        int max=0;
        int min = 0;
        for (int i =0; i<arr.length-1;i++){
            max+=arr[i];
        }
        for (int i=1;i<arr.length;i++){
            min+=arr[i];
        }
        System.out.println(max +", "+min);
    }
}
