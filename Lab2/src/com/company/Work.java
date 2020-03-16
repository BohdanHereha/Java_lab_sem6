package com.company;

/**
 * @author Bohdan Hereha
 * @version 1.0
 * @since 29.02.2020
 */

public class Work {
    public static void main(String[] args) {

        Cl1 cl1 = new Cl1();

        cl1.setIf1(new Cl1());

        Cl3 cl3 = new Cl3();
        Cl2 cl2 = new Cl2(cl3);

        Cl3 cl3_ = new Cl3(cl3);
    }
}

