package com.company.figure.point_flyweight;

/**
 * Simple object-point flyweight
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 */
public class PointFlyweightRed implements PointFlyweight {
    private final String COLOR = "red";

    /**
     * Constructor
     */
    PointFlyweightRed() {
    }

    /**
     * Draws a point
     *
     * @param x coordinate on X
     * @param y coordinate on Y
     */
    public void draw(double x,
                     double y) {
        System.out.println("Point (" + x + ";" + y + "), " + COLOR + "\n" + hashCode());
    }
}
