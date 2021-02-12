package com.learn2do.driver;

import com.learn2do.core.Point;

public class Main {

    public static void main(String[] args) {
        Point px = Point.makePointOnx(5);
        Point py = Point.makePointOnY(6);
        Point p0 = Point.ORIGIN;
        Point pxy = new Point(3,4);
        System.out.println(px.getInfo());
        System.out.println(py.getInfo());
        System.out.println(p0.getInfo());
        System.out.println(pxy.getInfo());


    }
}
