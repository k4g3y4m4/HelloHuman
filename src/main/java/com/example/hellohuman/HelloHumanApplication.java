package com.example.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloHumanApplication {

public static void main(String[] args) {
    SpringApplication.run(HelloHumanApplication.class, args);
}

}
