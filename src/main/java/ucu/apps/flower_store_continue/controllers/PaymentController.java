package ucu.apps.flower_store_continue.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/available")
    public List<String> getAvailablePayments() {
        return List.of("Credit Card","PayPal");
    }
}