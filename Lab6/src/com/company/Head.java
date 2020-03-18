package com.company;

/**
 * The class which represents the head request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class Head implements HTTPRequest {
    /**
     * The constructor of class Head.
     */
    public Head() {
    }

    @Override
    public String reply() {
        return "HEAD";
    }
}
