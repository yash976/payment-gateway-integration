package com.payment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @PostMapping("/test")
    public String test() {
        return "Payment API Working";
    }
}
