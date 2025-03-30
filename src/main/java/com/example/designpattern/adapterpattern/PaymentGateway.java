package com.example.designpattern.adapterpattern;

/**
 * Standard interface for payment processing.
 * Any payment gateway should implement this interface.
 */
public interface PaymentGateway {
    void processPayment(double amount);
}
