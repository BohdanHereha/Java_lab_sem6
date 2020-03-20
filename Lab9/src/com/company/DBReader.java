package com.company;

/**
 * Concrete Reader entity of "Data Base" entities' group.
 * Extends abstract Reader.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Reader
 * @since 20.03.2020
 */
public class DBReader extends Reader {

    /**
     * Reads data using API of current entities' group.
     */
    @Override
    public void read() {
        System.out.println("DB: читання");
    }
}
