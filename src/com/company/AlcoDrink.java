package com.company;

/**
 * Created by yokaphone on 10/14/17.
 */
public class AlcoDrink {
    private final String name = "";
    private float price = 0;
    private final AlcoCategory category = null;
    private float amount = 0;
    private final String alcoLower = "";
    private int quantity = 0;

    public AlcoDrink(String name, float price, AlcoCategory category, float amount, String alcoLower, int quantity){

        name = this.name;
        price = this.price;
        category = this.category;
        amount = this.amount;
        alcoLower = this.alcoLower;
        quantity = this.quantity;


    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public AlcoCategory getCategory() {
        return category;
    }

    public float getAmount() {
        return amount;
    }

    public String getAlcoLower() {
        return alcoLower;
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
