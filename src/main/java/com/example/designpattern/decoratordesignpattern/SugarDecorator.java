package com.example.designpattern.decoratordesignpattern;

//Create another concrete decorator (SugarDecorator)
public class SugarDecorator extends CoffeeDecorator {

   // Constructor: Wraps a Coffee object
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";  // Appends "Sugar" to the description
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;   // Adds ₹5 to the cost
    }
}
