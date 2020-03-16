package com.company;

/**
 * A class that implements the interface "If1", inherited from class "Cl2" and overrides the method.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 29.02.2020
 */

public class Cl1 extends Cl2 implements If1 {

    /**
     * Example of object aggregation.
     */
    If1 if1;

    /**
     * Class constructor
     *
     * @param cl33
     */
    public Cl1(Cl3 cl33) {
        super(cl33);
    }

    /**
     * Class constructor
     */
    public Cl1() {
        super();
    }

    /**
     * Override "meth1" that outputs the name of the class and method.
     */
    @Override
    public void meth1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getClassName() + "." + e.getStackTrace()[0].getMethodName() + "()");
        }
    }

    /**
     * Override "meth2" that outputs the name of the class and method.
     */
    @Override
    public void meth2() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getClassName() + "." + e.getStackTrace()[0].getMethodName() + "()");
        }
    }

    /**
     * Override "meth3" that outputs the name of the class and method.
     */
    @Override
    public void meth3() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getStackTrace()[0].getClassName() + "." + e.getStackTrace()[0].getMethodName() + "()");
        }
    }

    /**
     * @return if1
     */
    public If1 getIf1() {
        return if1;
    }

    /**
     * @param if1
     */
    public void setIf1(If1 if1) {
        this.if1 = if1;
    }

}