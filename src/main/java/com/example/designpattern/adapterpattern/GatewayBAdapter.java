package com.example.designpattern.adapterpattern;

public class GatewayBAdapter implements PaymentGateway {
    private GatewayB gatewayB;

    public GatewayBAdapter(GatewayB gatewayB) {
        this.gatewayB = gatewayB;
    }

    @Override
    public void processPayment(double amount) {
        gatewayB.charge(amount);
    }
}
