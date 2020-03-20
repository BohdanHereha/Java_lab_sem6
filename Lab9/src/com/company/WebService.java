package com.company;

/**
 * Abstract factory of object readers and writers.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 20.03.2020
 */
public abstract class WebService {

    /**
     * Creates instance of abstract Reader.
     *
     * @return created instance.
     * @see Reader
     */
    public abstract Reader createReader();

    /**
     * Creates instance of abstract Writer.
     *
     * @return created instance.
     * @see Writer
     */
    public abstract Writer createWriter();

}
