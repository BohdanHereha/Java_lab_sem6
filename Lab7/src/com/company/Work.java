package com.company;


/**
 * Example working.
 *
 * @author Bohdan Hereha
 * @since 19.03.2020
 */
public class Work {
    public static void main(String[] args) {
        Redactor redactor = new Redactor();
        System.out.println("---------- До оновлення ----------");
        System.out.println(redactor);

        redactor.updateArtifactsCharacter(0, "Граната");
        redactor.updateArtifactsCharacter(1, "Катана");
        redactor.updateHealthCharacter(2, 0);
        redactor.updateHealthCharacter(3, 3);
        redactor.updateCoordinates(4);
        redactor.updateCoordinates(5);

        System.out.println("---------- Після оновлення ---------- ");
        System.out.println(redactor);

        redactor.cancelChanges(0);
        redactor.cancelChanges(2);
        redactor.cancelChanges(4);

        System.out.println("---------- Після відміни оновлень Персонаж_1, Персонаж_3, Персонаж_5 ----------");
        System.out.println(redactor);
    }

}
