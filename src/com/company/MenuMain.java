package com.company;

import java.util.Scanner;

    public class MenuMain {
        protected String menuHeader;
        protected String leadText;
        protected String[] menuItems;
        Scanner in = new Scanner(System.in);

        MenuMain(String menuHeader, String leadText, String[] menuItems) {

        }

        public void printMenu()  {
            System.out.println(menuHeader);
            while (!in.hasNextInt()) {
                System.out.println(menuItems);
                System.out.println(leadText);
                readChoice();
            }
        }

        public int readChoice() {
            int brugervalg = in.nextInt();
            return brugervalg;
        }
    }
