package me.harshu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public String setAllCustomers(){
        return "Hello App Is Working";
    }
}
