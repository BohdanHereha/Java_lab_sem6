package com.company;

/**
 * Concrete Writer entity of "Data Base" entities' group.
 * Extends abstract Writer.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Writer
 * @since 20.03.2020
 */
public class DBWriter extends Writer {

    /**
     * Writes data using API of current entities' group.
     */
    @Override
    public void write() {
        System.out.println("DB: запис");
    }
}
