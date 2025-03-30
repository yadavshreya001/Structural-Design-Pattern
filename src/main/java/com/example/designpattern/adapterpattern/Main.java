package com.example.designpattern.adapterpattern;

public class Main {
    public static void main(String[] args) {
        PaymentGateway gateway1 = new GatewayA();  // Direct implementation
        PaymentGateway gateway2 = new GatewayBAdapter(new GatewayB());  // Using Adapter

        double amount = 100.0;

        gateway1.processPayment(amount);
        gateway2.processPayment(amount);
    }
}
