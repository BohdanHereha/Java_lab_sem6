package com.company;

/**
 * Realisation of Leaf graphic element with
 * prototype logic of simple cloning.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Leaf
 * @see GraphicElement
 * @see CloneableElement
 * @since 20.03.2020
 */
public class SimplyCloneableLeaf extends Leaf {

    /**
     * Default constructor.
     */
    public SimplyCloneableLeaf() {
    }

    /**
     * Constructor, which assigns type field (parent field).
     *
     * @param type initial value.
     */
    public SimplyCloneableLeaf(String type) {
        this.setType(type);
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Leaf cloned = new SimplyCloneableLeaf();
        cloned.setType(this.getType());
        return cloned;
    }
}
