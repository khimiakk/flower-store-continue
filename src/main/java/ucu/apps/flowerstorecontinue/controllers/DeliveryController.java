package ucu.apps.flowerstorecontinue.controllers; 

import java.util.List; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController 
@RequestMapping("/delivery") 
public class DeliveryController {

    @GetMapping("/available") 
    public List<String> getDeliveryOptions() { 
        return List.of("Post", "DHL"); 
    } 
}