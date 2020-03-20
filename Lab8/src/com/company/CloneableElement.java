package com.company;

/**
 * General interface for cloneable prototypes of
 * graphic elements.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 20.03.2020
 */
public interface CloneableElement {

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    Object clone();
}
