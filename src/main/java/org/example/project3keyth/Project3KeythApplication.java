package org.example.project3keyth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class Project3KeythApplication {

    public static void main(String[] args) {
        SpringApplication.run(Project3KeythApplication.class, args);
    }
    @GetMapping("/")
    public String hello() {
        return String.format("Welcome to my web Application! I am delighted to have you here. Explore my application and discover everything I have to offer.\n" +
                "My name is Keyth Anahi Yaguana");
    }
}
