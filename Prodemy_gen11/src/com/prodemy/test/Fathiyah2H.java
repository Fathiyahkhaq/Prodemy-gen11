package com.prodemy.test;

public class Fathiyah2H {
    public static void main(String[] args) {
        /* Objektif:
        Menghitung jumlah minimum membuka lembaran buku,
        dimana jumlah halaman adalah n dan halaman yang dituju adalah p.
        halaman pertama buku selalu berada di kanan.
        */
        int n=4, p=2;
        int awal = 0,akhir=0;
        for (int i=1;i<=n;i++){
            if (i==1 && i!=p) {
                awal++;
                i++;
            }
            else if (i-1!=p && i!=p ) {
                awal++;
                i++;
            } else if (i-1==p || i!=p) break;
            else if (i==1 && i==p) break;
        }
        for (int j=n;j>=0;j--){
            if (n%2==0) {
                if (j == n && j != p) {
                    akhir++;
                    j--;
                }
                if (j - 1 != p && j != p) {
                    akhir++;
                    j--;
                } else if (j - 1 == p || j == p) break;
                else if (j == n || j == p) break;
            } else if (n%2==1) {
                if (j == n && j != p && j-1!=p) {
                    akhir++;
                    j-=2;
                }
                if (j - 1 != p && j != p) {
                    akhir++;
                    j--;
                } else if (j - 1 == p || j == p ) break;
                else if (j == n || j == p || j-1==p) break;
            }
        }
        int res = Math.min(awal,akhir);
        System.out.println(awal);
        System.out.println(akhir);
        System.out.println("Jumlah minimum halaman yang dibuka: "+res);
    }
}
