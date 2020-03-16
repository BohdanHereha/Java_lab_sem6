package com.company.figure.point_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creation point
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 13.03.2020
 */
public class PointFlyweightFactory {

    /**
     * Repository of objects-points
     */
    private static Map<String, PointFlyweight> pointFlyweightPool = new HashMap<>();

    /**
     * @return new PointFlyweightImpl if there was no created yet, or old instance
     */
    public static PointFlyweight getPointFlyweight(String color) {

        PointFlyweight pointFlyweight = pointFlyweightPool.get(color);

        if (pointFlyweight == null) {
            switch (color) {
                case "black":
                    pointFlyweight = new PointFlyweightBlack();
                    break;
                case "white":
                    pointFlyweight = new PointFlyweightWhite();
                    break;
                case "red":
                    pointFlyweight = new PointFlyweightRed();
                    break;
                default:
                    System.out.println("Error!");
                    throw new NullPointerException();
            }
            pointFlyweightPool.put(color, pointFlyweight);
        }


        return pointFlyweight;
    }
}
