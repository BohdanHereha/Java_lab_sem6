package com.company;

/**
 * The class which represents a post request.
 *
 * @author Bohdan Hereha
 * @since 18.03.2020
 */
public class Post implements HTTPRequest {
    /**
     * The constructor of class Post.
     */
    public Post() {
    }

    @Override
    public String reply() {
        return "POST";
    }
}
