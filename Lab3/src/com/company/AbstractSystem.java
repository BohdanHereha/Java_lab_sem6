package com.company;

import java.io.FileNotFoundException;

/**
 * A abstract class that contains the "getColor" method
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 03.03.2020
 */
public abstract class AbstractSystem {

    /**
     * @param x
     * @param y
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */

    public abstract String getColor(int x, int y, String fileName)
            throws FileNotFoundException;
}