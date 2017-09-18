/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

/**
 *
 * @author ADMIN-PC
 */
public class Passenger {

    private int id;
    private String passengerName;
    private String Address;
    private String Phone;
    private String Date;

    public Passenger() {
    }

    public Passenger(int id, String passengerName, String Address, String Phone, String Date) {
        this.id = id;
        this.passengerName = passengerName;
        this.Address = Address;
        this.Phone = Phone;
        this.Date = Date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

}