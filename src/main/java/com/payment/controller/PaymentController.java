package com.payment.controller;

import com.payment.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create-order")
    public String createOrder(@RequestParam int amount) throws Exception {
        return paymentService.createOrder(amount);
    }
}
