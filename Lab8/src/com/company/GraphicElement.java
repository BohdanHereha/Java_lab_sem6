package com.company;

/**
 * General interface for graphic elements.
 * Extends logic of CloneableElement (prototype) interface.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see CloneableElement
 * @since 20.03.2020
 */
public interface GraphicElement extends CloneableElement {

    /**
     * Shows graphic object as text.
     *
     * @return this graphic object data as String text.
     */
    String show();
}
