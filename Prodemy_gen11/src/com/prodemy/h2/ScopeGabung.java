package com.prodemy.h2;

import jdk.nashorn.internal.runtime.Scope;

public class ScopeGabung {
    private int i = 1;
    public void firstMethod() {
        int i = 4, j = 5;
        this.i = i+j;
        secondMethod(7);
    }
    public void secondMethod(int i) {
        int j = 8;
        this.i = i+j;
    }
}

class TestScope {
    public static void main(String[] args) {
        ScopeGabung scope = new ScopeGabung();
        scope.firstMethod();
    }
}
