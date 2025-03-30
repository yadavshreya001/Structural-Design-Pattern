package com.example.designpattern.adapterpattern;

/**
 * Adapter class that makes GatewayB compatible with PaymentGateway.
 * It implements PaymentGateway and internally calls GatewayB's charge() method.
 */
public class GatewayBAdapter implements PaymentGateway {

    private GatewayB gatewayB;   // Composition: Using GatewayB instance

    // Constructor: Takes a GatewayB object
    public GatewayBAdapter(GatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    @Override
    public void processPayment(double amount) {
        // Adapting GatewayB's charge() method to processPayment()
        gatewayB.charge(amount);
    }
}
