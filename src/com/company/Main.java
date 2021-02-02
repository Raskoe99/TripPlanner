package com.company;

import java.util.Scanner;

public class Main {

    public static void menu() {
        MenuMain menu = new MenuMain("Velkommen til",
                "Vælg en menu: ",
                new String[] {"1. Plan trip", "\n2. List trip"});
        menu.printMenu();
        menu.readChoice();
        int choice = menu.readChoice();

        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Where do you wish to go?");

                break;
            case 2:
                System.out.println();
                break;

            default:
                System.out.println("Fejl, vælg venligst et tal der matcher et menutal.");
        }
    }

    public static void main(String[] args) {

    }
}
