package com.prodemy.h2;

public class TestScopeGabung {
    public static void main(String[] args) {
        ScopeContoh s = new ScopeContoh();
        s.firstMethod();
    }
}

class ScopeContoh {
    private int i = 1;
    public void firstMethod() {
        int i = 5, j = 6;
        this.i = i+j;
        System.out.println(this.i);
        secondMethod(8);

    }
    public void secondMethod(int i) {
        int j = 9;
        this.i = i+j;
        System.out.println(this.i);

    }
}