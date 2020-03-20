package com.company;

/**
 * Realisation of Leaf graphic element with
 * prototype logic of deep cloning.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Leaf
 * @see GraphicElement
 * @see CloneableElement
 * @since 20.03.2020
 */
public class DeeplyCloneableLeaf extends Leaf {

    /**
     * Default constructor.
     */
    public DeeplyCloneableLeaf() {
    }

    /**
     * Constructor, which assigns type field (parent field).
     *
     * @param type initial value.
     */
    public DeeplyCloneableLeaf(String type) {
        this.setType(type);
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Leaf cloned = new DeeplyCloneableLeaf();
        cloned.setType(new String(this.getType()));
        return cloned;
    }
}
