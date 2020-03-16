package com.company.figure.point_flyweight;

/**
 * Interface for flyweights
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 */
public interface PointFlyweight {

    /**
     * Draws a point
     *
     * @param x coordinate on X
     * @param y coordinate on Y
     */
    void draw(double x,
              double y
    );
}
