package com.company;

import com.company.figure.Point;
import com.company.figure.Rectangle;

/**
 * A Main class that that contains usage
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 */
public class Work {

    public static void main(String[] args) {

        Point line = new Point(3, 7, "black");
        Rectangle rectangle = new Rectangle(1, 2, 5, 2, "red");
        Rectangle rectangle2 = new Rectangle(3, 1, 3, 2, "black");
        Rectangle rectangle3 = new Rectangle(4, -1, 1, 7, "white");

        System.out.println("Точка");
        line.draw();
        System.out.println("\nПрямокутник 1");
        rectangle.draw();
        System.out.println("\nПрямокутник 2");
        rectangle2.draw();
        System.out.println("\nПрямокутник 3");
        rectangle3.draw();
    }
}
