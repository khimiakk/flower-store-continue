package ucu.apps.flower_store_continue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FlowerStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }
}
