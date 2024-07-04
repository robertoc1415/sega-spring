package com.example.segaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SegaSpringApplication {

    @GetMapping("/message")
    public String message(){
        return  "Prueba sega spring";
    }

    public static void main(String[] args) {
        SpringApplication.run(SegaSpringApplication.class, args);
    }

}
