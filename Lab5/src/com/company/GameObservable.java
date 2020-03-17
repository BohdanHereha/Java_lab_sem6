package com.company;

/**
 * General interface for subject of observation.
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see GameObserver
 * @since 16.03.2020
 */
public interface GameObservable {

    /**
     * Subscribes observer to this subject.
     *
     * @param observer reference to subscriber object.
     * @see GameObserver
     */
    void addObserver(GameObserver observer);

    /**
     * Unsubscribes observer from this subject.
     *
     * @param observer reference to subscriber object.
     * @see GameObserver
     */
    void removeObserver(GameObserver observer);

    /**
     * Sends notification to all subscribers.
     *
     * @param message  notification message.
     * @param newState initial value of new state of subscriber.
     */
    void notifyObservers(String message, String newState);
}
