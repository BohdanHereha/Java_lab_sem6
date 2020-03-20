package com.company;

/**
 * A Main class that contains usage
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 20.03.2020
 */
public class Main {

    public static void main(String[] args) {

        DBWebService db = new DBWebService();

        db.createReader().read();
        db.createWriter().write();

        FileWebService file = new FileWebService();

        file.createReader().read();
        file.createWriter().write();
    }
}
