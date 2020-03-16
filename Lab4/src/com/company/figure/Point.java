package com.company.figure;

import com.company.figure.point_flyweight.PointFlyweight;
import com.company.figure.point_flyweight.PointFlyweightFactory;

/**
 * Point figure for editor
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 * @see Figure
 */
public class Point implements Figure {
    private double x;
    private double y;

    private PointFlyweight pointFlyweight;

    /**
     * Constructor
     *
     * @param x coordinate on X
     * @param y coordinate on Y
     */
    public Point(double x, double y, String color) {
        this.x = x;
        this.y = y;
        pointFlyweight = PointFlyweightFactory.getPointFlyweight(color);
    }

    /**
     * Takes point flyweight from factory and draws it
     *
     * @see PointFlyweight
     * @see PointFlyweightFactory
     */
    @Override
    public void draw() {
        pointFlyweight.draw(x, y);
    }
}
