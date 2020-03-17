package com.company;

/**
 * A Main class that contains usage
 *
 * @author Bohdan Hereha
 * @version 1.0
 * @since 16.03.2020
 */
public class Main {

    public static void main(String[] args) {
        GameArea gameArea = new GameArea();
        System.out.println("--- gameCell 1 ---");
        GameCell gameCell = new GameCell(7, 5, CellState.EMPTY);
        gameArea.addObserver(gameCell);
        gameArea.notifyObservers(null, null);
        System.out.println("");
        gameArea.notifyObservers("7-5", "dead");
        System.out.println("");
        gameArea.notifyObservers("7-5", "alive");
        System.out.println("");

        System.out.println("--- gameCell 2 ---");
        GameCell gameCell2 = new GameCell(4, 3, CellState.ALIVE);
        gameArea.addObserver(gameCell2);
        gameArea.shoot("4-3");
        System.out.println("");
        gameArea.notifyObservers("4-3", "dead");

    }
}
