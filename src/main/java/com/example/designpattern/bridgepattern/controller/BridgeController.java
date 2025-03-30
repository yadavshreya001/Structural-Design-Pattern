package com.example.designpattern.bridgepattern.controller;

import com.example.designpattern.bridgepattern.device.Laptop;
import com.example.designpattern.bridgepattern.device.SmartTV;
import com.example.designpattern.bridgepattern.device.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * BridgeController exposes endpoints to connect different devices to the internet.
 */
@RestController
@RequestMapping("/internet")
public class BridgeController {

    @Autowired
    private SmartTV smartTV;

    @Autowired
    private Smartphone smartphone;

    @Autowired
    private Laptop laptop;

    /**
     * Connect SmartTV to the internet.
     * URL: GET /internet/tv   http://localhost:8080/internet/tv
     */
    @GetMapping("/tv")
    public String connectTVWithInternet() {
        smartTV.connectToInternet();  // SmartTV will use WiFi
        return "SmartTV Connected!";
    }

    /**
     * Connect Smartphone to the internet.
     * URL: GET /internet/phone    http://localhost:8080/internet/phone
     */
    @GetMapping("/phone")
    public String connectPhoneWithInternet() {
        smartphone.connectToInternet();  // Smartphone will use Mobile Data
        return "Smartphone Connected!";
    }

    /**
     * Connect Laptop to the internet.
     * URL: GET /internet/laptop    http://localhost:8080/internet/laptop
     */
    @GetMapping("/laptop")
    public String connectLaptopWithInternet() {
        laptop.connectToInternet(); // Laptop will use Broadband
        return "Laptop Connected!";
    }
}