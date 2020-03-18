package com.company;

/**
 * The interface represents HTTP request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public interface HTTPRequest {
    /**
     * The method which represents a concrete request.
     *
     * @return The code of request.
     */
    public String reply();
}