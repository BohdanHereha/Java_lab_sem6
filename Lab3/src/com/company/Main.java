package com.company;

import java.io.FileNotFoundException;
/**
 * A Main class that contains usage
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 03.03.2020
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Client client = new Client();

        System.out.println("---getColor from ProxySystem---");
        client.doTask(new ProxySystem());
        System.out.println("---getColor from RealSystem---");
        client.doTask(new RealSystem());
        RealSystem realSystem =
                new RealSystem();

        String firstLineOfFile = realSystem.getFirstLineOfFile("1.bmp1");
        String color = realSystem.getColor(0, 0, "1.bmp1");
        System.out.println(color);
        color = realSystem.getColor(0, 1, "1.bmp1");
        System.out.println(color);

        firstLineOfFile = realSystem.getFirstLineOfFile("1.bmp1");
        System.out.println(firstLineOfFile);
    }
}
