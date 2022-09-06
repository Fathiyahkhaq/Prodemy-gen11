package com.prodemy.h3;

public class Point {
    private int x; //instance variable
    private int y;

    //constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
