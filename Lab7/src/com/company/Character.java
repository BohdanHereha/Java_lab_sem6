package com.company;

/**
 * Class that realize all parameters and have methot getState() from Memento.
 *
 * @author Bohdan Hereha
 * @since 19.03.2020
 */
public class Character {
    /**
     * Coordinate x1
     */
    protected int x1;
    /**
     * Coordinate y1
     */
    protected int y1;
    /**
     * Coordinate x2
     */
    protected int x2;
    /**
     * Coordinate y2
     */
    protected int y2;
    /**
     * Composition of character artifacts
     */
    protected String artifacts;
    /**
     * The level of health of the character
     */
    protected int health;

    /**
     * Constructor.
     */
    Character(int x1, int y1, int x2, int y2, String artifacts, int health) {
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
     * Value setting function
     *
     * @param x1
     */
    public void setX1(int x1) {
        this.x1 = x1;
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
     * Value setting function
     *
     * @param y1
     */
    public void setY1(int y1) {
        this.y1 = y1;
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
     * Value setting function
     *
     * @param x2
     */
    public void setX2(int x2) {
        this.x2 = x2;
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
     * Value setting function
     *
     * @param y2
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * Access function to health
     *
     * @return the level of health of the character
     */
    public int getHealth() {
        return health;
    }

    /**
     * Value setting function
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Access function to artifacts
     *
     * @return composition of character artifacts
     */
    public String getArtifacts() {
        return artifacts;
    }

    /**
     * Value setting function
     *
     * @param artifacts
     */
    public void setArtifacts(String artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * Access function to state
     *
     * @return
     */
    public Memento getState() {
        return new Memento(x1, y1, x2, y2, artifacts, health);
    }

    /**
     * Value setting function
     *
     * @param memento
     */
    public void setState(Memento memento) {
        x1 = memento.getX1();
        x2 = memento.getX2();
        y1 = memento.getY1();
        y2 = memento.getY2();
        artifacts = memento.getArtifacts();
        health = memento.getHealth();
    }

    /**
     * @return x1, y1, x2, y2, health, artifacts
     */
    @Override
    public String toString() {
        return "\tx1=" + x1 + "\ty1=" + y1 + "\tx2=" + x2 + "\ty2=" + y2 + "\tартефакт: " + artifacts + "\t\tздоров'я: " + health + "%";
    }
}
