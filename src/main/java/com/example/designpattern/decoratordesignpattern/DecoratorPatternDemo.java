package com.example.designpattern.decoratordesignpattern;

// Demonstrate the Decorator Pattern
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        //Start with a Basic Coffee
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Add Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Add Sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());

        // Add More Milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> ₹" + coffee.getCost());
    }
}