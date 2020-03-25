package com.company;

import java.io.FileNotFoundException;
import java.util.HashMap;
/**
 * A class that contains the implementation of the "getColor" method
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 03.03.2020
 */
public class Proxy extends Subject {
    RealSubject realSubject = new RealSubject();
    HashMap<String, String> cache = new HashMap<>();

    /**
     *
     * @param x
     * @param y
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public String getColor(int x, int y, String fileName)
            throws FileNotFoundException {
        String result = cache.get(fileName + x + y);
        if (result == null) {
            result = realSubject.getColor(x, y, fileName);
            cache.put(fileName + x + y, result);
        }
        return result;
    }

}
