package com.company;

/**
 * General interface for observer (subscriber).
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @see GameObservable
 * @since 16.03.2020
 */
public interface GameObserver {

    /**
     * Updates state of this observer.
     *
     * @param message  notification message, which is used to delegate
     *                 change of state.
     * @param newState initial value of new state of this observer.
     */
    void updateState(String message, String newState);

}