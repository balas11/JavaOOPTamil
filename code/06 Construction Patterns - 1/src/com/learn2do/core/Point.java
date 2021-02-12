package com.learn2do.core;

public class Point {
    private  final int x;
    private  final int y;

    public static final Point ORIGIN = new Point(0,0);

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point makePointOnx(int x) {
        return new Point(x,0);
    }

    public static Point makePointOnY(int y) {
        return new Point(0,y);
    }

    public String getInfo() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}
