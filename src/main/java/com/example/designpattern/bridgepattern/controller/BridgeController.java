package com.example.designpattern.bridgepattern.controller;

import com.example.designpattern.bridgepattern.device.Laptop;
import com.example.designpattern.bridgepattern.device.SmartTV;
import com.example.designpattern.bridgepattern.device.Smartphone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internet")
public class BridgeController {

    @Autowired
    private SmartTV smartTV;

    @Autowired
    private Smartphone smartphone;

    @Autowired
    private Laptop laptop;

    @GetMapping("/tv")
    public String connectTVWithInternet() {
        smartTV.connectToInternet();
        return "SmartTV Connected!";
    }

    @GetMapping("/phone")
    public String connectPhoneWithInternet() {
        smartphone.connectToInternet();
        return "Smartphone Connected!";
    }

    @GetMapping("/laptop")
    public String connectLaptopWithInternet() {
        laptop.connectToInternet();
        return "Laptop Connected!";
    }
}