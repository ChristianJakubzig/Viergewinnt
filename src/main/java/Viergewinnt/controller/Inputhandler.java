package Viergewinnt.controller;

import java.util.Scanner;

public class Inputhandler {
    private int inputColumn;
    Scanner scanner;

    public Inputhandler(){
        this.scanner = new Scanner(System.in);
    }

    public int userColumn(){
        System.out.println("In welcher reihe möchtest du deinen Stein plazieren von 0 bis 7 bitte gib die entsprechende Zahl ein: ");
        inputColumn = scanner.nextInt();
        return inputColumn;
    }

    public int getInputColumn(){
        return this.inputColumn;
    }
}
