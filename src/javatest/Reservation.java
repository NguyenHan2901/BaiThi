/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author ADMIN-PC
 */
public class Reservation {

    private static PriorityQueue<Passenger> list = new PriorityQueue<>();

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Address: ");
        String address = sc.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Enter Date of departure and return: ");
        String date = sc.nextLine();
        Passenger passenger = new Passenger();
        passenger.setId((int) System.currentTimeMillis());
        passenger.setPassengerName(name);
        passenger.setAddress(address);
        passenger.setPhone(phone);
        passenger.setDate(date);
        boolean result = list.add(passenger);
        if (result) {
            System.out.println("Ok");
        } else {
            System.out.println("No");
        }

    }

    public void modify() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = sc.nextInt();
        Iterator<Passenger> it = list.iterator();
        Passenger passengerSearch;
        int cnt = 0;
        while (it.hasNext()) {
            passengerSearch = it.next();
            if (id == passengerSearch.getId()) {
                System.out.println("Found new passenger");
                cnt++;
                list.remove(passengerSearch);
                System.out.println("Enter new name: ");
                String name = sc.nextLine();
                System.out.println("Enter new Address: ");
                String address = sc.nextLine();
                System.out.println("Enter new Phone: ");
                String phone = sc.nextLine();
                System.out.println("Enter new Date: ");
                String date = sc.nextLine();
                passengerSearch.setId((int) System.currentTimeMillis());
                passengerSearch.setPassengerName(name);
                passengerSearch.setDate(date);
                passengerSearch.setAddress(address);
                passengerSearch.setPhone(phone);
                list.add(passengerSearch);
            }
        }
        if (cnt == 0) {
            System.out.println("Not Found passenger");
        }

    }

    public void getList() {
        Iterator<Passenger> it = list.iterator();

        while (it.hasNext()) {

            Passenger passenger = it.next();
            System.out.println("ID: " + passenger.getId());
            System.out.println("Name: " + passenger.getPassengerName());
            System.out.println("Address: " + passenger.getAddress());
            System.out.println("Phone: " + passenger.getPhone());
            System.out.println("Date: " + passenger.getDate());
        }
        if (it.hasNext() == false) {
            System.out.println("End list");
        }

    }

    public void exit() {

    }
}