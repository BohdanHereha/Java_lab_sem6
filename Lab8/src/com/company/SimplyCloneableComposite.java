package com.company;

/**
 * Realisation of Composite graphic element with
 * prototype logic of simple cloning.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Composite
 * @see GraphicElement
 * @see CloneableElement
 * @since 20.03.2020
 */
public class SimplyCloneableComposite extends Composite {
    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Composite cloned = new SimplyCloneableComposite();
        cloned.setGraphicElements(this.getGraphicElements());
        return cloned;
    }
}
