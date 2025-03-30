package com.example.designpattern.adapterpattern;

public class GatewayA implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment with GatewayA: $" + amount);
    }
}
