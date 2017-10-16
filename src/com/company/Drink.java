package com.company;

/**
 * Created by yokaphone on 10/15/17.
 */
public abstract class Drink {
    private final String name = "";
    private double price = 0;
    //private final AlcoCategory category = null;
    private double amount = 0;
    //private final String alcoLower = "";
    private int quantity = 0;

    public Drink(String name, double price, double amount, int quantity){

        name = this.name;
        price = this.price;
        amount = this.amount;
        quantity = this.quantity;


    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
