package com.company;

/**
 * Created by yokaphone on 10/15/17.
 */
public class NonAlcDrink extends Drink{

    private final WaterCategory waterCategory = null;
    private String composition = "";



    public NonAlcDrink(String name, double price,WaterCategory waterCategory, double amount, String composition, int quantity){

        super(name, price, amount, quantity);
        waterCategory = this.waterCategory;
        composition = this.composition;
    }

    public WaterCategory getWaterCategory() {
        return waterCategory;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
}
