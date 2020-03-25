package com.company;

import java.io.FileNotFoundException;

/**
 * A class that contains the "doTask" method
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 03.03.2020
 */

public class Client {
    /**
     * @param subject
     * @throws FileNotFoundException
     */
    void doTask(Subject subject) throws FileNotFoundException {

        String color = subject.getColor(1, 0, "1.bmp1");
        System.out.println(color);

        color = subject.getColor(1, 2, "1.bmp1");
        System.out.println(color);

        color = subject.getColor(2, 2, "1.bmp1");
        System.out.println(color);

        color = subject.getColor(5, 1, "1.bmp1");
        System.out.println(color);

        color = subject.getColor(0, 2, "1.bmp1");
        System.out.println(color);
    }
}
