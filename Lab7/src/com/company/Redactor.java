package com.company;

import java.util.Random;

/**
 * Class redactor some parameters.
 *
 * @author Bohdan Hereha
 * @since 19.03.2020
 */
public class Redactor {
    /**
     * An array of characters
     */
    private Character[] сharacter;

    /**
     * An array of states
     */
    private Memento[] states;

    /**
     * Array of artifacts
     */
    private String[] composition_of_artifacts;

    /**
     * The dimension of the array Character[]
     */
    private int sizeСharacter;

    /**
     * Number of characters
     */
    private int countСharacter;

    Redactor() {
        Random random = new Random();
        sizeСharacter = 10;
        countСharacter = 7;
        сharacter = new Character[sizeСharacter];
        states = new Memento[sizeСharacter];
        composition_of_artifacts = new String[]{"Меч", "Лук", "Сокира", "Автомат", "Біта", "Хлист", "Пістолет", "Арбалет", "Рогатка", "Кулемет"};
        сharacter[0] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[1] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[2] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[3] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[4] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[5] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
        сharacter[6] = new Character(random.nextInt(100), random.nextInt(100), random.nextInt(100),
                random.nextInt(100), composition_of_artifacts[random.nextInt(10)], random.nextInt(100));
    }

    /**
     * Sets the new artifact value
     *
     * @param index
     * @param artifacts
     */
    public void updateArtifactsCharacter(int index, String artifacts) {
        if (index > -1 && index < countСharacter) {
            states[index] = сharacter[index].getState();
            сharacter[index].setArtifacts(artifacts);
        } else {
            System.out.println("Перевірте вказаний індекс! Для індексу "+index+" оновлення не відбулось!\n");
        }
    }

    /**
     * Sets a new level of health
     *
     * @param index
     * @param health
     */
    public void updateHealthCharacter(int index, int health) {
        if (index > -1 && index < countСharacter) {
            states[index] = сharacter[index].getState();
            сharacter[index].setHealth(health);
        } else {
            System.out.println("Перевірте вказаний індекс! Для індексу "+index+" оновлення не відбулось!\n");
        }
    }

    /**
     * Sets the new coordinate values
     *
     * @param index
     */
    public void updateCoordinates(int index) {
        if (index > -1 && index < countСharacter) {
            Random random = new Random();
            states[index] = сharacter[index].getState();
            сharacter[index].setX1(random.nextInt(20));
            сharacter[index].setX2(random.nextInt(20));
            сharacter[index].setY1(random.nextInt(20));
            сharacter[index].setY2(random.nextInt(20));
        } else {
            System.out.println("Перевірте вказаний індекс! Для індексу "+index+" оновлення не відбулось!\n");
        }
    }

    /**
     * Cancels the update based on the index value
     *
     * @param index
     */
    public void cancelChanges(int index) {
        if (index > -1 && index < countСharacter) {
            if (states[index] != null)
                сharacter[index].setState(states[index]);
        } else {
            System.out.println("Перевірте вказаний індекс! Для індексу "+index+" відміна оновлення не відбулась!\n");
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < countСharacter; i++)
            str.append("Персонаж_" + (i + 1) + " " + сharacter[i] + "\n");

        return str.toString();
    }
}
