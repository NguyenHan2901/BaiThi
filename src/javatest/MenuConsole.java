/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.Scanner;

/**
 *
 * @author ADMIN-PC
 */
public class MenuConsole {

    public static void main(String[] args) {
        MenuConsole menu = new MenuConsole();
        menu.menu();
    }

    public void menu() {
        while (true) {
            System.out.println("--Menu-- ");
            System.out.println("1. Add reservation");
            System.out.println("2. Modify passenger records");
            System.out.println("3. Display passenger records");
            System.out.println("4. Exit");
            System.out.print("------");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            Reservation reservation = new Reservation();
            if (choice.endsWith("4")) {
                System.out.println("exited");
                break;
            }
            switch (choice) {
                case "1":
                    reservation.add();
                    break;
                case "2":
                    reservation.modify();
                    break;
                case "3":
                    reservation.getList();
                    break;
                default:
                    System.out.println("Wrong key pressed");

            }
        }

    }
}