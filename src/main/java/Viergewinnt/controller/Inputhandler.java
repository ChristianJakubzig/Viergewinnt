package Viergewinnt.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Inputhandler {
    private int inputColumn;
    Scanner scanner;

    public Inputhandler() {
        this.scanner = new Scanner(System.in);
    }

    public int userColumn() {
        while (true) {
            System.out.println("In welcher reihe möchtest du deinen Stein plazieren von 0 bis 6 bitte gib die entsprechende Zahl ein: ");

            try {
                inputColumn = scanner.nextInt();

                if (inputColumn < 0 || inputColumn > 6) {
                    throw new IllegalArgumentException("Ungültige Eingabe! Bitte gib eine Valide Zahl zwischen 0 und 6 ein.");
                }
                return inputColumn;
            } catch (InputMismatchException e) {
                System.out.println("Ungültige Eingabe! Bitte gib eine Zahl ein.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getInputColumn() {
        return this.inputColumn;
    }
}
