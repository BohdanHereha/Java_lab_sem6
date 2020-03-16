package com.company.figure;

/**
 * A class that description object rectangle.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 */
public class Rectangle implements Figure {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;
    private Point fourthPoint;

    /**
     * Constructor
     *
     * @param x      x coordinate
     * @param y      y coordinate
     * @param length rectangle length
     * @param width  rectangle width
     */
    public Rectangle(double x, double y, double length, double width, String color) {
        firstPoint = new Point(x, y, color);
        secondPoint = new Point(x + length, y, color);
        thirdPoint = new Point(x, y - width, color);
        fourthPoint = new Point(x + length, y - width, color);
    }

    /**
     * Draws all points
     */
    public void draw() {
        firstPoint.draw();
        secondPoint.draw();
        thirdPoint.draw();
        fourthPoint.draw();

        System.out.println("Rectangle is drawn.");
    }
}
