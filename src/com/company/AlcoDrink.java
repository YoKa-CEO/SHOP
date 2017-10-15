package com.company;

/**
 * Created by yokaphone on 10/14/17.
 */
public class AlcoDrink extends Drink{
    private final AlcoCategory category = null;
    private final String alcoLower = "";

    public AlcoDrink(String name, float price, AlcoCategory category, float amount, String alcoLower, int quantity){

        super(name, price, amount, quantity);
        category = this.category;
        alcoLower = this.alcoLower;


    }

    public AlcoCategory getCategory() {
        return category;
    }

    public String getAlcoLower() {
        return alcoLower;
    }
}
