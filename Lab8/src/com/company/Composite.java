package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite graphic object class, which implements
 * logic of GraphicObject interface and has abstract logic of prototype.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see GraphicElement
 * @see CloneableElement
 * @since 20.03.2020
 */
public abstract class Composite implements GraphicElement {

    private List<GraphicElement> graphicElements;

    /**
     * Default constructor override.
     * Assigns graphicElements List.
     */
    public Composite() {
        graphicElements = new ArrayList<>();
    }

    /**
     * Getter of graphicElements field.
     *
     * @return value of field.
     * @see List
     * @see GraphicElement
     */
    public List<GraphicElement> getGraphicElements() {
        return graphicElements;
    }

    /**
     * Setter of graphicElements field.
     *
     * @param graphicElements initial value.
     * @see List
     * @see GraphicElement
     */
    public void setGraphicElements(List<GraphicElement> graphicElements) {
        this.graphicElements = graphicElements;
    }

    /**
     * Adds aggregated element.
     *
     * @param element ref to new aggregated element.
     * @see GraphicElement
     */
    public void addElement(GraphicElement element) {
        graphicElements.add(element);
    }

    /**
     * Removes aggregated element.
     *
     * @param index position of element in List.
     * @return removed element.
     * @see GraphicElement
     */
    public GraphicElement removeElement(int index) {
        return graphicElements.remove(index);
    }

    /**
     * Shows graphic object as text.
     *
     * @return this graphic object data as String text.
     */
    @Override
    public String show() {
        StringBuilder stringBuilder = new StringBuilder("Composite(" + this.hashCode() + ") {");
        for (int i = 0; i < graphicElements.size(); i++) {
            stringBuilder.append(graphicElements.get(i).show());
            if (i < graphicElements.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /**
     * Gives copy of this object.
     *
     * @return copy of this object.
     */
    @Override
    public abstract Object clone();
}
