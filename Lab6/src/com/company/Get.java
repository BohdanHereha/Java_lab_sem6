package com.company;

/**
 * The class which represents get request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class Get implements HTTPRequest {
    /**
     * The constructor of class Get.
     */
    public Get() {
    }

    @Override
    public String reply() {
        return "GET";
    }
}