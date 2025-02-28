package com.example.bookstore;

import reactor.core.publisher.Mono;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class BookstoreApplication {

    @RequestMapping(value = "/recommended")
    public Mono<String> readingList() {
        return Mono.just("Spring in Action, Cloud Native Java, Learning Spring Boot");
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }
}