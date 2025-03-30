package com.example.designpattern.decoratordesignpattern;

public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 50.0; // Base price of coffee
    }
}