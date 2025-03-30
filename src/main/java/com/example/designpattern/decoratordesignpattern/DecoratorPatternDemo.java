package com.example.designpattern.decoratordesignpattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
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