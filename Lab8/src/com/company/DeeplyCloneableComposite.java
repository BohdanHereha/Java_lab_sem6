package com.company;

/**
 * Realisation of Composite graphic element with
 * prototype logic of deep cloning.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see Composite
 * @see GraphicElement
 * @see CloneableElement
 * @since 20.03.2020
 */
public class DeeplyCloneableComposite extends Composite {
    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public Object clone() {
        Composite cloned = new DeeplyCloneableComposite();
        for (GraphicElement element : this.getGraphicElements()) {
            cloned.getGraphicElements().add((GraphicElement) element.clone());
        }
        return cloned;
    }
}
