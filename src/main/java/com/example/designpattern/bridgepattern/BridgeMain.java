package com.example.designpattern.bridgepattern;

import com.example.designpattern.bridgepattern.device.Laptop;
import com.example.designpattern.bridgepattern.device.SmartTV;
import com.example.designpattern.bridgepattern.device.Smartphone;
import com.example.designpattern.bridgepattern.internet.Broadband;
import com.example.designpattern.bridgepattern.internet.MobileData;
import com.example.designpattern.bridgepattern.internet.WiFi;

import java.util.Scanner;

public class BridgeMain {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV(new WiFi());
        Smartphone smartphone = new Smartphone(new MobileData());
        Laptop laptop = new Laptop(new Broadband());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a device to connect to the internet:");
        System.out.println("1. SmartTV");
        System.out.println("2. Smartphone");
        System.out.println("3. Laptop");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> smartTV.connectToInternet();
            case 2 -> smartphone.connectToInternet();
            case 3 -> laptop.connectToInternet();
            default -> System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
