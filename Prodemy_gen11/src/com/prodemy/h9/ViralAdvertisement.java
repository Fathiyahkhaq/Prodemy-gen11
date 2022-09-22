package com.prodemy.h9;

public class ViralAdvertisement {
    public static void main(String[] args) {
        int n=3;
        int shared=5, liked, cum=0;
        for (int i = 0; i<n;i++){
            liked = (shared/2);
            shared = liked*3;
            cum+=liked;
        }
//        System.out.println(cum);

        int H = 1;
        int N=1;
        for (int i=0; i<=N;i++){
            if (i==0){
                H=1;
            } else if (i%2==0){
                H+=1;
            } else if (i%2!=0) {
                H*=2;
            }
        }
        System.out.println(H);


        //latihan
        int nilai  = 21;
        String s;
        s = String.valueOf(nilai);
        int castingString;
    }
}
