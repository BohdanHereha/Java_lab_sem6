package com.company;

/**
 * Class, that get all parameters.
 * Memento stores the internal state of the object "Character" and forbids access to all objects other than "Character",
 * which has access to all data for restoration in its former state.
 *
 * @author Bohdan Hereha
 * @since 19.03.2020
 */
public class Memento {

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String artifacts;
    private int health;

    /**
     * Constructor.
     */
    Memento(int x1, int y1, int x2, int y2, String artifacts, int health) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.artifacts = artifacts;
        this.health = health;
    }


    /**
     * Access function to coordinate
     *
     * @return coordinate x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * Access function to coordinate
     *
     * @return coordinate y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * Access function to coordinate
     *
     * @return coordinate x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * Access function to coordinate
     *
     * @return coordinate y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * Access function to artifacts
     *
     * @return artifacts
     */
    public String getArtifacts() {
        return artifacts;
    }

    /**
     * Access function to health
     *
     * @return health
     */
    public int getHealth() {
        return health;
    }
}
