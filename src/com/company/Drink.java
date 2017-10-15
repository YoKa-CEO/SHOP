package com.company;

/**
 * Created by yokaphone on 10/15/17.
 */
public abstract class Drink {
    private final String name = "";
    private float price = 0;
    //private final AlcoCategory category = null;
    private float amount = 0;
    //private final String alcoLower = "";
    private int quantity = 0;

    public Drink(String name, float price, float amount, int quantity){

        name = this.name;
        price = this.price;
        amount = this.amount;
        quantity = this.quantity;


    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getAmount() {
        return amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
