package com.company;

/**
 * The first interface contains the "meth1" method.
 * This interface is inherited from the "If2" interface.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 29.02.2020
 */

public interface If1 extends If2 {
    /**
     * The method that prints the class name and the name of the method.
     */
    void meth1();
}
