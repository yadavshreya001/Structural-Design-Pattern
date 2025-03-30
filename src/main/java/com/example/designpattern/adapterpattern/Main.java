package com.example.designpattern.adapterpattern;

/**
 * Main class to test the Adapter Pattern implementation.
 */
public class Main {
    public static void main(String[] args) {
        // Using GatewayA, which already follows PaymentGateway
        PaymentGateway gateway1 = new GatewayA();  // Direct implementation


        // Using GatewayB through the adapter
        PaymentGateway gateway2 = new GatewayBAdapter(new GatewayB());  // Using Adapter

        double amount = 100.0;

        // Process payments using both gateways
        gateway1.processPayment(amount);   // Direct call
        gateway2.processPayment(amount);  // Indirect call through Adapter
    }
}
