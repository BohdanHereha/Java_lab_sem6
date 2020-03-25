package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class that contains the implementation of the "getColor", "getFirstLine" and "getScanner" methods
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 03.03.2020
 */
public class RealSubject extends Subject {

    /**
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public String getFirstLine(String fileName) throws FileNotFoundException {
        Scanner scanner = getScanner(fileName);
        return scanner.nextLine();
    }

    /**
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    private static Scanner getScanner(String fileName) throws FileNotFoundException {
        return new Scanner(new File("../Lab3/src/com/company/" + fileName));
    }

    /**
     * @param x
     * @param y
     * @param fileName
     * @return
     * @throws FileNotFoundException
     */
    public String getColor(int x, int y, String fileName)
            throws FileNotFoundException {
        char result = 0;
        Scanner scanner = getScanner(fileName);
        String line = "";
        for (int i = 0; i <= y; i++) {
            line = scanner.nextLine();
        }
        result = line.charAt(x);

        switch (result) {
            case '0':
                return "Black";
            case '1':
                return "White";
            case '2':
                return "Blue";
            case '3':
                return "Red";
            case '4':
                return "White";
            case '5':
                return "Gren";
            case '6':
                return "Gray";
            case '7':
                return "Orange";
            case '8':
                return "Violet";
            case '9':
                return "Pink";
            default:
                return "Unknown color";
        }
    }
}